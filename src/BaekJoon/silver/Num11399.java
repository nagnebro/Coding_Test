package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num11399 {

    public static void main(String[] args) {

        // 스케줄링 알고리즘과 관련이 있는 문제인듯하다
        // 메모리나 cpu의 할당을 어떤 식으로 할 것인지. 고정분할로 할 것인지
        // 혹은 가변분할로 할당할 것인지. 여기서는 가변분할로 우선순위를 정하는 알고리즘? 이라고 생각하면 될듯하다.

        // p1 p2 p3 p4 p5
        // 3 1 4 3 2
        // 라고 하자.
        // 이떄 순서를 p2 p5 p1 p4 p3 혹은 p4 p1 순서가 바뀌어도된다
        // 즉 개인의 측면에서 바라봤을때는 순서를 어떻게 서도 관계없으나
        // 전체적인 효율 측면에서 바라봤을 때는 오래 걸리는 사람이 나중에 하는편이 훨씬 효율적인 것이다.
        // 따라서 배열을 오름차순으로 정렬하고 그 합을 다 구하면 된다.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int sum = 0 ;
        for(int i = 0 ; i < n ; i ++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for(int i = 0 ; i < n ; i++){ // 전체 번호를 한칸씩 옮겨준다.

            for(int j = 0 ; j <= i ; j++){ // 본인을 포함한 자기 앞의 사람수까지의 시간을 더한다. 즉 여기서 i는 현재 돈을 뽑는 사람이고
                // j번 만큼 더해야 합을 구할 수 있다.

                sum += array[j];

            }

        }
        System.out.println(sum);
    }
}
