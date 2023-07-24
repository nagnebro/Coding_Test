package BaekJoon.level5;

import java.util.Scanner;

public class Num2908 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] array = sc.nextLine().split(" ");
        String first_num = array[0];
        String second_num = array[1];
        String tmp = "";
        String answer = "";

        for (int i = 2 ; i >= 0 ; i --){

            if( first_num.charAt(i)!= second_num.charAt(i)){
                tmp = first_num.charAt(i) > second_num.charAt(i) ?  first_num : second_num;
                break;
            }

        }

        for(int j = 2 ; j >= 0 ; j--){

            answer += tmp.charAt(j);
        }
        System.out.println(answer);
    }
}
