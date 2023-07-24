package BaekJoon.level3;

import java.util.Scanner;
public class Num10951 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numbers = null;
        while(!(((numbers = sc.nextLine()).equals("")) || numbers==null)){
            // true or false의 조건이 조금은 헷갈릴 수 있다.
            // 반전연산자 !를 개별적으로 붙여주면 항상 true가 된다.
            // 따라서 || 연산자를 통해 나온 boolean형의 결과값을 반전연산자로 돌려버리면 하나라도 true이면(빈연산자이거나 null이거나)
            // false가 나오기 때문에 반복문이 종료된다.

            // hasNext로 푸는게 편하긴 하겠다.

            // 조건문에 splite을 미리 해버리면 null값일시에 split 메서드 실행하면서 NumberFormatException발생
            String [] numbers_array = numbers.split(" ");
            byte num1 = Byte.parseByte(numbers_array[0]);
            byte num2 = Byte.parseByte(numbers_array[1]);

            System.out.println(num1+num2);
        }


    }
}

class Num10951_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(sc.hasNext()){
            // true or false의 조건이 조금은 헷갈릴 수 있다.
            // 반전연산자 !를 개별적으로 붙여주면 항상 true가 된다.
            // 따라서 || 연산자를 통해 나온 boolean형의 결과값을 반전연산자로 돌려버리면 하나라도 true이면(빈연산자이거나 null이거나)
            // false가 나오기 때문에 반복문이 종료된다.

            // hasNext로 푸는게 편하긴 하겠다.

            // + 아래 클래스의 정답이 맞고 이 클래스의 로직은 오답처리가 된다.
            // NosuchElement에러가 발생하는데

            // 조건문에 splite을 미리 해버리면 null값일시에 split 메서드 실행하면서 NumberFormatException발생
            String [] numbers_array = sc.nextLine().split(" ");
            byte num1 = Byte.parseByte(numbers_array[0]);
            byte num2 = Byte.parseByte(numbers_array[1]);

            System.out.println(num1+num2);
        }


    }


}

class EOF_Test{

    public static void main(String[] args) {

        Scanner sc = new Scanner("안녕하세요");
        System.out.println(sc.hasNext());
        System.out.println(sc.next());
        System.out.println(sc.hasNext());
    }
}
