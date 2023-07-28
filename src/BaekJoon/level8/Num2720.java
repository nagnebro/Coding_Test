package BaekJoon.level8;

import java.util.Scanner;

public class Num2720 {

    public static void main(String[] args) {


        Scanner sc  = new Scanner(System.in);
        int count = sc.nextInt();
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        for(int i = 0 ; i < count ; i ++){

            int money = sc.nextInt();
            int tmp = 0; // 거스름돈을 거스르고 난 후의 금액을 저장할 임시변수
            quarter = money/25;
            tmp = money - 25*quarter;
            dime = tmp/10;
            tmp = tmp - 10*dime;
            nickel =  tmp/5;
            tmp = tmp - 5*nickel;
            penny = tmp;
            System.out.println(String.format("%d %d %d %d",quarter,dime,nickel,penny));

        }
    }
}
