package BaekJoon.silver;

import java.util.Scanner;

public class Num1531 {

    public static void main(String[] args) {

        // 이 문제는 2차원 배열을 이용해서 푼다
        // 입력으로 들어온 좌표n의 횟수만큼 for문을 계속 돌려서
        // 배열의 요소값에 +1을 해준다
        // 이후에 ㅂ전체배열을 for문을 돌리는데 이때 배열의 요소값이 m보다 큰 경우에 count를 센다
        // 그부분이 보이지 않는 부분을 뜻한다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] array = new int[100][100];
        int count = 0; // 보이지 않는 부분의 카운트.

        //좌표는 100보다 작거나 같은 자연수 즉 1~100까지 들어오므로 인덱스로 접근하면 arrayindexoutofBoundsException이 발생한다
        // 따라서 for문의 조건식에서 1을 빼준 상태로 접근한다.


        for(int i = 0 ; i < n ; i ++){

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1-1 ; j <= x2-1 ; j++){

                for(int k = y1-1; k <= y2-1; k++ ){

                    array[j][k] += 1;
                }
            }
        }

        for(int i = 0 ; i < 100 ; i ++){

            for(int j = 0 ; j < 100 ; j++){

                if(array[i][j] > m){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
