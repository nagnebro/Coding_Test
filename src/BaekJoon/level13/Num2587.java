package BaekJoon.level13;

import java.util.Scanner;

public class Num2587 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array = new int [5];
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++){

            array[i] = sc.nextInt();
            sum += array[i];
        }

        for(int i = 0 ; i < 5 - 1 ; i++){
            for(int j = 0 ; j < 5-1-i ; j++){

                if(array[j] > array[j+1]){

                    int tmp  =array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.println(sum/5);
        System.out.println(array[2]);
    }
}
