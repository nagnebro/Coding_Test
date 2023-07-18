package BaekJoon.level3;

import java.io.*;

public class Num15552 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] array;
        try{

            int first_line = Integer.parseInt(br.readLine());

            for(int i = 0 ; i<first_line; i++){

                array = br.readLine().split(" ");
                Short num1 = Short.parseShort(array[0]);
                Short num2 = Short.parseShort(array[1]);
                bw.write(num1+num2+"\n");

            }
            bw.flush();
            br.close();
            bw.close();
        }catch(IOException e){

        }

    }
}
