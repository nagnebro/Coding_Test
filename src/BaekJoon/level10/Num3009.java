package BaekJoon.level10;

import java.util.Scanner;

public class Num3009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array = new int[6];

        // 이 문제는 3개의 주어진 좌표중에서 x좌표가 1개인 것과 y좌표가 1개인것의 수를 합치면
        // 직사각형을 만들 수 있는 점의 좌표를 구할 수 있다.
        for(int i = 0 ; i < array.length ; i++){

            array[i] = sc.nextInt();
        }
        int x = 0;
        int y = 0;

       if(array[0]==array[2]){
           x= array[4];
       }else if(array[0]==array[4]){
           x= array[2];
       }else if(array[2]==array[4]){
           x=array[0];
       }

        if(array[1]==array[3]){
            y= array[5];
        }else if(array[1]==array[5]){
            y= array[3];
        }else if(array[3]==array[5]){
            y=array[1];
        }
        System.out.println(x + " " + y);
    }
}
