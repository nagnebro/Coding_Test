package BaekJoon.level7;

import java.util.Scanner;

public class Num2738 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        String answer = "";

        int [][] a = new int [row][column];


        //행렬 a초기화
        for(int i = 0 ; i < row ; i++){

            for(int j = 0 ; j < column ; j++){

                a[i][j] = sc.nextInt();
            }
        }

        // 행렬a와 입력값을 바로더한값을 정답에 저장.
        for(int i = 0 ; i < row ; i++){

            for(int j = 0 ; j < column ; j++){

                answer += a[i][j] + sc.nextInt()+ " ";
            }
            answer+= "\n";
        }
        System.out.println(answer);
    }
}
