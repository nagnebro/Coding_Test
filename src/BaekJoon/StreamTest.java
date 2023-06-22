package BaekJoon;

import java.io.*;
import java.util.Scanner;

public class StreamTest {

    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

        try{

            Scanner sc = new Scanner(System.in);
            bw.write("안녕하세여/");
            bw.flush();
            bw.flush();



        }catch(IOException e){}
    }

}
