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
            }else if('W' <= input[i] && input[i]<='Z'){
                result += 10;
            }else if('A' <= input[i] && input[i]<='C'){

                result += 3;

            }else if('D' <= input[i] && input[i]<='F'){

                result += 4;

            }else if('G' <= input[i] && input[i]<='I'){

                result += 5;

            }else if('J' <= input[i] && input[i]<='L'){

                result += 6;

            }else if('M' <= input[i] && input[i]<='O'){

                result += 7;

            }else if('T' <= input[i] && input[i]<='V'){

                result += 9;

            }

        }
        System.out.println(result);

    }
}

// 오답처리된 정답. else문이 잘못됐다.
// PQRS가 4개이기떄문에 /3으로 처리하는 것은 잘못됐다.

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        char[] input = sc.next().toCharArray();
//        int result = 0;
//        // 공통적으로 반복시켜야할 로직을 찾지 못하겠다.
//        // if - elseif 문으로만 풀어야하나
//        for(int i = 0; i < input.length ; i++){
//
//            if(('P' <= input[i] && input[i]<='S')){
//
//                result += 8;
//            }else if('W' <= input[i] && input[i]<='Z'){
//                result += 10;
//            }else{
//
//                result += (input[i]%'A')/3 + 3;
//
//            }
//
//        }
//        System.out.println(result);
//
//    }
//}
