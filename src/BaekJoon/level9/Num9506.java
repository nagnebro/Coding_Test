package BaekJoon.level9;

import java.util.ArrayList;
import java.util.Scanner;

public class Num9506 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while(true){


            int num = sc.nextInt();

            if(num == -1){break;}
            ArrayList<Integer> arrayList = new ArrayList<>();
            int sum = 0;
            String answer = "";

            for(int i = 1 ; i <num ; i++){ // 자기자신은 제외하기 위해 i<num의 조건식을 사용한다.

                if(num%i == 0){
                    arrayList.add(i);
                    sum += i;
                }
            }

            if(sum == num) {
                answer = String.format("%d =",num);
                for (int i = 0; i < arrayList.size()-1; i++) {
                    answer += String.format(" %d +",arrayList.get(i));
                }
                answer += " " + arrayList.get(arrayList.size()-1);
            }else{
                answer = String.format("%d is NOT perfect.",num);
            }

            System.out.println(answer);
        }
    }
}
