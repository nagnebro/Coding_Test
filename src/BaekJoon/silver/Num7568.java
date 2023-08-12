package BaekJoon.silver;

import java.util.Scanner;

public class Num7568 {

    public static void main(String[] args) {

        // 버블정렬 알고리즘을 이용해서
        // 처음부터 끝까지 비교하고 본인보다 '덩치'가 큰사람을 counting (변수 k)한다.
        // 그럼 k+1이 그 사람의 등수가 되고
        // 그 변수를 그대로 크기가 n인 listK 배열에 저장한다.

        // 극단적인 상황 : 덩치가 같은 사람만 들어온다면 어떻게 처리해야하는가?


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] height = new int[n];
        int [] weight = new int[n];
        String listK = "";

        sc.nextLine();// 개행문자제거
        for(int i = 0 ; i < n ; i++){ // 배열 초기화

            String [] input = sc.nextLine().split(" ");
            weight[i] = Integer.parseInt(input[0]);
            height[i] = Integer.parseInt(input[1]);
        }

        for(int i = 0 ; i < n ;  i++){ // 비교대상인 사람의 idx

            int k = 0;

            for(int j = 0 ; j < n; j++){ // 비교대상과 비교당하는 사람의 idx. 자기자신은 비교하지 않아야한다. 이때 본인의 인덱스만 건너뛸수 있게 조건을 하나 추가해준다.
                // 어ㄷ쩄든 3번째 사람도 1,2번째 사람과 비교는 해야되기 때문에 j=0으로 설정해야 한다.

                if(i==j){
                    continue;
                }
                if(weight[i] < weight[j] && height[i] < height[j]){
                    k++;
                }

            }
            listK += k+1+" ";
        }
        System.out.println(listK);
    }
}
