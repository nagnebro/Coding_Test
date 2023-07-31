package BaekJoon.level8;

import java.util.Scanner;

public class Num2292 {

    public static void main(String[] args) {

        // 이 문제는 벌집의 이동거리간의 최소 거리를 구해야한다
        // 즉 벌집의 범위를 알아야 다음 칸으로 넘어갈 수 있을지 알 수 있다
        // 예를들어 1을 제외하고 2~7까지는 첫번째방
        // 8~19까지 2번째방이다.
        // 그리고 그 범위에 해당할 떄 어떤 방법으로 가는게 가장 빠른지를 알아야하는데
        // 이건 크게 문제가 되지않는다. 어떤 방향에 있는 벌집이 살짝 대각선으로도 움직일 수 있는 구조로 돼있기 떄문에
        // 무조건 범위간의 이동횟수만 구하면 된다.

        // 이 벌집의 형성 규칙은 다음과 같은 특징이 있다.
        // 2~7 8~19 ,  20~37 38~61  각 범위의 숫자를 구하면 다음과 같다
        // 각 범위 최대값-최소값 +1 이 해당 범위의 방의 개수이다
        // 6, 12, 18, 24... 방의 개수는 6의 배수로 개수가 늘어나는 형태를 띄고 있다.
        // 따라서 전체방의 개수+(n*6) 여기서 n은 몇번쨰 범위인지를 뜻한다.  의 형태로 방의 개수가 늘어난다.
        // 여기서 나온 규칙성에 의해 각 범위의 방의 끝번호는 6의 배수 +1의 형태를 띤다(처음 시작이 1번방이기 때문)

        // for문을 돌리기에는 주어지는 변수의 값이 너무 크기 때문에 어떠한 수식을 구하고자 한다.


        Scanner sc = new Scanner(System.in);
        int room_num = sc.nextInt();
        int sum_num = 0; // 6의 배수로 증가하는 더해야하는 변수
        int total_room = 1; // 처음 1번방의 개수를 포함해야하기 때문에 방의개수는 1
        int count = 1; // 처음 1번방의 개수도 거리로 쳐야하기때문에 1
        while(total_room < room_num){

            sum_num += 6;
            total_room += sum_num;
            count++;
        }

        System.out.println(count);
    }
}
