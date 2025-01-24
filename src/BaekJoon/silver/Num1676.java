//package BaekJoon.silver;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class Num1676 {
//
//    public static void main(String[] args) {
//
//        // 예외상항. 비교하려는 문자열의 길이보다 for문의 범위를 길게 작성하지마라.
//        // 그리고 총0의개수가 아니라 연속적으로 0의개수가 나와야한다.
//
//
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        double sum = 1;
//        int count = 0;
//        BigInteger sum;
//        for(int i = n ; i>= 1 ; i--){
//            sum *= i;
//
//
//        }
//
//
//
//        String str = sum+"";
//        System.out.println(str);
//
//        // 여기서 굳이 인덱스로 접근하게 되면 마지막에 비교할떄 걸리적거린다던지 +1만큼만 검사하고
//        // 밖에서 예외처리해줘야한다던지 하는 불편함이 있다
//        // 그러나 str.charAt(i) == '0'일동안만 실행하게 되면 바로 for문을 탈출하므로
//        // 거기까지 구한 count가 정답이 되는 것이다.
//        for(int i = str.length()-1 ; i>=str.length()-20 && str.charAt(i) == '0' ; i--){
//
//            count++;
//        }
//        System.out.println(str);
//        System.out.println(sum);
//        System.out.println(count);
//
//
//    }
//}
