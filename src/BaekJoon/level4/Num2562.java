package BaekJoon.level4;

import java.util.Scanner;

public class Num2562 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        byte first_num =  sc.nextByte();
        byte max = first_num;
        byte idx = 1;
        for(byte i = 2 ; i <= 9 ; i++){

            byte compare_num = sc.nextByte();
            if(compare_num > max){
                max = compare_num;
                idx = i;
            }

        }
        System.out.println(max);
        System.out.println(idx);

    }
}
