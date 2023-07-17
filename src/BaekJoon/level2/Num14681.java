package BaekJoon.level2;

import java.util.Scanner;
public class Num14681 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        int result = x>0 && y>0 ? 1 : x<0 && y>0 ? 2 :  x<0 && y<0 ? 3 : x>0 && y<0 ? 4 : -1;

        System.out.println(result);

    }
}
