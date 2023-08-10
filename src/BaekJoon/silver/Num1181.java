package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1181 {

    public static void main(String[] args) {


        // 우선 모든 입력을 배열에 저장한다
        // 버블정렬로 정렬을 해야하나?해쉬코드로 버블정렬
        // 굳이 정렬을 하고 뽑아내야하나


        // 오답 시간초과. 출력초과

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {


            array[i] = sc.next();


        }


        // 문자열의 길이대로 버블정렬을 하되 그떄 길이가 같다면 사전순으로 정렬한다
        // 버블정렬을 할떄 길이순으로 해버리면 길이가 같은데 서로 다른 문자열일 경우에는 이미 앞에 정렬이 된 상태에서
        for (int i = 0; i < array.length - 1; i++) {

            String tmp = "";
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j].length() > array[j + 1].length()) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }

            }
        }



        for (int i = 0; i < array.length-1 ; i++) {

            String tmp = "";
            for (int j = 0; j < array.length -1 - i; j++) {


                if ( (array[j].length() == array[j + 1].length() ) && ( array[j].hashCode() > array[j + 1].hashCode() ) ) {


                    // 해쉬코드가 크다는 것은 사전순으로 더 뒤에 있다는 것이다.
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }
        }


        String result = "";
        for (int i = 0; i < array.length - 1; i++) {

            if (!array[i].equals(array[i + 1])) {

                result += array[i] + "\n";

            }
        }
        System.out.println(result + array[array.length - 1]);


    }
}
