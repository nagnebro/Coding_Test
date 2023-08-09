package BaekJoon.silver;

import java.util.Scanner;

public class Num1065 {

    public static void main(String[] args) {

        // 등차수열이란 연속된 두개의 수의 차이가 일정함을 뜻한다
        // 즉 13 5 7 9 11 ... 과 같은 것이다
        // 그러나 문제에서는 각 자리수가 서로 등차수열이라고 한다
        // 즉 147 같은 숫자가 등차수열이란 것이다
        // 그러나 2자리수 까지는 무조건 등차수열이다
        // 더 비교할 세자리수가 없기 때문이다
        // 3자리수부터는 이ㄷ제 확연히 등차수열이 아닌 수가 나오기 시작한다
        // 100, 101, 102, 103, 104, 105, 106, 107, 108, 109 110
        // 따라서 테스트 케이스의 110의 한수의 개수는 110 -11개인 99 개이다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gap = 0;
        int count = 0;

        for(int i = 1; i <= n ; i++){

            String str = i + "";
            boolean check = true;
            for(int j = 0 ; j < str.length()-1 ; j++){ // 1의 자리수일 경우에는 애초에 0이므로 조건이 성립하지 않아 인덱스 에러가 발생할 수 없다.
                if(j == 0){
                    gap = str.charAt(j)-str.charAt(j+1);
                }
                if(gap != str.charAt(j)-str.charAt(j+1)){ // 이렇게 안하고 이떄 count를 세고 전체수에서 빼려고 했는데 특수 케이스에 예외가 발생한다.
                    // 1000의경우 999는 한수인데 1000은 한수가 아니다. 따라서 1000을 검사했을때 한수의 개수가 아닌게 1증가하면서 999는 한수의개수가 144로 나오는데
                    /// 1000은 143이 나온다. 따라서 이런경우는 그냥 반전되는 식보다 확실한 조건식이 좋은듯하다.
                    check = false;
                    break;

                }
            }
            if(check){
                count++;
            }

        }
        System.out.println(count);

    }
}
