package BaekJoon.level8;

import java.util.Scanner;

public class Num11005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number_length = (number+"").length();
        int b = sc.nextInt();
        int ascii = 'A' - 10;
        int nameoji = 0; // 나누고 남은 나머지, 즉 더해야할 수.
        String result = "";
        int mok = 0 ;

        // n진법을 계산하는 기본 수식은 다음과 같다
        // 10진법으로 나타낸 수 n이 있다고 하자 이를 8진수로 바꾸기 위해서는 다음과 같다.
        // n을 8로 나눈다. 이때 8로 나눈 몫이 한번 더나눠야하는 값이 된다.
        // 이떄 나누고 남은 나머지는 일의자리수이다.



        do{

            // 일의자리수부터 채워야하기 떄문에 앞에다가 더해준다.
            nameoji = number % b; // 1~9는 그냥 저장해도 되지만 10~35는 알파벳으로 치환해야한다. 따라서 ascii변수를 더해준다.
            mok = number/b;
            number = mok;

            if (nameoji >= 10) {
                char alphabet = (char) (nameoji + ascii);
                result = alphabet + result;


            }else {
                result = nameoji + result;
            }

            if(mok < b ){
                if (mok >= 10) {
                    char alphabet = (char) (mok + ascii);
                    result = alphabet + result;
                    break;

                }
                result = mok + result;
                break;
            }
        }while(mok >= b);
        // 주어진 b진법과 수 n이 있을 때 b보다 n이 작게 주어지는 경우에는
        // 쓸데없이 앞에 mok 혹은 알파벳을 붙이게 된다. 이 while문은 적어도 1번은 나누었을 때에 실행해야하는 로직이다.
        // 조건을 추가해준다.

        if((result.charAt(0)+"").equals("0")){

            result = result.substring(1);
        }

        System.out.println(result);
    }
}
