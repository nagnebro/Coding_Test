package BaekJoon;

import java.util.Scanner;
public class Num2480 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.next());
        int num2 = Integer.parseInt(sc.next());
        int num3 = Integer.parseInt(sc.next());
        int result = 0;
        int dice = 0;
        int max = 0;
        result = num1 == num2 && num1 == num3? 10000+num1*1000 : 0;
        if (result != 0){
            System.out.println(result);
        }
        dice = num1 == num2 ? num1 : num1 == num3 ? num1 :  num2 == num3? num2 : 0;
        if (dice!=0){
            result = 1000+dice*100;
            System.out.println(result);
        }

        max = num1 > num2 ? num1 : num2> num3 ? num2: num3;
        max = num1 > num3 ? num1: num3;
    
        result = 100*max;
        System.out.println(result);


         // 3개가 같은 수가 아니고 2개가 같은 수일 경우는 3가지경우의 수가 있다.그러나 이 조건은
            // 세가지 수가 같은 경우보다 조건 검사의 범위가 좁기 때문에(즉 주사위눈이 세개가 같은 경우에도 이 조건식을 만족하므로) 조건식의 판별 조건이 더 좁은 범위의 조건식을 항상
            // 상위에 두는 것이 유리하다.






    }
}
