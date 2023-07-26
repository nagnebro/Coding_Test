package BaekJoon.level6;

import java.util.Scanner;

public class Num10988 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int length = str.length() % 2 == 0 ? str.length()/2 : str.length()/2 + 1;
        int result = 1;
        for(int i = 0 ; i < length ; i++){

            if((str.charAt(i) != str.charAt(str.length()-1-i))){
                result = 0;
                break;
            }

        }
        System.out.println(result);

    }
}
