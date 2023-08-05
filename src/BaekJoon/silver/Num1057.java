package BaekJoon.silver;

import java.util.Scanner;

public class Num1057 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 참가자의수
        int count = 0;
        int kim = sc.nextInt(); // 김지민의 1라운드 배정 번호
        int im = sc.nextInt(); // 임한수 1라운드 배정 번호
        int min = kim > im ? 1:0; // kim과 im중 어떤 수가 더 작은지 확인하기 위한 값.
        // 이 대소관계는 라운드가 끝날떄가지 지속될 것이다.

        // while(n)안에서 count = 0으류ㅗ 초기화시켜놓고 while문이 도는 맨처음에 ++시킨다.
        // n의 값은 /2를 계속 시킨다. 그러나 n이 홀수일 경우에는 나머지 주자는 그냥 부전승으로 올라가기 떄문에
        // 2의 제곱이 아닌 이상 n은 계속 홀수와 짝수를 반복할것이다.
        // 따라서 n/2 + n%2를 해주면된다. 짝수일 경우 n%2는 0이므로 n/2만 n이 되;고
        // 홀수일경우 n%2는 1이므로 n/2에 n %2 = 1이므로 n/2 + 1이 된다.
        // 이후에 얘네번호에 그 라운드의 수에 /2를 하고 그 나머지가 0이 아닐경우, 즉 그 사람의 번호가 홀수일 경우에는 +1을 해준다.
        // 그렇게 반복하다가
        // 테스틐 케이스에서는 \김지민의 번호가 무조건 높지만 임한수의 번호가 더 높을수도 있다.
        // 따라서 두 번호를 단순히 +1의 관계로 비교하기에는 무리가 있다.
        // 두 사람의 번호중 더 작은 번호가 홀수이면서 그 수보다 나머지 한 사람의 번호가 1이 더 클떄 연속해서 붙어있다고 볼수 있다.
        // ex) 3 4일경우 작은수는 3이고 여기 1을 더하면 4. 둘은 맞붙는다
        // 그러나 4 5일경우 작은수는 4, 여기서 1을 더하면 5. 서로 붙지 않는 경우이다.

        // 대결하지 않는 경우의 수..? 가 있을 수 있나.
        //
        while (n >= 2) {
            count ++;

            if(min == 1 && kim%2 ==0 && im+1 == kim) { // kim이 더 큰 값이면서 짝수일떄

                break;

            }else if(min ==0 && im%2 == 0 && kim + 1 == im){ // im이 더 큰 값이면서 짝수 일때.
                break;
            }
            kim = kim % 2== 0 ? kim/2 : kim/2 + 1; // 홀수일 경우, 예를들어 7번 일경우 다음라운드에서는 4번이된다 따라서 2로 나눈후 1을 더해줘야한다.
            // 짝수일경우 8번일거고 그때는 몫값 그대로 가지고 간다.
            im = im % 2== 0 ? im/2 : im/2 + 1;

            n = n/2 + n%2; // 홀수일경우를 대비해 n%2를 더해준다.

        }

        System.out.println(count);

    }
}