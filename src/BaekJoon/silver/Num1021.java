package BaekJoon.silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num1021 {
//
//    지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.
//
//    지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.
//
//    첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
//    왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
//    오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
//    큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.)
//    이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 큐의 크기 N과 뽑아내려고 하는 수의 개수 M이 주어진다. N은 50보다 작거나 같은 자연수이고, M은 N보다 작거나 같은 자연수이다.
//    둘째 줄에는 지민이가 뽑아내려고 하는 수의 위치가 순서대로 주어진다. 위치는 1보다 크거나 같고, N보다 작거나 같은 자연수이다.


    // 이 문제를 해석하자면 다음과 같다. 큐의 인덱스 0과 큐의 길이 -1 의 인덱스는 서로간에 밀리는 것이 가능하다.
    // 맵의 포탈처럼 양방향이라는 것이다.
    // 그렇다면 뽑아내야하는 횟수는 정해져있기 때문에
    // 1. 2, 3번 연산을 통해서 위치를 조정하던지
    // 2. 1번으로 뽑아내면서 바뀐 위치를 통해 또 뽑아내는 수 밖에없다.

    // 우선 뽑아내고자 하는 위치가 1이면 무조건 뽑아내야한다. 굳이 거기서 더 효율적인 방법이 있지는 않다.
    // 여기서 2번연산을 수행했냐 3번연산을 수행햇느냐는 중점적으로 보지 않는다.
    // 예외적인 상황 인덱스0과 제일 끝에 뽑아내야하는 수가 동시에 존재한다했을 떄 1번에 있는걸 뽑아내고 끝에 잇는 걸 3번으로 뒤로 보낸후 뽑아내던
    // 3번으로 뒤로 먼저보내고 연속해서 두번 뽑아내던 3번연산이 수행되는건 1회로서 동일하다.

    //ㄱ그래서 구현해야하는 로직은
    // 1. 위치가 1번에 오면 무조건 1번연산으로 뽑아낸다 -> 이떄 인덱스 위치를 저장하고 더해주고 빼주는 과정은 처음 초기화와 로직을 통해 구현
    // 2. 뽑아냇으니 다시 인덱스를 전체적으로 앞으로 한칸 밀어준다. 이떄는 양방향으로 움직이는 경우가 없으니 괜찮다.
    // 3. 여기서 1번에 가까운 방법을 구해야하는데 2번으로 가는 것이 빠를지 3번으로 가는것이 빠를지 구해야한다
    // 다음 원소의 위치는 생각할 필요없다. 어차피 다음원소는 현재 원소가 1번 2번 과정을 거치면서 다시 3번 과정을 거치면 2 번을 수행하든
    // 3번을 수행하든 할 것이기 때문이다. 즉 위 1~3번의 로직을 반복수행시키면 알아서 가장 효율적으로 움직일 것이다.


    //어쩃든 횟수를 줄이는 가장 확실한 방법은 1번을 수행하면서 밀리면서 연ㄱ속적으로 계속 뽑아내는 것이다.
    // 23번을 절대 먼저수행하면 안된다.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int queue_size = sc.nextInt(); // 전체 큐의 길이
        int m = sc.nextInt(); // 뽑아내고자 하는 수의 개수. 즉 1번 연산은 num_amount만큼 실행할 수 있다.
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0; // 2, 3번 연산을 수행한 횟수를 센다.


        for (int i = 0; i < m; i++) {
            arrayList.add(sc.nextInt()); // 배열 초기화
        }




        while (arrayList.size() != 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                int moving = 0;
                boolean direction = true; // 왼쪽으로 인덱스를 이동시킬지 오른쪽으로 이동시킬지 결정.
                if (arrayList.get(i) == 1) {
                    arrayList.remove(i); //

                    queue_size -= 1;
                    moving = 1;
                    direction = true;
                    // 현재 arraylist.get(i)와 1의 차가 큰지 혹은 arraylist.get(i)와 arraylist.size+1와의 차이가 큰지 비교하고
                    // 전자의 경우 3번을 실핼하고 후자의 경우 2번을 실행한다.
                } else if (arrayList.get(i) - 1 <= queue_size + 1 - arrayList.get(i)) { // 2번 수행, 왼쪽으로 이동/
                    // 아니면 조건식으로 queue size를 쓰고 queue size를 1씩 빼줘 도된다.

                    moving = arrayList.get(i) - 1;
                    count += moving; // 그 거리만큼 횟수를 더해줘야한다.
//                    arrayList.set(i, 1);
                    direction = true;

                } else if (arrayList.get(i) - 1 > queue_size + 1 - arrayList.get(i)) { // 3번수행. 오른쪽으로 이동.

                    moving = queue_size + 1 - arrayList.get(i) ;
                    count += queue_size + 1 - arrayList.get(i);
//                    arrayList.set(i, 1);
                    direction = false;

                }

                if (moving != 0) {
                    for (int j = 0; j < arrayList.size(); j++) { // 비효율적이긴 하지만.. 우선 생각나는 방법으로.
                        if(direction){

                            if(arrayList.get(j) - moving < 1){
                                int new_idx = arrayList.get(j) - moving + queue_size;; // 예를들어 기본 인덱스가 8이고
                                // 좌측 이동거리가 3이라 11이고 queue길이가 10일경우 11-10 = 1로 요소의 처음으로 보낸다는 것.
                                arrayList.set(j,new_idx);


                            }else{
                                arrayList.set(j, arrayList.get(j) - moving); // 인덱스를 한칸씩 앞으로 당겨준다.

                            }

                        }else{
                            if(arrayList.get(j) + moving > queue_size){
                                int new_idx = arrayList.get(j) + moving - queue_size; // 예를들어 기본 인덱스가 8이고
                                // 좌측 이동거리가 3이라 11이고 queue길이가 10일경우 11-10 = 1로 요소의 처음으로 보낸다는 것.
                                arrayList.set(j,new_idx);

                            }else{
                                arrayList.set(j,arrayList.get(j)+moving);

                            }
                        }

                    }
                }
                break;


            }
        }
        System.out.println(count);
    }


}

// 10 3
// 2 9 5
// 1 8 4   count =1
//제거  7 3 // queue size = 9
// 오른쪽으로 3칸이동 1, 6 count = 4;
// 제거 5 count =4  queuesize = 8;
// 왼쪽으로 4칸이동. count = 8 제거.

// 풀고보니 안써도 되는 for문 조건을 썻다. 어차피 한번만 비교하고 나갈 for문인데
// 쓰다보니 조건 맞추기에 급급해져가지고..