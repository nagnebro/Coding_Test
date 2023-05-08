package Programmers;

import java.util.Arrays;
public class Lv1_명예의_전당 {

    public static  int[] solution(int k, int[] score) {
        int[] answer = new int[k];
        int[] result = new int[score.length];
        int min = score[0];
        //우선 명예의 전당에 올라가있는 명단을 저장할 배열을 만든 후 거기서 최소값을 저장할 변수를 지정한다.
        //길이가 k인 int배열을 생성한 후 배열에 저장. 이후부터는
        // 최소값보다 크면 배열에 들어오게끔 설정.
        //answer = 명예의 전당을 잠시 저장하는 배열
        //

        System.out.println(Arrays.toString(answer));
        for (int i = 0; i<score.length ; i++){
            Arrays.sort(answer);

                if(min < score[i]){
                    answer[0] = score[i];
                    Arrays.sort(answer);
                    min = answer[0];

                }
                result[i] = min;
        }
        return result;
    }

    public static void main(String[] args) {
        solution(3,new int[5]);
    }
}
