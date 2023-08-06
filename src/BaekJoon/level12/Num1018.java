package BaekJoon.level12;

import java.util.Arrays;
import java.util.Scanner;

public class Num1018 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        String [][] chess = new String[n][m];

        for(int i = 0 ; i < n ; i++){
            String str = sc.nextLine();
            String [] str_array = str.split("");
            for(int j = 0 ; j < m ; j++){

                chess[i][j] = str_array[j];
            }
        }
        System.out.println(Arrays.toString(chess));// 초기화된 체스판 확인




    }
}
