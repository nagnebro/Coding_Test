package BaekJoon.level4;

import java.util.ArrayList;
import java.util.Scanner;

public class Num3052 {

    public static void main(String[] args) {

        // 입력값의 범위는 음이 아닌 정수. 즉 0이 포함돼있기 때문에 예외가 발생할 수 있나..?

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // 2가지 방법,
        // 1. 배열에 집어넣을때부터 중복값을 검사하던지
        // 2. 배열에 일단 다 집어넣고 중복값 제거하기 -> 어차피 중복값을 확인하는 과정에서 또 검사하기 때문에 1번을 선택.

        for(int i = 0 ; i < 10 ; i++){

            int num = Integer.parseInt(sc.next());
            int value = num%42;
            if(!list.contains(value)){
                list.add(value);
            }

        }
        System.out.println(list.size());

    }
}
