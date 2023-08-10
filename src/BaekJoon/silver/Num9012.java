package BaekJoon.silver;

import java.util.Scanner;

public class Num9012 {

    public static void main(String[] args) {

        // 괄호가 열리게 되면 열린 만큼 그 갯수를 센다
        // 그리고 닫는 괄호가 나오면 그만큼 열린 괄호를 카운팅한값에서 빼준다
        // 이떄 열린 괄호의 수가 0인데도 닫는 괄호가 나온다면 No를 출력한다.
        // 예외상황을 생각해보자..

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean check = true;

            String line = sc.next();
            int openCount = 0;
            int closeCount = 0;
            for (int j = 0; j < line.length(); j++) {

                if (line.charAt(j) == '(') {
                    openCount++;

                } else if (line.charAt(j) == ')') {
                    if (openCount == 0) {
                        check = false;
                        break;
                    }
                    openCount--;
                }


            }
            if (check && openCount == 0) {
                System.out.println("YES");

            }
            else{ // 닫는 태그가 덜닫혔을 때 예외가 발생한다. ((()) 같은경우 위 조건식을 빠져나올 수 있기 때문이다.
                System.out.println("NO");
            }

        }
    }
}
