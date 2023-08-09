package BaekJoon.level12;

import java.util.Arrays;
import java.util.Scanner;

public class Num1018 {

    public static void main(String[] args) {


        // 문자열을 전부 붙여서 구하기


        // for문을 몇개를 돌려야하냐. 그냥 따로따로 돌리자  크게 두개. 가로로 이동하는거1개 세로로 이동하는거 1개

        // WBBWBWBWBW
        // BWWWWWWWWWW
        // 8번째 다음 9번째 문자는 또 8번째문자랑 같아야한다.

        // W와B가 번갈아가면서 칠해지기 위해 식별하는 조건이 필요하다
        // 배열에 저장된 문자열을 일렬로 다 더하고 charAt으로 비교한ㄷㅏ?


        //기준을 정해야한다
        // 홀수행일때 시작은 W이고 열은 짝수번째열은 B여야되고 홀수번째 열은 W여야한다.
        // 짝수행일때 시작은 B여야하고 짝수번째 열은 W여야되고 홀수번째 열은 B여야한다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행의 개수(세로길이)
        int m = sc.nextInt(); // 열의 개수(가로길이)

        int min = 64;
        int result  = 64;
        String[][] board = new String[n][m];

        for (int i = 0; i < n; i++) {
            String inputLine = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = inputLine.charAt(j) + "";
            }
        }

        for (int l = 0; l <= n - 8; l++) { // 행을 바꿔준다. 즉 가로줄을 아래로 바꿔준다. --> 세로로 이동시키겠다는 것.


            for (int i = 0; i <= m - 8; i++) { // 열을 바꿔준다. 전체칸을  1칸씩 땡겨준다. --> 가로로 이동 시켜준다는 ㄴ것.

                int countW = 0;
                int countB = 0;
                for (int j = l; j < 8 + l; j++) { // 행을 바꿔준다. 행은 8개까지만 비교해야한다.

                    for (int k = i; k < 8 + i; k++) { // 열을 바꿔준다. 즉 가로로 돌다가 다 돌면 행을 바꿔주고 다시 가로로 돌고. (행, 열이라고 말하기엔 너무 용어가 헷갈린다)

                        if(j % 2 == 0 ) { // 행이 홀수일경우 (인덱스를 얘기하는 것이 아니라 문제에서 주어진 1행2행3행을 뜻한다)
                            if (k % 2 != 0 && board[j][k].equals("B")) { // 행이 홀 수 있고. 열이 짝수이면서 B일경우
                                countB++;
                            }
                            if (k % 2 == 0 && board[j][k].equals("W")) { // 열이 홀수이면서 W일 경우.
                                countW++;
                            }

                        }
                        else if(j%2 !=0 ){ // 행이 짝수일 경우 (2,4,6행 인덱스는,1,3,5)
                            if (k % 2 != 0 && board[j][k].equals("W")) { // 행이 홀 수 있고. 열이 짝수이면서 B일경우
                                countW++;
                            }
                            if (k % 2 == 0 && board[j][k].equals("B")) { // 열이 홀수이면서 W일 경우.
                                countB++;
                            }
                        }


                    }

                } // 이 for문을 나오면 한개의 체스판이 검사가 완료된 것이다.
                // 현재 구한것은 하나의 기준을 세운 것이다. ㅈ홀수행일떄 시작이 W여야하고 열이 홀수일떄 W 짝수일때 B여야한다
                // 짝수행일떄는 시작이 B여야하고 열이 홀수일때 B 열이 짤수일때 W여야한다.
                // 여기서 카운트는 위에서 언급한 조건이 성립하지 않을때, 즉 칠해야하는 정사각형의 개수를 뜻한다
                // 그리고 이 갯수는 반대로 홀수행이 B로 시작할떄의 경우는반대가 될것이다
                // 8x8이므로 정사각형 개수는 64, 최대로 색칠해야하는 수는 /2인 32이다.
                // 따라서 count와 이 count에 32를 뺀값을 비교하고 더 작은 값을 출력하면 된다.

                int totalCount = countB+countW;
                min = totalCount > 64-(totalCount) ? 64-(totalCount) : totalCount;
                result = result > min ? min : result;
            }
        }


        System.out.println(result);

    }


}

