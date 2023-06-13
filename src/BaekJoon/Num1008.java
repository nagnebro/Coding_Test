package BaekJoon;

import java.util.Scanner;

class Num1008{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%.12f",(double)num1/num2);

    }
}