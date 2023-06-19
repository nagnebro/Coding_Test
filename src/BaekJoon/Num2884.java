package BaekJoon;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Num2884 {

    public static void main(String[] args) {


        // 자정에서 전날로 넘어갈떄랑. 분이 0보다 낮을 떄의 예외처리가 중요함.
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.next());
        int minute = Integer.parseInt(sc.next());
        int after = minute-45;

        if(after < 0 ){

            hour--;
            after = 60+after;
            if (hour == -1) hour = 23;

        }


         // 정답에서 체크할떄 문자열인지 숫자인지 혹시 비교할 수 있으니 .. 이 방법이 안되면
            // 시간과 분을 정수형으로 유지시키기 위해 +말고 print를 이용해 각각 따로 출력할것 print(hour) print(" ") print(minute)
        System.out.println(hour + " " + after);





    }
}



//
