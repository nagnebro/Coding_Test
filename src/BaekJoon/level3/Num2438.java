package BaekJoon.level3;

import java.util.Scanner;

public class Num2438 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte n = Byte.parseByte(sc.next());

        for(int i = 0; i < n ; i++){

            for(int j = 0 ; j<= i ; j++){

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
