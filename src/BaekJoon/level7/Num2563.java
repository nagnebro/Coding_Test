package BaekJoon.level7;

import java.util.Scanner;

public class Num2563 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int paper_count = sc.nextInt();
        int [][] dohwaji = new int[100][100];
        int volume = 0;

        // 100x100배열에 도화지의 좌표 (x,y) + 10에 해당하는 범위만큼 요소값을 바꾸기에는 너무 비효율적이기 때문에
        // 방법 1. ?
        // 방법 2. 배열 100x100에 해당하는 범위의 배열 요소 값을 바꿔준다. 이때 이미 요소값이 1이라면(바뀌었다면)생략하게 되면 중복되는 부분은 넘길 수 있다.
        // 단 이경우에는 100x100의 의 반복문을 돌려야하기 때문에 비효율적이다.

        for (int i = 0 ; i < paper_count ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x ; j < x+10 ; j++){

                for( int k = y ; k < y+10 ; k++){

                    dohwaji[j][k] = 1;

                }
            }

        }

        for(int i = 0 ; i <100 ; i++){

            for(int j = 0 ; j<100 ; j++){

                volume += dohwaji[i][j];
            }
        }
        System.out.println(volume);


    }
}
