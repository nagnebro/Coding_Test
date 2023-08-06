package BaekJoon.silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Num1431 {

    public static void main(String[] args) {

        //     다솜이는 기타를 많이 가지고 있다. 그리고 각각의 기타는 모두 다른 시리얼 번호를 가지고 있다. 다솜이는 기타를 빨리 찾아서 빨리
//        사람들에게 연주해주기 위해서 기타를 시리얼 번호 순서대로 정렬하고자 한다.
//
//        모든 시리얼 번호는 알파벳 대문자 (A-Z)와 숫자 (0-9)로 이루어져 있다.
//
//                시리얼번호 A가 시리얼번호 B의 앞에 오는 경우는 다음과 같다.
//
//        1. A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
//        2. 만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
//        3. 만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
//        시리얼이 주어졌을 때, 정렬해서 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 기타의 개수 N이 주어진다. N은 50보다 작거나 같다. 둘째 줄부터 N개의 줄에 시리얼 번호가 하나씩 주어진다.
//        시리얼 번호의 길이는 최대 50이고, 알파벳 대문자 또는 숫자로만 이루어져 있다. 시리얼 번호는 중복되지 않는다.

        // 모두 길이가 같은 문자열이 들어왔다고 했을떄의 예외상황이 좀 거슬린다.
        // 입력이 0일수도 있나?
        // 로직을 다음과 같이 그성한다
        // for문 2개를 만든다.
        //바깥 for문은 입력으로 들어온 리스트 전체를 처음부터 끝까지 돌린다
        // 안쪽for문은 바깥 for문의 요소로 선택된 녀석과 안쪽 for문의 요소로 선택된 요소를 비교한다. 인덱스 각 i와 j
        // 안쪽 for문의 첫번째 조건
        // 1. 조건문 첫번쨰 길이가 짧은지 아닌지 비교한다.
        // 2. 길이가 같다면 그 조건문안에서 다시 조건문이 분기한다
        // 2-1. array i와 arrayj의 길이만큼 돌리는 for문을 돌린다. 이떄 if문 조건으로 charAt아스키 코드가숫자인 부분의 합을 더해서
        // 더 작은 값의 앞에 저장한다.
        // 이떄 합의 결과가 다르다면 위 인덱스 저장을 시행하지만
        // 3. 같다면 다시 그안에서 조건문이 분기한다. compareto를 이용해 앞서는 녀석을 먼저 내세운다. 숫자가 알파벳보다 사전순으로 작다.
        // 이떄 인덱스변경은 arrayList의 set을 사용한다

        // 조건문을 잘 작성해야한다. 길이가 4인 문자열 4개가 있다고 했을 때 입력 문자열이 있다고하자
        // 그 문자열은 문자열 첫번째만 비교해서는 안되고 길이가 4인 문자열 4개까지는 비교해야한다.
        // 이 떄 앞서는경우. 즉 앞에 있어야 하는경우애만 인덱스를 변경시킨다. 뒤로 갈 수 있는 경우는 계속 생길 수 있기 때문이다.

        // 결국 버블정렬을 해야하나?
        // 버블정렬에 1~3번의 조건식이 붙은 경우라고 할 수 있다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrayList = new String[n];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            arrayList[i] = sc.next();
        }
        // 일단 배열에 아무렇게나 다집어넣는다.


        for (int i = 0; i < n - 1; i++) { // 길이순 정렬

            for (int j = 0; j < n - 1 - i; j++) {
                if (arrayList[j].length() > arrayList[j + 1].length()) {
                    String tmp = arrayList[j];
                    arrayList[j] = arrayList[j + 1];
                    arrayList[j + 1] = tmp;
                    j -= 1;

                }

            }
        }


        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arrayList[j].length() == arrayList[j + 1].length()) { // 2번조건실행

                    sum1 = 0;
                    sum2 = 0;
                    for (int k = 0; k < arrayList[j].length(); k++) {

                        if ('1' <= arrayList[j].charAt(k) && arrayList[j].charAt(k) <= '9') {

                            sum1 += Integer.parseInt(arrayList[j].charAt(k)+"");


                        }
                        if ('1' <= arrayList[j + 1].charAt(k) && arrayList[j + 1].charAt(k) <= '9') {


                            sum2 += Integer.parseInt(arrayList[j + 1].charAt(k)+"");
                        }


                    }

                    if (sum1 > sum2) { // sum1<sum2의 경우에는 계산하지 않아도 된다. 어차피 앞에 있었기 때문이다. 그리고
                        //앞에서부터 비교하고 오기 때문에 그앞의 것과도 비교하지 않아도 된다.

                        String tmp = arrayList[j];
                        arrayList[j] = arrayList[j + 1];
                        arrayList[j + 1] = tmp;
                        // 다시 한번 조건에 맞게 순서를 바꿔준다.

                    } else if (sum1 == sum2) { // 3번조건실행
                        int result = arrayList[j].compareTo(arrayList[j + 1]);


                        if (result > 0) { // result가 0보다 크다는 것은 앞에 문자열이 더 크다는 것이므로 위치를 바꿔준다.

                            String tmp = arrayList[j];
                            arrayList[j] = arrayList[j + 1];
                            arrayList[j + 1] = tmp;
                        }

                    }

                }
                // < 의 경우에는 그냥 멈추면 된다. 어차피 길이같을 경우가 먼저 실행되기 때문에
                // 길이같은애들끼리는 정렬이 끝날 것이다.
            }
        }
        // for문의 끝

        for(int i = 0 ; i < n ; i ++){
            System.out.println(arrayList[i]);
        }

    }


}


// 버블정렬 테스트.
class Test4 {

    public static void main(String[] args) {


        int tmp = 0;
        int[] array = {4, 2, 5, 1, 6, 7, 3};

        //큰값을 뒤로보내며 정렬시키는 버블정렬.
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("A910".compareTo("145C"));
    }
}