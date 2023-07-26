package BaekJoon.level6;

import java.util.Scanner;

public class Num3003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] white = {1,1,2,2,2,8};
        String [] array = sc.nextLine().split(" ");
        String result = "";
        for(int i = 0 ; i < 6 ; i++){

            int answer = white[i] - Integer.parseInt(array[i]);
            result += answer+" ";
        }
        System.out.println(result);

    }
}
