package BaekJoon.level9;

import java.util.Scanner;

public class Num1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first_num = sc.nextInt();
        int count = 0; // 전체 소수 개수가 몇갠지 카운트

        for(int i= 0 ; i < first_num ; i++){

            int num = sc.nextInt();
            int check = 0; // 약수가 몇개인지 체크.
            for(int j = 1 ; j <= num ; j++){

                if(num%j==0){
                    check ++;
                }
                if(check > 2){
                    break;
                }

            }
            if(check==2){
                count ++;
            }
        }
        System.out.println(count);
    }
}
