package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array1 = new int[n];
        int [] array2 = new int[n];
        int sum = 0;
        for(int i = 0; i < n ;i++){
            array1[i] = sc.nextInt();
        }

        for(int i = 0; i < n ;i++){
            array2[i] = sc.nextInt();
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i = 0; i < n; i++){
            sum += array1[i] * array2[n-1-i];
        }

        System.out.println(sum);
    }
}
