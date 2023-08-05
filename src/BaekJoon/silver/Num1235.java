package BaekJoon.silver;

import java.util.Scanner;

public class Num1235 {

    public static void main(String[] args) {


        // 학생들의 번호를 구별할 수 있는 최소자리수 k를 구하여라.
        // k는 즉 문자열을 뒤에서부터 잘라서 비교했을 떄 같은 값이 아닐경우의 문자열의 길이를 뜻한다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  [] array = new String[n];

        for(int i = 0 ; i < n ; i++){

            array[i] = sc.next();
        }

        for(int j = array[0].length()-1 ; j >= 0 ; j --){ // 인덱스의 뒤에서부터 비교해야한다. -> 자리수를 비교하는 for문
            // 문자열을 뒤에서부터 잘라서 비교해야하는데  이때 비교해야하는 문자열은 배열의 전체문자열이다.

            out: for(int k = 0 ;  k < array.length ; k++){
                String tmp1 = array[k];
                for(int l = 0 ; l < array.length; l++){
                    String tmp2 = array[l];
                    if(tmp1.equals(tmp2)){
                        break out;
                    }
                }
            }

        }

    }
}
