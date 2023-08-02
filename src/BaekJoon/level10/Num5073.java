package BaekJoon.level10;

import java.util.Scanner;

public class Num5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 ;
        String result = "";
        while ((num1 = sc.nextInt())!= 0) {

            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int line1 = num1+num2;
            int line2 = num1+num3;
            int line3 = num2+num3;

            if(num1 == num2 && num2 == num3){
                result = "Equilateral";
            }else if(num1 == num2 || num2 == num3 || num1 == num3){
                result = "Isosceles";
            }else{
                result = "Scalene";
            }

            if(line1 <= num3 || line2 <=num2 || line3 <= num1){ // 삼각형이 될 수 없는 조건은 두변의 합이 남은 한 변의 길이보다 같거나 작을떄이다.
                result = "Invalid";
            }


            System.out.println(result);
        }
    }
}
