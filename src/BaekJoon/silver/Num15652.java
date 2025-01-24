package BaekJoon.silver;

import java.util.Scanner;

public class Num15652 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열의 숫자 범위를 나타내는 n
        int m = sc.nextInt(); // 수열의 길이를 나타내는 m

        // 필요한 for문의 갯수
        // 1. 라인을 바꾸기 위한 for문. 수열의 가장 앞의 수를 바꿔준다
        // 2. 자리수를 바꿔주는 for문
        // 3. m의 길이만큼 수열의 길이를 정해주는 for문

        // ex) 5 3 입력시
        //  1 1 1 , 1 1 2  1 1 3 1 1 4 1 1 5 1 2 2

        for(int i = 1 ; i < n ; i ++){
            String line = "";
            for(int j = i ; j < m ; j ++){

            }
        }
        System.out.println(n + "/ " + m);
    }
}
