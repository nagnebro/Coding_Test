package BaekJoon.level8;

import java.util.Scanner;

public class Num2930 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int line_dot = 2; // 초기 한변의 점의 개수
        int dot_count = 4; // 저장될 점의 개수
        int square_count = 1;

        // dot_count에 저장되는 점의 개수를 계속해서 더하는 식으로 로직을 구현한다.

        // 점을 찍는 것을 크게 3가지로 본다
        // 바깥 변에 찍히는 점
        // 안쪽 점 간에 찍히는 점
        // 정사각형의 중앙에 찍히는 점
        for(int i = 0 ; i < n ; i++){

            if(i==0){
                dot_count-=1;
            }

            dot_count += (line_dot -1) * 4;// 바깥변에 찍히는 점
            dot_count += square_count;// 안쪽 점 간에 찍히는 점 -> 이 개수는 현재 사각형의 개수와 같다 . 사각혀으이 개수는 기존 사각형의 개수 * 4가 된다.
            dot_count += square_count;// 정사각형 중앙에 찍히는 점 -> 이 역시도 현재 사각형의 개수와 같다.

            square_count*= 4;
            line_dot++;

        }
        System.out.println(dot_count);

    }
}
