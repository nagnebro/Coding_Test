package BaekJoon;
import java.util.Scanner;

public class Num2525 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        String str = sc.nextLine(); // nextLine()은 개행문자 '\n'을 가져오지 않는다. 즉 띄어쓰기 까지 한번에 가져올 수 있음.
        int hour = Integer.parseInt(str.split(" ")[0]);
        int minute = Integer.parseInt(str.split(" ")[1]); // 공백을 기준으로 입력된 문자열을 자른다.
        int time = Integer.parseInt(sc.next()); // next()는 띄어쓰기를 기준으로 구분하며 구분된 요소를 1개씩 가져올 수 있다.


        minute +=  time;
        if (minute >= 60){ // 분이 60분 넘을떄랑 시간이 24시가 넘을때를 처리해줘야함.

            hour  += minute / 60;
            minute = minute % 60;

            if(hour >= 24){

                hour = hour%24;

            }
        }

        System.out.println(hour + " " + minute);
    }
}
