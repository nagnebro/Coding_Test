package BaekJoon.level9;

import java.util.Scanner;

public class Num11653 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int n = original;

        do{

            for(int i = 2 ; i <= n; i++){ //굳이 n까지 돌릴 필요도없다 어차피 자기 자신/2(홀수는 아예제외)이상의 수는 약수가 될 수없기 때문이다.
                if(n%i == 0){
                    System.out.println(i);
                    n /= i;
                    break;
                }else if(i==n){
                    break;
                }
            }
        }while(n>2);

    }
}
