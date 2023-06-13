package BaekJoon;

import java.util.Scanner;
import java.io.*;

//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
//셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
class Num10430 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try {
            String[] str = br.readLine().split(" ");

            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            int num3 = Integer.parseInt(str[2]);

            bw.write(String.valueOf((num1 + num2) % num3) + "\n");
            bw.write(String.valueOf((num1 % num3) + (num2 % num3) % num3) + "\n");
            bw.write(String.valueOf((num1 * num2) % num3) + "\n");
            bw.write(String.valueOf(((num1 % num3) * (num2 % num3)) % num3) + "\n");

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

