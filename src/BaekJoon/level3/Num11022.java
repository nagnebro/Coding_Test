package BaekJoon.level3;

import java.util.Scanner;

public class Num11022 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int line_count = Integer.parseInt(sc.nextLine());
        // next()로 받아버리면 개행문자 \n이 이 다음의 nextLine()으로 넘어가게 된다.

        for(int i = 1; i <= line_count ; i++){

            String [] numbers = sc.nextLine().split(" ");

            byte num1 = Byte.parseByte(numbers[0]);
            byte num2 = Byte.parseByte(numbers[1]);

            System.out.printf("Case #%d: %d + %d = %d\n",i,num1,num2,num1+num2);
        }
    }
}
