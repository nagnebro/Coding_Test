package BaekJoon.level10;

import java.util.Scanner;

public class Num15894 {
    public static void main(String[] args) {


        // 규칙은 매우 단순하다.
        // 맨위쪽부터 n번째 줄까지는 줄마다 실선의 개수는 3개가 추가되는 식이다.
        // 그러나 맨아래쪽 변은 n만큼 추가해야된다.

        Scanner sc= new Scanner(System.in);

        long n =sc.nextInt();
        long result = 0;
        result += n*3;
        result += n;
        System.out.print(result);


    }
}
