package BaekJoon.level11;

import java.util.Scanner;

public class Num24267 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0L;


        // 문제
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n - 2
//            for j <- i + 1 to n - 1
//            for k <- j + 1 to n
//            sum <- sum + A[i] × A[j] × A[k]; # 코드1
//            return sum;
//        }

        // 15 10 6 3 1 ... 이런식으로 더해져야한다.
        // 이 알고리즘의 for문 반복범위는 7이라고 가정했을떄
        // 모두 5의범위를 가진다. 즉 5 5 5였다가 4 4 4  3 3 3이된다.
        // 이때 for문이 2개였다면 그냥 하나의 팩토리얼만 구하면된다.
        // 예를들어 범위가 6 6 이면 6의 팩토리얼인 21이 안쪽 for문의 반복횟수가 될 것이다.
        // 이는 i와 j의 관계가 +1이기 때문에 가능한 것이다.

        // 이 문제도 똑같다. 다만 팩토리얼을 구하는데 이떄 팩토리얼을 구해야하는 최대 수가 1씩 작아지는 것 뿐이다
        // 즉 7이들어와서 5 5 5라면 5의 팩토리얼 1번을 구하는게 아니고
         //5의 팩토리얼 4의팩토리얼... 1의 팩토리얼까지의 합을 모두 구해야한다.
        // 즉 팩토리얼의 팩토리얼?같은 개념이다.



        for(long i = 0 ; i < n-2  ; i++){ // 여기서 n-2는 구해야하는 팩토리얼의 최대 숫자를 뜻한다.
            // 따라서 n-2와 i를 이용하면 유의미한 값을 구할 수 있다.
            // 팩토리얼을 수식으로 나타내려면?   54321 4321 321 21 1 과 같이 나타낼 수 있다.
            // 이를 간단하게 for문 1개를 이용해 나타낸다면? i의 값만 이용해보자.
            // 1은 5번 더하고 2는 4번더하고.. 5는 1번만 더하게끔 수식을 구현해야한다.
            count += (i+1) * (n-2-i); // 여기서 i+1은 더해야하는 팩토리얼의 최소값, 즉 1부터 시작되는 수를 뜻하고 n-2-i는 곱해져야하는 횟수를 뜻한다
            /// 1의경우 처음에는 5번이 곱해져야하고 2는 i=1이 되므로 4가 돼서 4번만 곱해지고.. 5는 i가 4가돼서 n-2-i는 1이되기때문에 1번만 곱해진다.

        }
        System.out.println(count);
        System.out.println(3);

    }
}

