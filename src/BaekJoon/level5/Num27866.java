package BaekJoon.level5;

import java.util.Scanner;

public class Num27866 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int idx = sc.nextInt();
        char result = input.charAt(idx-1);
        System.out.println(result);
    }
}
