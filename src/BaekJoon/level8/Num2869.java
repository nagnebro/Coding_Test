package BaekJoon.level8;

import java.util.Scanner;

public class Num2869 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int afternoon = sc.nextInt();
        int night = sc.nextInt();
        int height = sc.nextInt();
        int location = 0; // 달팽이의 현재위치
        int day_count = 1; // 몇일이 걸리는지 count할 변수

        int moving = afternoon - night;// 하루에 움직일 수 있는 거리

        day_count += height/moving -1;
//
//        //조건중 특이한 점은 낮에 다 올라가면 day count를 세지 않는다는 것.
//        while(true){
//
//            location += afternoon;
//            if(location >= height){
//                break;
//            }
//            location -= night;
//            day_count ++;
//        }
//        System.out.println(day_count);

        System.out.println(day_count);

    }
}
