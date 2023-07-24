package BaekJoon.level4;

import java.util.Scanner;

public class Num10813 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] first_line = sc.nextLine().split(" ");
        byte basket_amount = Byte.parseByte(first_line[0]); // 바구니 배열의 length가 될 값.
        byte line_amount = Byte.parseByte(first_line[1]); // for문의 반복횟수가 될 값.
        byte [] basket_array = new byte[basket_amount]; // 초기값 0으로 초기화돼잇을거니 바구니에 든 공의 값들을 처음 초기화해줘야한다.
        String [] change_info;
        byte first_basket, second_basket;
        byte tmp; // 바구니간의 값을 옮기기 위해 임시로 저장할 변수공간.
        String answer = ""; // 답안을 저장하기 위한 String타입의 ㅂ녀수.

        for(byte l = 1; l <= basket_amount ; l++){
            basket_array[l-1] = l; // 0번인덱스의 바구니(바구니 1번)에는 1번공을 집어넣는다.
        }


        for ( byte i = 0 ; i < line_amount ; i++){

            change_info = sc.nextLine().split(" ");
            first_basket = (byte)(Byte.parseByte(change_info[0])-1); //  실제 idx에 접근하기 위해서는 1이 빠진 값으로 설정해야한다.
            second_basket = (byte)(Byte.parseByte(change_info[1])-1); //

            tmp = basket_array[first_basket];
            basket_array[first_basket] = basket_array[second_basket];
            basket_array[second_basket] = tmp;

        }

        for(byte j = 0; j < basket_amount ; j++){
            answer += basket_array[j] + " ";
        }

        System.out.println(answer);

    }
}
