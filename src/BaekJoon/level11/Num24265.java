package BaekJoon.level11;

import java.util.Scanner;

public class Num24265 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long count = 0L;

        for(int i = 1 ; i <= n-1; i++){

            count += n - (i+1)+1;
            // 안쪽 for문의 반복횟수는 안쪽 for문의 조건식 범위와 같다.
            // 즉  i + 1 ~ n 까지 도는데 이 때 i의 값은 계속 변하게 된다.
            // 이 때 이 for문은 n - (i+1) +1번 만큼 돈다. (ex 1~2로 설정돼있으면 2번인것과 같기 때문에 1을 더해준다)

        }
        System.out.println(count);
        System.out.println(2);

    }
}
