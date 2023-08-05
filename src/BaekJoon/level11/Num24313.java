package BaekJoon.level11;

import java.util.Scanner;

public class Num24313 {

    public static void main(String[] args) {


        // 문제를 간단하게 이해하자면 다음과 같다
        // g(n)이라는 함수가 있고 f(n)이라는 함수가 있다.
        // 이 때 빅O 표기법에 충족하려면 n0보다 큰 모든 n에 대하여 f(n) <= c * g(n) 이어야한다.
        // f(n) = a1n + a0로 나타낼 수 있다.  (입력들어오는 순서도 a1, a0다 단 이때 a의 절대값의 범위가 주어졌기 때문에
        // 음수가 들어올 수 있음을 감안해야한다.

        // 또한 g(n)은 그냥 n을 나타내는 듯하다.  따라서 요약하자면
        //  (a1*n + a0 ) <= c * g(n) 을 만족하면 1아니면 0이다 -> 이렇게 단순할리가 없을텐데...?

        // g(n)이 어째서 n그대로라고 볼 수 있는거지?
        // 우선 n0보다 n이 더큰 경우에 예외사항은 없다.
        // 오히려 n이 n0보다 커질수록 그 격차는 더 심하게 커진다 (c x g(n))이 더커진다는뜻.
        // 즉 원소나열의 조건의최소값인 n0 로 원소조건을 비교하는것은 맞다. 그러나 어떤 예외사항이 있는듯하다
        // a0와 a1이 음수로 들어올 수 있다. 그러나 오히려 a1나 a0가 음수로 들어와도 fn의 값이 작아지기 때문에
        // 조건에 영향을 미치지는 않는다. n의 범위가 n>1이기 때문에 곱해서 양수가 되는일이 없기 떄문이다.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int result = -1;
        if( a0 <= (c * n)-(a1*n)){
            result = 1;
        }else{
            result = 0;
        }
        System.out.println(result);

    }
}
