package BaekJoon.level7;

import java.util.Scanner;

public class Num10978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [][] array = new String[5][15]; // 단어의 최대 개수를 모르니 조건으로 주어진 15로 초기화한다.
        String answer = "";
        // 그러나 가장 좋은 방법은 주어진 단어의 최대길이를 열의(column) 길이로 설정하고
        // 다섯줄의 입력을 row(행)로 지정하는 것이다.
        // 다만 이때 최대값을 가진 단어를 알기 위해서는 일단 입력을 다 받아 저장한 상태에서 구해야하므로.. 비효율적이라도 그냥 15로 설정한다.


        for(int i = 0 ; i< 5 ; i ++){

            String [] line = sc.nextLine().split("");

            for(int j = 0 ; j < line.length ; j ++){

                array[i][j] = line[j]; // 이렇게 초기화하면 2차원 배열 array변수에 나머지값을 null일것이다.
                // 이 값을 이용해 출력떄 null은 생략하도록한다.
            }
        }

        for(int i = 0 ; i<15 ; i++){

            for(int j = 0 ; j < 5 ; j ++){
                if( array[j][i]!=null) {
                    answer += array[j][i];
                }
            }
        }
        System.out.println(answer);
    }

}

class Test3{

    public static void main(String[] args) {

        Scanner sc = new Scanner("a b c d\ne g d s");
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println("Aa0aPAf985Bz1EhCz2W3D1gkD6x".equals("Aa0aPAf985Bz1EhCz2W3D1gkD6x"));

    }
}
