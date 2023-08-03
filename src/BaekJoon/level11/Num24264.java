package BaekJoon.level11;

import java.util.Scanner;

public class Num24264 {

    public static void main(String[] args) {


        // 다항식으로 나타냈을때는 0 + A[j]A[i]....의 형태가 될것이다.
        // 이 때 j와 i가 같은 순간이 있다면 그것은 제곱으로 나타낼 수 있으므로 A[x]^2으로 나타낼 수 있고
        // 이떄의 차수는 2가된다.
        Scanner sc=  new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(n*n);
        System.out.println(2);
    }
}
