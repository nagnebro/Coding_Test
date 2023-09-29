package BaekJoon.level13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num10989 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int [] array = new int[n];
            for(int i = 0 ; i < n ; i++){ // 배열초기화.
                array[i] = Integer.parseInt(br.readLine());
            }

            for(int i = 0 ; i < n-1 ; i++){

                for(int j = 0 ; j < n-1-i ; j++) {

                    if(array[j] > array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
            String result = "";

            for(int i = 0 ; i < n ; i++){
                result += array[i] + "\n";
            }
            System.out.println(result);
        }catch (Exception e){

        }

    }
}
