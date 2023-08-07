package BaekJoon.silver;

import java.util.Scanner;

public class Num1343 {

    public static void main(String[] args) {


        // x만계속 나왔다고 가정했을 때 그것을A로 덮을 것인가 B로 덮을 것인가 하는 문제가 있다
        // 이는 마지막에길이가 남은 문자열 4개가 몇개인지를 모르기 때문이다.
        // 그래서 for문으로 무작정 덮어버리면 indexOutofException이 발생할 것이다.

        // replace로 X4개를 A로 먼저 덮은 후에
        // 나머지 XX를 B로 덮는다.
        // 이떄 문자열을 처음부터 끝까지 비교하는데 X가 있다면 다 덮인것이 아니니 -1을 출력한다

        // 물론 이는 메서드를 이용해 쉽게 구현한것이고 실제로 구현하고자하면 아마 다음과 같은 처리과정을 거칠 것이다
        // 우선 replace메서드를 실행한 문자열의 길이만큼 for문을 실행한다.
        // 그 다음 charAt으로 문자열을 replcae하고자하는 문자열길이만큼 더한다
        // 이때 replace하고자하는 문자열의 길이가 됐을 때마다 서로 equals로 비교하고 같다면 substring을 이용해 자른다음
        // 바꾸고자 하는 문자열을 앞에 붙여준다.
        // 이 작업을 게속반복한다. 이렇게 되면 인덱스를 벗어날 일도 없을 것 같다.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();



        str = str.replaceAll("XXXX","AAAA");
        str = str.replaceAll("XX","BB");
        for(int i = 0 ; i < str.length() ; i++){
            if((str.charAt(i)+"").equals("X")){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(str);



    }
}
