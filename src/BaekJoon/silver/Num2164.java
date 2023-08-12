package BaekJoon.silver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Num2164 {

    public static void main(String[] args) {

        // 시간복잡도적인 측면에서 바라봣을 떄 50만개의 카드를 배열에 초기화하는 것부터 시간 낭비인가
        // 그러면 초기화를 하지 않고 바로 로직을 수행하는 방법을 써야하나

        // 로직의 규칙은 이렇다. 홀수 번쨰 일떄 카드를 버리고 짝수 번쨰 카드를 아래로 옮긴다.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();


        // 자료의 추가 삭제가 빈번한 경우에는 LinkedList가 훨씬 유리하다
        // ArrayList는 내부적으로 자료를 추가삭제할때에 새로운 배열을 생성했다가
        // 값을 옮기는 식으로 진행되기 때문에 LinkedList를 이용하는 것이 좋다
        // LinkedList는 노드로 연결돼있기 떄문에 자료의 삭제나 생성에 유리하다.
        

        // 8이라고해보자
        // 1 2 3 4 5 6 7 8
        // 3 4 5 6 7 8 2
        // 5 6 7 8 2 4
        // 7 8 2 4 6
        // 2 4 6 8
        // 6 8 4
        // 4 8
        // 8

        for(int i = 1 ; i <= n ; i++){

            list2.add(i);
        }


        while(list2.size()!=1){

            list2.remove(0);
            int tmp = list2.get(0);
            list2.remove(0);

            list2.add(list2.size(), tmp);


        }
        System.out.println(list2.get(0));
    }
}
