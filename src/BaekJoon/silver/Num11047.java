package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num11047 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        int count = 0; // 몫
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }



        int i = array.length-1;
        while (k != 0) {


            if (k / array[i] >= 1) { // 나머지를 갖든 안갖든 일단 나눠진다면 나눈다. 이때 i는 항상 최대값을 유지해야한다.
                count += k/array[i]; // 그때의 몫을 더해준다. 나눌만큼 나눴다면 그 동전으로는 더이상 나눌 수 없으니 i를 빼준다.
                k = k % array[i]; // 동전의 가격으로 나눈 나머지만큼이 k값이 된다.
            }
            i--;


        }
        System.out.println(count);

    }
}
