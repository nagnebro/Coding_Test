package BaekJoon.silver;

import java.io.*;
import java.util.Arrays;

public class Num11650 {

    public static void main(String[] args) {

        // 오답 시간초과
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{

            int n = Integer.parseInt(br.readLine());
            int [] arrayX = new int[n];
            int [] arrayY = new int[n];
            for(int i = 0 ; i < n ; i++){
                String [] charArray = br.readLine().split(" ");
                arrayX[i] = Integer.parseInt(charArray[0]);
                arrayY[i] = Integer.parseInt(charArray[1]);
            }

            Arrays.sort(arrayX);
            Arrays.sort(arrayY);
            String result = "";
            for(int i = 0 ; i < n ; i++ ){

                result += String.format("%d %d\n",arrayX[i],arrayY[i]);
            }
            bw.write(result);
            bw.flush();
        }catch (IOException e){

        }
    }
}
