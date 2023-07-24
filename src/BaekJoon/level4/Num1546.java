package BaekJoon.level4;

import java.util.Scanner;

public class Num1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line_count = Integer.parseInt(sc.next());
        float result = 0;
        int max = 0;
        // 최대값을 구하는 로직.

        // 2가지 방법
        // 1. String 배열로 받아서 sort를 이용해 최대값 구한 후
        // for문하나로 파싱하며 최대값을 이용한 수식 계산
        // 2. for문 2개를 써서 int배열에 담고 split 없이 수식계산하기

        int [] num_array = new int[line_count];


        for(int i = 0 ; i < line_count ; i++){
            int tmp = Integer.parseInt(sc.next());
            num_array[i] = tmp;
            if( max < tmp){ max = tmp;}

        }
        for(int j= 0 ; j < line_count; j++){

            result += (float)num_array[j]/max*100;

        }


        System.out.println(result/line_count);
    }
}
