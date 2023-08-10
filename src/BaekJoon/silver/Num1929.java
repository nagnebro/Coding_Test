package BaekJoon.silver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Num1929 {

    public static void main(String[] args) {


        //소수를 구할떄 대표적 예외상황이 1이나 2와 같은 숫자가 들어왔을 떄이다.
        // 소수는 1과 자기자신을 제외한 약수가 없어야한다.
        // 오답 ,시간초과. 아마 소수를 구하는 수학적 알고리즘이 있을 듯하다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result = "";


        for (int i = n; i < m; i++) { // n과 m사이의 범위값을 1씩 증가시켜주는 for문

            int count = i == 1 ? 1 : 0;

            for (int j = 2; j < i; j++) { // 이렇게 설정하면 2도 정상적으로 소수로 출력된다.  애초에 for문을 돌지 못하는데 count=0이기때문.

                if (i % j ==0) {
                    count = 1;
                    break;

                }
            }
            if(count != 1){
                try {
                    bw.write(i + "\n");
                    bw.flush();

                }catch (IOException e){
                }
            }
        }

    }

}
