package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1181 {

    public static void main(String[] args) {


        // 우선 모든 입력을 배열에 저장한다
        // 버블정렬로 정렬을 해야하나?해쉬코드로 버블정렬
        // 굳이 정렬을 하고 뽑아내야하나


        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        String [] array = new String[n];
        for(int i = 0 ; i < n ; i ++){

            array[i] = sc.next();
        }

        Arrays.sort(array);
        System.out.println("abc".hashCode());
        System.out.println("abcd".hashCode());
        System.out.println(Arrays.toString(array));
    }
}
