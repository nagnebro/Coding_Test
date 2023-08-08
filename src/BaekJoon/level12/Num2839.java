package BaekJoon.level12;

import java.util.Scanner;

public class Num2839 {

    public static void main(String[] args) {


        // 무조건 5키로로 전부 나눠서는 안된다.
        // 거꾸로 가는 편이 좋을듯 하다
        // 1봉지ㄷ째부터 계산하면 5키로짜리를 더 들 수 있는데 3키로 짜리를 더 들게끔 계산이 될 수 있으니
        // n킬로그램이 주어졌을 때 5킬로 그램의 몫을 구하고
        // 그떄의 나머지를 3키로로 나눴을 때 나머지가 0이라면 바로 그게 5kg와 3kg 설탕의 각 봉지수일 것이다.
        // 이떄 5kg의 몫은 계속 줄어들게끔 만든다.
        // 그러면 자연스레 3kg로 짜리로도 몇봉지를 들수 있을지 계산할 수 있게 된다
        // 단 이때 3kg로도 n킬로그램을 만들 수 없다면 -1을 출력한다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int fiveCount = 0; //5kg 설탕 봉지수
        int threeCount = 0 ; // 3kg 설탕 봉지수

        for(int i = n/5 ; i >=0 ; i--){ // i는 5kg의 봉지수를 뜻한다. 5kg의 최대봉지수에서 봉지수가 0이될떄까지 반복하면서 3kg봉지수도 구해야한다

            if( (n- (i * 5)) % 3 == 0  ){ // 이 식은 풀어쓰면 다음과 같다
                // 5키로로 만들수 있는 봉지수는 i이다. 이때 그 몫과 5kg 를 곱한양을 nkg에서 뺀다. 그 남은양을 3kg로 나눴을 떄
                // 나머지가 0이라면 5kg i봉지와 남은kg를 3으로 나눈게 3kg의 봉지수가 되므로 그게 봉지수이다
                // 이떄 i는 1씩 줄어든다. 즉 1씩 줄어들기때문에 5kg를 최대화하되 안될경우 1개씩 감소시키고 그 감소되면 양만큼이
                // 다시 3kg 로 나눠지는지 검사하는 것이다.
                result = i + ((n- (i * 5)) / 3);
                System.out.println(result);
                return;
            }
        }
        System.out.println(-1);


    }
}
