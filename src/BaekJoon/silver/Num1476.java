package BaekJoon.silver;

import java.util.Scanner;

public class Num1476 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt(); // earth
        int s = sc.nextInt(); // sun
        int m = sc.nextInt(); // month
        int count = 0;

        int i = 1;
        int j = 1;
        int k = 1;
        int d = 1;
        while(true){

            count++;

//            System.out.printf("%d %d %d \n",i,j,k);
            i = i == 16 ? 1 : i;
            j = j == 29 ? 1 : j;
            k = k == 20 ? 1 : k;

            if(e == i && s == j && m == k){
                System.out.println(count);
                return;
            }
            i++;
            j++;
            k++;
            d++;

        }




    }
}
