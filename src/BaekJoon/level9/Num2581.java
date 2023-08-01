package BaekJoon.level9;

import java.util.Scanner;

public class Num2581 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        int min = num2; // 최소값이 뭐가 될지 모르니 우선 가장 큰수로 해놔야 작은 수가 나왔을 때 값이 바뀔 수 있다.

        // 이떄 입력값으로 1은 소수가 아니며 2는 범위값 설정에서 잘못돼있다.
        for(int i = num1; i <= num2 ; i++){
            int count = 0; // 체크값은 다시 초기화해줘야한다.

            // 1같은경우는 이 for문을 시작하기도 전에 나가므로 check = false인 상태이다.
            for(int j = 1; j < i ; j++){ // 1과 자기 자신을 제외한 수로 나눴을 때 나머지가 0이면 그 수는 소수이다.
                                    // 사실 이것도 범위값을 굳이 i까지 할필요도 없이 i/2 +1 까지만 해줘도 된다.
                                    // 그러나 2같은 숫자처럼 예외적인 숫자가 들어왓을때는 이 for문을 시작조차 하지못한다.
                                    // 프로그램 효율을 생각하면 1에 대한 예외처리를 하고 이 for문의 조건식을 j <= i/2 +1으로
                                    //바꿔주는 편이 효율적일 것.
                if(i%j==0) {
                    // 우선 1로 나눳을떄 기본적으로 1이 증가하게 돼있다.
                    count++;
                    if (count == 2) {

                        break;

                    }
                }
            }
            if(count == 1){ // break돼서 나온게 아니라면 for문이 모두 끝나고 나왔다는 것이고 i가 곧 소수임을 뜻한다.
                sum += i;

                if( min >= i){
                    min = i;
                }
            }
        }

        if(sum == 0){
            System.out.print(-1);
        }else{
            System.out.println(sum);
            System.out.print(min);
        }
    }
}
