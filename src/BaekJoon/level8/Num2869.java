package BaekJoon.level8;

import java.util.Scanner;

public class Num2869 {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int afternoon = sc.nextInt();
//        int night = sc.nextInt();
//        int height = sc.nextInt();
//        int location = 0; // 달팽이의 현재위치
//        int day_count = 1; // 몇일이 걸리는지 count할 변수
//
//        int moving = afternoon - night;// 하루에 움직일 수 있는 거리
//
//        day_count += height/moving -1;
        // ================시간초과로 인한 오답처리 ========================
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

        // 올라갈 수 있는 거리를 구해서 그걸 날짜로 나누면 날짜가 나온다
        // 이떄 미끄러지기전에 올라가는 거리가 더 길기때문에 일수는 줄어들게 된다.
        // 따라서 이러한 수식을 이용해서 푼다.
        //예를 들어 2 1 5 라고 했을ㄷ ㅐ1mㅎ식 올라갈 수 있는ㄷ 이론상 5일이 걸린다.
        // 이떄 이 낮에 2m를 올라갈 수 있기 때문에 하루

        // 100 99 1000000 의 형태라고 하면은
        // 올라갈 수 있는 거리는 1m이다. 이떄 1000000일이 걸리는게 아니고 999999까지 올라갔다가 미끄러면999900이 됐다가 100만큼 올라가는 것이다
        // 올라가야하는 높이 v가 있다.
        // 그리고 밤에 미끄러지는 높이는 (n)이라고 하자.
        // 이떄 m-n은 하루에 이동할 수 있는 거리이다. 그러나 마지막날에는 낮에 한번에 올라갈 수 있다.
        // 그러므로 (v-m)/(m-n) +1을 하면 올라가는데 몇이링 걸리는지 알 수 있다.
        // 단 이때 (v-m)/(m-n)이 1이 안될 수도 있다. 이떄는 그냥 1이라고 가정한다.
         Scanner sc = new Scanner(System.in);
         int m = sc.nextInt(); // 낮에 올라가는 높이
         int n = sc.nextInt(); // 밤에 올라가는 높이
         int v = sc.nextInt(); // 총 올라가야하는 나무의 높이

        //m과 v가 같아서 하루만에 다 올라가는 경우의 예외가 발생한다.
        // 또한 5 1 6 과 같이 v-m이 m-n보다 작은 경우 -> 2일만에 올라갈 수 있는 경우? 의 예외도 발생하게 된다.

        if(v == m){
            System.out.println(1);
        }else if((v-m)%(m-n)!=0){ // 나눈 값에 나머지가 있다면 하루 더 올라가야하므로 몫에다가 하루를 더 더해준다.

            System.out.println((v-m)/(m-n) + 2);

        }else{
            System.out.println((v-m)/(m-n) + 1);

        }


    }
}
