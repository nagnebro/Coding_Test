package BaekJoon.level3;

import java.util.Scanner;
public class Num10952 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.next());
        int num2 = Integer.parseInt(sc.next());
        System.out.print(num1+num2);
        while(true){

            num1 = Integer.parseInt(sc.next());
            num2 = Integer.parseInt(sc.next());
            if(num1 != 0 && num2 != 0){
                System.out.println();
                System.out.print(num1+num2);
            }else{
                return;
            }


        }

    }
}
