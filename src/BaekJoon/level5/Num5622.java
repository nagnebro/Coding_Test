package BaekJoon.level5;

import java.util.Scanner;

public class Num5622 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int result = 0;
        // 공통적으로 반복시켜야할 로직을 찾지 못하겠다.
        // if - elseif 문으로만 풀어야하나
        for(int i = 0; i < input.length ; i++){

            if(('P' <= input[i] && input[i]<='S')){

                result += 8;
            }if('W' <= input[i] && input[i]<='Z'){
                result += 10;
            }else{

                result += (input[i]%'A')/3 + 3;

            }

        }
        System.out.println(result);

    }
}
