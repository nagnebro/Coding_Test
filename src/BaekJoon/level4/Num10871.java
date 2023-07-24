package BaekJoon.level4;


import java.util.Scanner;

public class Num10871 {

    // 풀긴 풀었지만 메모리 사용량도 많고 굉장히 비효율적이라 느껴진다.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] first_line = sc.nextLine().split(" ");
        String [] second_line = sc.nextLine().split(" ");
        String result = "";

        for(int i = 0; i < Integer.parseInt(first_line[0]); i++){

            if(Integer.parseInt(first_line[1])>Integer.parseInt(second_line[i])){

                result += second_line[i]+" ";
                // 만약에 오답처리가 된다면 마지막 문자열에 공백이 있기 때문일 것.
            }

        }
        System.out.println(result);
    }
}

class Test{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());

    }
}
