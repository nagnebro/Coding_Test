package BaekJoon.silver;

import java.util.Scanner;

public class Num1740 {

    public static void main(String[] args) {

        // 미제출
        // 한개 이상의 서로 다른 거듭제곱수의 합으로 나타낼 수 있는 수 중에서 n번쨰로 작은 수를 구하여라
        // 1부터 n(무한대)까지 비교하는데 이떄의 수를(for문의 i로 설정할 것) i라고 한다.
        // 1 3 9 27 81 차례대로 3의 제곱이다.
        // 1, 3,4,9 10, 12, 27, 28, 30, 39,40, 81, 82...
        // 즉 앞에 나온 수들의 합을 모두 더한 후에 다음 제곱으로 넘어가야한다.
        // 이떄 이들의 합으로 나타낼 수 있는 n번쨰로 작은 수를 구하여라.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        long num = 0;

        for(int i = 0 ; true; i++){ // 3의 제곱수를 증가시켜주는 for문.

            for(int j = 0 ; j <= i ; j++){ // 0제곱부터 i제곱만큼 합을 더한다. 이떄
                num += Math.pow(3,i);
                count++;
                if(count == n){
                    System.out.println(num);
                    return;
                }

            }

        }
    }
}
