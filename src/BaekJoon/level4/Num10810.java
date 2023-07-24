package BaekJoon.level4;

import java.util.Arrays;
import java.util.Scanner;

public class Num10810 {

    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);
        String [] first_line = sc.nextLine().split(" ");
        byte basket_amount = Byte.parseByte(first_line[0]);
        byte line_amount = Byte.parseByte(first_line[1]); // for문의 조건식에 사용될 값
        byte []  basket_array = new byte [basket_amount]; // 바구니의 개수만큼 배열을 생성한다. 초기값은 0을 가지고 있을 것.
        String answer = "";

        // 입력으로 주어지는 바구니의 번호 -1을 해야 바구니 배열의 인덱스로 접근할 수 있다.
        for ( byte i = 0 ; i < line_amount ; i++){

            // 문자열을 split해서 처리하게 되면 배면 정수형으로 parsing해줘야 하고 그 수가 많아지고 라인이 길어질수록 효율이 떨어진다.
            String [] basket_info = sc.nextLine().split(" ");
            byte basket_start = Byte.parseByte(basket_info[0]);
            byte basket_end = Byte.parseByte(basket_info[1]);
            byte ball_num = Byte.parseByte(basket_info[2]);

            for(byte j = basket_start ; j <= basket_end ; j++){ // ex) 1~3번 바구니를 수정한다고 입력값을 받았다면 인덱스는 0~2번 배열의 요소값을 변경한다.


                basket_array[j-1] = ball_num;

            }

        }

        for(int k = 0; k < basket_amount; k++){

            answer += basket_array[k] + " ";
        }

        System.out.println(answer);
    }
}
