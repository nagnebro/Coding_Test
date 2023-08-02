package BaekJoon.level10;

import java.util.Scanner;

public class Num10101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int [] array = {input1,input2,input3};
        int sum = 0;
        int count = 0;

        String result = "";


        if(array[0]==array[1] && array[1]==array[2] &&array[0]== array[2] && array[1] == 60){
            count = 3;
        }
        else if(array[0]==array[1] || array[1]==array[2] ||array[0]== array[2]){
            count = 2;
        }
        sum = array[0] + array[1] + array[2];



        if(count == 3 && sum==180){
            result = "Equilateral";
        }else if(sum == 180 && count ==2){
            result = "Isosceles";
        }else if(sum == 180){
            result = "Scalene";
        }else if(sum != 180){
            result = "Error";
        }

        System.out.println(result);

    }
}
