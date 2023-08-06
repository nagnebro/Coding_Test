package BaekJoon.level12;

import java.util.Scanner;

public class Num19532 {

    public static void main(String[] args) {



        // d연립방정식에 함정이 있다
        // 하나의 식으로만 해를 구하려고 하지마라.

        // 연립방정식을 식으로 세워 x y를 구하고자하면 다음과 같다
        // (a-d)x + (b-e) y = c-f;
        // 그럼이떄 어떤 상수값으로 나타낼 수 있을 것이다
        // Ax + By = C이다.
        // 그리고 경우의수는 2천 x 2천이다 x와 y에 모든 값을 대입해서 풀어야한다.
        // 계산해보면 4백만번까지 돌아야한다.

        // 왜인지는 모르겠지만 연립방성식에서 하나의 미지수를 없애는게 아니면 서로 다른식을 곱해서 빼면 미지수의 값이 달라지게 된다.
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        for(int x = -999 ; x <= 999 ; x++){

            for(int y = -999; y <= 999 ; y++){
                if((a*x + b* y ==c)&&(d*x + e*y == f )){
                    System.out.println(String.format("%d %d",x,y));
                }
            }
        }




    }
}
