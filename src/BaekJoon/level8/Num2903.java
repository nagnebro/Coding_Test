package BaekJoon.level8;

import java.util.Scanner;

public class Num2903 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double square_count = 0;
        int square_size = 0; // nxn의 형태로 나타내기 위한 사각형의 사이즈.
        int dot_count = 0;


        // dot_count에 저장되는 점의 개수를 계속해서 더하는 식으로 로직을 구현한다.

        // 점을 찍는 것을 크게 3가지로 본다
        // 바깥 변에 찍히는 점
        // 안쪽 점 간에 찍히는 점
        // 정사각형의 중앙에 찍히는 점

        // 그냥 점의 개수는 (한변의 사각형의 개수+1) 의 제곱이다.
        // 이떄 사각혀으이 개수는 n번에따라 *4를 거치게 된다.
        // 1번 거치게 되면 사각형의 개수는 4개가 되고 이때 점의 개수는 2x2인 사각형이니
        // (2+1)의 제곱이 ㄴ9개이다.
        square_count = Math.pow(4,n);
        square_size = (int)Math.sqrt(square_count);
        dot_count = (square_size+1) * (square_size+1);

        System.out.println(dot_count);

    }
}
