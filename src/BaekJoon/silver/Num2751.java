package BaekJoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Num2751 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        int[] array = new int[n];
        try {
            n = Integer.parseInt(br.readLine());
            array = new int[n];

            for (int i = 0; i < n; i++) {

                array[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(array);

            for (int i = 0; i < n; i++) {

                bw.write(array[i] + "\n");

            }
            bw.flush();
        } catch (IOException e) {

        }


    }
}
