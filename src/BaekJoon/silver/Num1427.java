package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1427 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 1. charAt으로 짜르고 Integer로 파싱시킨 후 배열에 저장하고 문자열로 한번에 합쳐서 출력하는게 빠를지

        // 1.
        int [] array = new int[str.length()];

        for(int i = 0 ; i < str.length() ; i++){

            array[i] = Integer.parseInt(str.charAt(i)+"");
        }

        Arrays.sort(array);
        String result = "";

        for(int i = array.length-1 ; i >= 0; i--){
            result += array[i];
        }
        System.out.println(result);


    }
}
