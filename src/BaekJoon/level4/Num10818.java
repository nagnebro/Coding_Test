package BaekJoon.level4;

import java.util.Arrays;
import java.util.Scanner;

public class Num10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] numbers = sc.nextLine().split(" ");
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        for(int i = 0; i<n; i++){
            int comapre_num = Integer.parseInt(numbers[i]);
            if(comapre_num > max){
                max = comapre_num;
            }
            else if(comapre_num < min ){
                min = comapre_num;
            }

        }
        System.out.printf("%d %d",min,max);

    }
}

class Num10818_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] numbers = sc.nextLine().split(" ");
        // 문제상황 : 문자열배열을 char배열이나 int배열로 바꿔야만 sort가 올바르게 시행된다 뿐만아니라
        // 나중에 연산하는 문제에 있어서도 입력을 언제까지고 String타이브이 배열로만 받을 수는 없다.

        // for문의 조건문으로 최소 최대값을 찾기에는 너무 오래걸리기 때문에 sort를 이용해 처음과 끝의 값을 가져오려고 한다.
        // 그러나 내가 직접 알고리즘을 작성해
        // 버블정렬을 해서 인덱스의 처음과 끝을 가져오는 방법은 결국에 더 오래걸린다. 배열을 정리할 것이 아니라면 정렬을 할 필요는 없다
        // sort메서드의 효율이 얼마나 나올지 테스트하고 싶은 것 뿐.

        //
        int [] answer_array = new int[n];
        for(int i = 0 ; i < n; i++){

            answer_array[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(answer_array);
        System.out.printf("%d %d",answer_array[0],answer_array[answer_array.length-1]);

    }
}

