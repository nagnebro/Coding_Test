package BaekJoon.silver;

import java.io.*;
import java.util.Scanner;

public class Num2167 {

    public static void main(String[] args) {

        // 미제출, 메모리초과
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m]; // n은 행이고 m은 열이다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        sc.nextLine();// 개행문자 없애주기
        for (int i = 0; i < n; i++) { // 입력으로 들어오는 n개의 행 받기
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                String[] charArray = line.split(" ");
                array[i][j] = Integer.parseInt(charArray[j]); // 가로의 값만 초기화해준다.
            }
        }

        int k = sc.nextInt();

//        sc.nextLine(); // 개행문자 제거

        for (int q = 0; q < k; q++) {
            long sum = 0;

            try {
                String lineK = br.readLine();
                System.out.println(lineK);
                String[] charArray = lineK.split(" ");
                int i = Integer.parseInt(charArray[0]);
                int j = Integer.parseInt(charArray[1]);
                int x = Integer.parseInt(charArray[2]);
                int y = Integer.parseInt(charArray[3]);

                for (int w = i - 1; w <= x - 1; w++) {
                    for (int e = j - 1; e <= y - 1; e++) {
                        sum += array[w][e];
                    }
                }
                bw.write(sum+"\n");
                bw.flush();
            }catch (IOException e){

            }
        }

    }
}
