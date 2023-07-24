package BaekJoon.level4;

import java.util.Arrays;
import java.util.Scanner;

public class Num10807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte num_count = Byte.parseByte(sc.nextLine()); // 얘 대신 array.length를 이용하면 풀 수 있긴함.
        String [] numbers = sc.nextLine().split(" ");
        byte answer_number = Byte.parseByte(sc.next());
        byte result = 0;

        for(int i = 0; i < numbers.length; i++){


            if(answer_number == Byte.parseByte(numbers[i])){

                result +=1 ;

            }
        }

        System.out.print(result);
    }
}


