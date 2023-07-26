package BaekJoon.level6;

import java.util.Scanner;

public class Num2941 {

    public static void main(String[] args) {


        //c와 d와 과 j와 z와 n과 s뒤에 각각 어떤 문자열 혹은 알파벳이 오는지 검사해야한다.
        // 만약 크로아티아 알파벳을 나타내는 알파벳, 혹은 특수기호가 아닐경우에는 그냥 알파벳으로 개수를 세야한다.
        // 뒤의 문자열을 검사하기 때무넹 indexOutOfRange 에외가 발생할 수 있다.


        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        for(int i = 0 ; i < str.length()-2 ; i++){ // dz=은 d가 나왔을때 2개뒤의 인덱스를 구해야하기 때문에 -2만큼만 검사하고 나머지는
            // 밖에서 검사하도록 한다. 그러나 이때 단어의 개수가 2보다 작거나 같으면 for문을 시작조차 할 수 없다.
            // 그렇지만 마지막 3개의 문자열에 대해서는 어차피 아래쪽에서 따로 for문으로 검사하기 때문에이 길이가 3보다 작아서 이 for문이 동작하지 않는 것은 문제가 없다.

            if(str.charAt(i)=='c'){
                str.charAt(i+1);
            }else if(str.charAt(i)=='d'){

            }else if(str.charAt(i)=='j'){

            }else if(str.charAt(i)=='n'){

            }else if(str.charAt(i)=='z'){

            }

        }


    }
}
