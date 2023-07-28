package BaekJoon.level8;

import java.util.Scanner;

public class Num2745 {

    public static void main(String[] args) {


        // 알파벳을 이용한 진수표현의 한계가 있기 때문에 B진법에서 B의 값은 최대 36이다
        // 즉 36진법으로 했을 때 35를 표현하기 위해서는 마지막 알파벳인 Z를 이용하기 때문에
        // 37부터는 이용할 수 없다고 가정한다. (실제로도 진법표현에서 이렇게 허용하는지는 모르겠다)
        // 16진법으로 15를 F로 나타낼 수 있는 것과 같다.
        // 일의자리수부터 B x 자리수의 n승을 모두 더한 값이 10진법으로 나타낼 수 있는 수이다.

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // B진법으로 나타낸 수 N
        int ascii = 0; // 만약에 문자가 들어왔다면 문자에 해당하는 값만큼 뺴주기 위한 변수
        int b = sc.nextInt(); // B진법
        int result = 0;
        int number = 0;
        for(int i = str.length() ; i >= 1 ; i--){ // 여기서 i는 자리수이다.

            // 여기서 str.charAt의 결과값이 숫자일지 알파벳일지 모른다.
            // 알파벳인지 숫자인지를 비교할 수 있는 중복되는 조건은 생각하지 못하겠다.

            if('A' <=str.charAt(i-1) && str.charAt(i-1) <= 'Z'){

                number = str.charAt(i-1)-'A'+10;
            }else{


                number = str.charAt(i-1)-'1' + 1;
            }
            int test = (number) * (int)(Math.pow(b,str.length()-i));


            result += test;
        }

        System.out.println(result);




    }
}


