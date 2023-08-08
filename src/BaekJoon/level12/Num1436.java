package BaekJoon.level12;

import java.util.Scanner;

public class Num1436 {

    public static void main(String[] args) {

        // 666이 어떤 자리에든 들어가있기만 하면 된다는 것
        // 그러면 15666 이 됐을 떄 그다음 영화의 제목은
        // 16666이 아니라 16661
        // 16662... 16669
        // 17666 이렇게 넘어가야한다.

        // 25666 n번쨰 영화제목
        // 26666

        // 수식을 만들 수 있을지 for문을 돌려야 풀리는지 빨리 판단해야한다.
        //

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        int count = 0;

        for(int i = 665 ; count != n ; i++){



            if((i+"").contains("666")){
                count++;
                result = i;
            }
        }
        System.out.println(result);

    }
}
