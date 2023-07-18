package BaekJoon.level3;

import java.util.Scanner;

public class Num8393 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        short n = Short.parseShort(sc.next());
        int result = 0;
        for( short i = 1 ; i <= n; i ++){

            result += i;

        }
        System.out.println(result);
    }
}
