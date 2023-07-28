package BaekJoon.level7;

import java.util.Arrays;
import java.util.Scanner;

public class Num2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        String idx = "";

        for (int i = 0; i < 9; i++) {


            for (int j = 0; j < 9; j++) {
                int input = sc.nextInt();
                if (max <= input) { // 모두 0만들어왔을떄 인덱스번호를 저장하지 않기 떄문에 그에 대한 예외처리로 같거나 같을 조건으로 설정한다.
                    max = input;
                    idx = String.format("%d %d",i+1,j+1);
                }
            }
        }

        System.out.println(max);
        System.out.println(idx);


    }
}
