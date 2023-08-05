package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1439 {

    public static void main(String[] args) {

        // 다솜이가 할 수 있는 것은 문자열중에서 0,1로된 연속된 부분의 문자열 개수를 구하고 그 카운트를 비교해 더 작은쪽의 카운트를 출력하는 것이다
        // 예를 들면 1001 이 있을때 처음 1은 연속되지 않으므로 1의 카운트 +1, 0은 연속돼있으므로 000 문자열 0의 카운트+1, 마지막 1은
        // 1의 카운트 +1이다. 따라서 출력은 0의카운트인 1로 이루어져야한다.


        // split시키고 빈문자열 모두 replace로 제거한ㄷ 다음의 배열 길이는 곧 뒤집어야하는 횟수이다.
        // 단 이때 reaplce결과가 없다면 0이나 1 둘 중 하나로 통일된 문자열이란 뜻이므로 0을 출력한다.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tmp1 = str;
        String tmp2 = str;
        String[] one_array = tmp1.split("0");
        String [] zero_array = tmp2.split("1");
        int zero_count = 0;
        int one_count = 0;

        for(int i = 0 ; i<one_array.length; i++){
            if(!one_array[i].equals("")){

               one_count++;

            }
        }

        for(int i = 0 ; i<zero_array.length ; i++){
            if(!zero_array[i].equals("")){

                zero_count++;

            }
        }

        int result = zero_count > one_count ? one_count : zero_count;
        System.out.println(result);
    }
}
