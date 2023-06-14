package BaekJoon;

import java.util.Scanner;
public class Num1330 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // short를 이용해도 됨. 입력값의 범위가 -10000~10000이기 때문
        int num1 = Integer.parseInt(sc.next());
        int num2 = Integer.parseInt(sc.next());

        if(num1>num2){

            System.out.println(">");
        }else if(num1<num2){

            System.out.println("<");
        }else{

            System.out.println("=");
        }



    }
}
