package BaekJoon;

import java.util.Scanner;
import java.io.*;

//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
//셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
class Main4{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println((num1+num2)%num3);
        System.out.println((num1%num3)+(num2%num3)%num3);
        System.out.println((num1*num2)%num3);
        System.out.print(((num1%num2)*(num2%num3))%num3);

    }
}