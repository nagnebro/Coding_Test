package BaekJoon.level6;

import java.util.Scanner;

public class Num1316 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // indexof랑 현재돌고있는 반복문의 증감변수i가 같은값이 아니면 중복된 값이 있다는 소리다
        // 이떄 내 바로앞에 그 문자가 있지 않다면 연속된 문자가 아니라는 증거이다.

        int count = sc.nextInt();
        int result = 0;

        for(int i = 0 ; i < count ; i++){

            boolean check = true;
            String input = sc.next();
            out : for(int j = 1; j < input.length(); j++){


                if(input.indexOf(input.charAt(j)) != j &&  input.charAt(j-1) != input.charAt(j)){
                    // 현재 검사하고 있는 문자가 있는 인덱스 번호와 현재 문자열의 인덱스가 같지않으면서
                    // 현재 검사하고 있는 문자열의 앞 문자열과 뒷문자열이 연속된 값이 아닐 경우

                    check = false;
                    break out;
                }

            }
            if(check){result+=1;}
        }

        System.out.println(result);

    }
}
