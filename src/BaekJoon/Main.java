package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main{

    public static void main(String [] args){


        /*
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1-num2);

        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String [] str = br.readLine().split(" ");

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}



class Main2{

    public static void main(String [] args){


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String [] str = br.readLine().split(" ");
            int result = Integer.parseInt(str[0])- Integer.parseInt(str[1]);
            bw.write(String.valueOf(result));
            bw.flush();

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}



class Main3{

    public static void main(String [] args){


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String [] str = br.readLine().split(" ");
            int result = Integer.parseInt(str[0])- Integer.parseInt(str[1]);
            bw.write(String.valueOf(result));
            bw.flush();

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}

