package BaekJoon.level3;

import java.util.Scanner;
public class Num25304 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total_price = Integer.parseInt(sc.next());
        int line_count = Integer.parseInt(sc.next());
        int result = 0;

        for(int i = 0 ; i<line_count ; i++){

            int price = Integer.parseInt(sc.next());
            int amount = Integer.parseInt(sc.next());
            result += price*amount;

        }

        String answer = result == total_price ? "Yes" : "No";
        System.out.print(answer);

    }
}
