package BaekJoon.level3;

import java.util.Scanner;
public class Num25314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        short n = Short.parseShort(sc.next());

        // 4의 배수 뿐만 아니라 랜덤한 수가 들어온다면 나머지에 대한 +1 처리도 해줘야할 것이다.
        String answer= "int";
        for(int i = 0 ; i < n/4 ; i++){

            answer = "long " + answer;
        }

        System.out.println(answer);

    }
}
