package BaekJoon.level5;

import java.util.Scanner;

public class Num10809 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ascii = 'a';

        for(int i = 'a' ; i <= 'z' ; i++){

            if(str.indexOf(ascii)!=-1){

                System.out.print(str.indexOf(i)+" ");
            }else{
                System.out.print(-1+" ");
            }
        }

    }
}


class Test3{

    public static void main(String[] args) {

        String str = "abca";
        System.out.println(str.indexOf("a"));
    }
}