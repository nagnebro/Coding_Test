package BaekJoon.level13;

import java.util.Scanner;

public class Num25305 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0 ; i < n ; i++){

            array[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-1-i ; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        System.out.println(array[n-k]);
    }
}
