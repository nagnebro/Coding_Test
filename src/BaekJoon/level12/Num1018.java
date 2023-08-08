package BaekJoon.level12;

import java.util.Arrays;
import java.util.Scanner;

public class Num1018 {

    public static void main(String[] args) {


        // 문자열을 전부 붙여서 구하기


        // for문을 몇개를 돌려야하냐. 그냥 따로따로 돌리자  크게 두개. 가로로 이동하는거1개 세로로 이동하는거 1개

        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt(); // 행의 개수(세로길이)
        int m = sc.nextInt(); // 열의 개수(가로길이)

        String [][] board = new String[n][m];

        for(int i = 0 ; i < n ; i++){
            String inputLine = sc.next();
            for(int j = 0 ; j < m ; j++){
                board[i][j] = inputLine.charAt(j)+"";
            }
        }

        for (int i = 0 ; i <= m-8  ; i++){ // 전체칸을  1칸씩 땡겨준다. --> 가로로 이동 시켜준다는 ㄴ것.

            for(int j = 0 ; j < 8 ; j++){ // 행을 바꿔준다. 행은 8개까지만 비교해야한다.

                for(int k = i ; k < 8+i ; k++){ // 열을 바꿔준다. 즉 가로로 돌다가 다 돌면 행을 바꿔주고 다시 가로로 돌고. (행, 열이라고 말하기엔 너무 용어가 헷갈린다)

                    if(board[j][k].equals("B")){

                    }


                }
            }
        }

    }


}

