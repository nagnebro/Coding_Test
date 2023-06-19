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
        result = num1 == num2 && num1 == num3 ? 10000 + num1 * 1000 : 0;
        if (result != 0) {
            System.out.println(result);
            return;
        }
        dice = num1 == num2 ? num1 : num1 == num3 ? num1 : num2 == num3 ? num2 : 0;
        if (dice != 0) {
            result = 1000 + dice * 100;
            System.out.println(result);
            return;
        }


        max = num1;

        if (max > num2) {

            if(max < num3){ // max가 num3보다 클경우의 조건은 생략. 그대로 값을 들고 있으면 되니까.
                max = num3;
            }


        }else{
            max = num2;
            if(max<num3){
                max = num3;
            }

        }

        result = max * 100;
        System.out.println(result);

    }


    // 상위에 조건범위가 가장 좁은 것을 두는 것이 아니라 가장 넓은 것부터 두고 아래쪽으로 갈수록 조건범위를 좁힌다
    // 이 떄 조건문은 모두 if문으로 작성해 세가지 경우의 수를 모두 검사할 수 있게 한다(주사위눈이 3개가 같거나 2개가같거나 모두 다르거나)
    // 이ㄷ렇게 세개의 조건문을 검사한 후 해당 조건문에는 result와 dice를 세팅할 수 있게끔 한다.

    // 3개가 같은 수가 아니고 2개가 같은 수일 경우는 3가지경우의 수가 있다.그러나 이 조건은
    // 세가지 수가 같은 경우보다 조건 검사의 범위가 좁기 때문에(즉 주사위눈이 세개가 같은 경우에도 이 조건식을 만족하므로) 조건식의 판별 조건이 더 좁은 범위의 조건식을 항상
    // 상위에 두는 것이 유리하다.


}



class Test {

    public static void main(String[] args) {


    }
}