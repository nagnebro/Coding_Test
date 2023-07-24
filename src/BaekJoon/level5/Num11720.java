package BaekJoon.level5;

import java.util.Scanner;

public class Num11720 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line_count = sc.nextInt();
        char [] array = sc.next().toCharArray();

        int result = 0;
        int ascii = '0';



        for(int i = 0; i < line_count ; i++){
            result += array[i]-ascii;
        }

        System.out.println(result);
    }
}
