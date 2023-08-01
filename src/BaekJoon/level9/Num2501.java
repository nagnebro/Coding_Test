package BaekJoon.level9;

import java.util.Scanner;

public class Num2501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n ; i++){


            if(n % i == 0){
                count++;
                if(count == k){
                    System.out.println(i);
                    return; // for문 바깥에서 n의 약수의 개수가 k보다 작아서 출력할 수가 없을 경우 0을 출력해야하기 때문에
                    //return으로 main메서드를 완전히 종료시킨다.
                }

            }

        }
        System.out.println(0);
    }
}
