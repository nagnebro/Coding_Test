package BaekJoon.level10;

import java.util.Scanner;

public class Num14215 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 삼각형을 만들기 위한 조건은 길이가 가장 긴 변이 나머지 두변의 합보다 작아야 한다는 것이다.
        // 이 문제에서의 변의 길이는 무조건 양수이다. 따라서 길이를 극한으로 늘려서 0.1이 되는 이런 경우는 없다.
        // 해답은 다음과 같다.
        // 입력으로 주어지는 수 3개를 이용해 삼각형의 조건에 부합하는지 확인한다.
        // 1. 부합한다면 세 입력의 합을 그대로 출력한다.
        // 2. 부합하지 않는다면 가장 큰 수를 나머지 두 수의 합 -1만큼 만든 후에 세변의 합을 구한다.

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int line1 = num1+num2;
        int line2 = num1+num3;
        int line3 = num2+num3;

        int result = 0;

        if(line1 <= num3){
            result = line1 + line1-1;

        }
        else if(line2 <= num2){

            result = line2 + line2-1;
        }else if(line3 <= num1){
            result = line3 + line3-1;

        }else{
            result = num1 + num2 + num3;
        }

        System.out.println(result);



    }
}
