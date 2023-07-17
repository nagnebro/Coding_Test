package BaekJoon.level3;

import java.util.Scanner;

public class Num10950 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.next());

        for(int i = 0 ; i < count ; i++){


            int num1 = Integer.parseInt(sc.next());
            int num2 = Integer.parseInt(sc.next());



            // 개행문자 하나 때문에 이 조건문을 하나 작성하는게 너무 비효율적으로 느껴진다..
            if(i == count-1){
                System.out.print(num1+num2);
                return;
            }

            System.out.println(num1+num2);


        }


    }
}
