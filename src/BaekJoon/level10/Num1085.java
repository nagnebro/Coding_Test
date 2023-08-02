package BaekJoon.level10;

import java.util.Scanner;

public class Num1085 {

    public static void main(String[] args) {


        // x나 y에서 원점(0,)이 가까운지 혹은 w와 h와 가까운지 4가지 경우의 수를 구하고
        // 가장 작은 수를 출력한다.
        // 4가지 경우의 수 x일 경우(x-0), y일경우(y-0), (w-x)일경우(h-y)일 경우
        // 이때 대각선으로 움직이는 경우는 제외..한다기보다 어차피 4변중에 한개만 닿으면 되므로
        // 굳이 대각선으로 움직일 이유조차 없다.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int [] array = {x,y,w-x,h-y};
        int min=x;

        for(int i = 1 ; i < array.length ; i++){

            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);





    }
}
