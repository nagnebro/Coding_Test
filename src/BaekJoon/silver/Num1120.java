package BaekJoon.silver;

import java.util.Scanner;

public class Num1120 {

    public static void main(String[] args) {

        // 조건. A의 길이가 B의 길이보다 같거나작다.
        // 우선 A와 B를 비교한다. 이때 A와 B의 길이가 같은 경우는 제외하고
        // A의 길이는 B의 길이보다 작을 것이다.

        // 여기서 중요한 것은 기존에 주어진 문자열 A를 이용해서 최대한
        // B와 겹치는 부분을 찾는 것이다.
        // 어차피 할 수 있는 것은 문자열 A에 앞뒤로 붙이는 것 밖에 없으므로
        // 주어진 문자열을 최대한 활용해 같은 부분의 개수(a)를 구하고
        // a문자열과 b문자열의 길이차이 개수(b)를 구해서 더하면 답이된다
        // 왜냐하면 같은 부분을 찾은 이후에는 똑같이 붙이기만 하면 되므로 a의 빈공간만큼 b로 만들 수 있다고 봐야한다
        // A와 B가 완전히 다른 경우에도 길이의차이, 즉 a=0일것이기 떄문이다.
        // 그릐고 이때 해당 문자열간의 인덱스는 맞춰야한다. 겹치는 부분만 있다고해서 되는 것이 아니다.

        // b문자열의 길이만큼 a문자열의 길이를 하나씩 증가시키며 인덱스를 증가시켜본다.
        // 이때 각 인덱스를 비교하며 그 count가 가장 클떄 max값으로 구해놓고 그떄의 위치가 무엇인지 인덱스 값을 저장시켜놓는다.
        // 그렇게 되면 count는 같은 부분의 개수가 되는 것이고 이 값과 B의 길이와 A의 길이를 뺸 값을 더한다
        // B.length() - (count + (B.length()-A.length())

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int a_length = A.length();
        String B = sc.next();
        int min = a_length;
        int count = 0;
        for( int i = 0; A.length() <= B.length(); i++){ // 문자열A에 공백을 더해주는 for
            count = 0;


            for(int j = i ; j < A.length(); j++){ // 각 문자열의 인덱스를 비교하는 for문 . index는 이때 i를 통해 구해야한다.
                // 이렇게 j = i로 설정해놔야 빈문자열을 다르다고 인식하지 않을 것이다.
                if(A.charAt(j) != B.charAt(j)){ //
                    count ++;
                }
            }
            if(min > count){
                min = count;
            }
            A = " " + A;

        }
        System.out.println(min);
    }
}
