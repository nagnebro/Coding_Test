package BaekJoon.level5;

import java.util.Arrays;
import java.util.Scanner;

public class Num1152 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        if((str.charAt(0)+"").equals(" ")){
//            str = str.substring(1);
//        }
//        if((str.charAt(str.length()-1)+"").equals(" ")) {
//
//            str = str.substring(0,str.length()-1);
//
//        }
        // 공백으로 시장해서
        if(str.equals(" ")){
            System.out.println("0");
        }else {
            System.out.println(str.trim().split(" ").length);
        }
    }
}
