package BaekJoon.level5;

import java.util.Scanner;

public class Num10809 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        char ascii = 'a';

        for (int i = 'a'; i <= 'y'; i++) {

            if (str.indexOf(i) != -1) {

                result += str.indexOf(i) + " ";
            } else {
                result += -1 + " ";
            }
        }
        System.out.println(result);

    }
}


