package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num1138 {

    public static void main(String[] args) {

        // 입력으로 주어지는 순서는 키가 1인사람부터 키가 n인 사람까지의 순서를 뜻한다
        // 즉 2 1 1 0 이런식으로 주어지면
        // 키가 1인사람왼쪽에는 자기보다 키 큰사람이 2명이 있었단거고
        // 키가 2인사람 왼쪽에는 자기보다 키큰 사람이 1명있었단거고
        // 키가 3인사람 왼쪽에는 3명이 있엇단거고..
        // 이렇게ㅜ 해서 실제 줄을 선 사람들이 어떻게 서있었는지, 그 사람들의 키를 출력하란 것이다.

        // 우선 처음부터 비교한다
        // 키가 1인 사람의 왼쪽에 본인보다 키큰 사람이 2명있었다는 거는 세번째에 서있다는 거다. 그사람보다 키 작은 사람은 없기 때문이다.
        // 키가 2인사람의 왼쪽에 본인보다 키큰 사람이 1명이 있다면 2번째에 서있을 것이다.
        // 일단 키가 1인사람의 위치는 확실히 구할 수 잇다.
        // 이후에 키가 2인사람부터는 알고리즘을 통해 구해야한다.
        // 변수는 다음과 같다. 사람의 위치 : idx
        // 입력으로 들어온 people_count는 왼쪽에 사람이 몇명잉ㅆ었느지를 나타낸다.
        // idx는 for문의 i값 + people_count를 더한다. 그 값이 그 사람이 서있는 위치가 되고
        //  그 idx에 맞게 배열에 i +1(i=0일 것이므로)을 저장한다.
        // array[idx] = i+1 이 될것이다.
        // 앞전의 사람이 몇번째 서있는지 인덱스를 저장한다.
        // 그리고 그 다음사람보다 그 사람의 인덱스가 작다면, 즉 앞에있다면 그 사람을

        // 앞에 키가작은 사람이 몇명 섰는지 카운트한다
        // 그 사람의 카운트만큼 건너뛰어야한다
        // 가령 2 2 2이렇게 입력이 들어오면
        // 1보다 키큰사람이 왼쪽에 2, 2보다 키큰사람이 왼쪽에 2인데
        // 앞전의 people_count를 저장하고 있는 변수 prev_count가 지금 비교하고 있는 people_count와 같다면
        // for문의 흐름그대로 for문의 i + people_count를 해준다.
        // 그러나 people_count가 prev_count보다 크다면 , 앞에 키작은 사람이 몇명인지 저장하는
        // count변수를 추가적으로 더해줘야한다. i + people_count + count이다.
        // 그리고 people_count < prev_count 라면 peoplecount를 그대로 더해주면 된다. 앞전의 사람보다 앞에섰다는 뜻이다.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev_count = 0;
        int count = 0;
        int [] array = new int[n];
        int prev_idx = sc.nextInt(); // 처음 인덱스를 초기화하기 위해 입력값을 받는다.
        // 3가지 경우의 수가 있다.

        for(int i = 1 ; i < n ; i++){

            int idx = sc.nextInt();
            if(idx == prev_idx ){ // 뒤로 세운다
                array[idx+i] = i;
            }else if(idx < prev_idx){ // 앞으로 세운다.
                array[idx] = i;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
