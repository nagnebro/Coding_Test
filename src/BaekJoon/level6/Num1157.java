package BaekJoon.level6;

import java.util.Arrays;
import java.util.Scanner;

public class Num1157 {

    public static void main(String[] args) {

        // 1. 대소문자를 어떻게 다르게 비교할 것인가
        // 2. 해당문자가 가장 많이 있었다는 것을 어떻게 알것인가.
        // 3. 횟수가 같이 사용된 알파벳에 대한 예외처리.

        // a~z까지의 길이를 똑같이 가진 배열을 만들고 그 배열에 입력받은 문자열의 인덱스에 해당하는 곳의 요소를 +1 시킨다.
        // 이후에 max값을 찾으면서 그때의 idx도 같이 저장해 놓는다.  이떄 새로운 max를 찾으면  prev_max에 현재의 max를 넘기고 더큰 값은 max에 집어넣는다.
        // 그 뒤로 prev_max와 max값이 같다면 ?를 출력하고 다르다면 max의 idx를 이용해 charAt으로 해당문자를 출력한다. 이때 출력은 무조건 대문자여도 된다
        // 따라서 초기에 비교할떄 대소문자를 헷갈리지 않기 위해 입력받은 문자열을 모두 대문자로 치환한다.

        Scanner sc = new Scanner(System.in);
        char []  str = sc.next().toCharArray();
        int ascii_gap = 'A'-'a';
        int [] count_array = new int[26]; // 알파벳의 개수만큼 알파벳의 카운트를 셀수 있는 배열을 생성한다.
        int prev_max = 0; // 입력이 아에들어오지 않는 경우를 생각해도 0으로 초기화ㄷ해도 괜찮다.
        int max = 0;
        int idx = -1;

        //대문자로 초기화한다.
        for( int i = 0 ; i<str.length; i++){

            if('a' <=  str[i] && str[i] <= 'z'){ // 소문자라면 asciigap을 더해준다 ascii gap이 -든 +든관계없다
                // 위 수식에 의해서 어쩃든 소문자에 ascii gap을 더하면 대문자가 나올수 밖에 없다.
                str[i] += ascii_gap;
            }
        }

        for(int j = 0 ; j < str.length ; j++){

            count_array[str[j]-'A'] += 1;
        }


        // max 값을 구한다.
        for(int k = 0; k < count_array.length; k++){

            if(max <= count_array[k]){
                prev_max = max; // 현재 최대값을 이전값으로 넘겨준다.
                max = count_array[k]; //현재값에 더 큰값을 집어넣는다.
                idx = k;
            }
        }

        if(max != prev_max){

            System.out.println((char)(idx+'A'));
        }else{
            System.out.println("?");
        }



    }
}
