package BaekJoon.level6;

import java.util.Scanner;

public class Num2444 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();

        for(int i = 1 ; i<= n; i++){


            for(int j = 1; j<= n-i ; j++){

                System.out.print(" ");
            }

            for(int k = 1; k<= (i*2)-1 ; k++){

                System.out.print("*");
            }
            System.out.println();

        }

        for(int i = n-1 ; i>= 1; i--){


            for(int j = n; j>= i+1 ; j--){

                System.out.print(" ");
            }

            for(int k = 1; k<= (i*2)-1 ; k++){

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
