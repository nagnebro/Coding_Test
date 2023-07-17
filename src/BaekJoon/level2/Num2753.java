package BaekJoon.level2;

import java.util.Scanner;
public class Num2753 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.next());

        int result = (year%4==0) && (!(year%100==0) || year%400 == 0) ? 1 : 0;

        System.out.println(result);

    }
}
