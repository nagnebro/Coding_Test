package BaekJoon.silver;

import java.util.Scanner;

public class Num1463 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int comp = n; // 계속 나눠지는 수 comp
        int count = 0; // 연산이 몇번 수행됐는지 저장할 변수o

        // 400ㅇㅣ라고 치면
        // 1을 빼고 3으로 나누면 133
        // 2로 2번나누면 100
        // 28이라치면
        // 2로 두번 나누면 7 1뺘면 6
        // 2로 3번 나누는 것보다
        // 1빼고 3으로 두번 나누는게 9로 나누는거라 더 크다. 그럼 그 다음은?
        // 23
        // 22 11 10 5 4 2 1
        // 22 11 10 9 3 1
        // 1빼고 3으로 두번 나누면 3


        while(comp != 1){
            if(comp % 3== 0) {
                comp /= 3;
                count ++;
            }
            else if(comp % 2== 0){
                if(comp % 4 == 0 ) { // 2로 2번 나눌 수 있는 경우 -1하고 3빼는것보다 이득임
                    comp /= 4;
                    count += 2;
                }else if(comp % 4 != 0&& ((comp-1)%3 ==0)) { // 2로 두번 못나누되 -1하고 3으로 될 경우
                    comp -= 1;
                    comp /= 3;
                    count += 2;
                }else{
                    comp /= 2;
                    count ++;
                }
            }
            else{
                comp -= 1;
                count++;
            }
        }
        System.out.println(count);



    }
}

// 1, 3, 4, 12, 13, 39, 40, 120
//
