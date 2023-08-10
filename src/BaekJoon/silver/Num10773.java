package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num10773 {

    public static void main(String[] args) {

        // 정수가 0일경우에 지울 수 있는 수가 있음을 보장한다 -> 즉 지울 수가 없는데 지우지 않겟다 , 인덱스 에러를 발생시키지 않겠다
        // 가령 쓴수가 5인데 지우는 수를 6으로 하지않겠단것.
        // 따라서 배열의 크기는 k/2 +1로만 해도 충분하다.
        // 예외상황을 생각해보자.
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int [] array = new int[k];
        int result = 0;
        int idx = 0; // 배열의 idx는 따로 가야한다.
        int count = 0; //

        for(int i = 0 ; i < k ; i ++){


            int num = sc.nextInt();
            if(num!=0){

                array[idx] = num;
                idx++;
            }else{ // 입력으로 0이 들어온 경우에는 배열의 가장 마지막 값을 삭제해줘야한다. 이떄 가장 최근에 0이아닌 숫자가 들어왔을떄의 인덱스를 저장하고 있을 것이니
                // 증감식이 더해진 후라서 idx-1로 접근하면 되낟.

                if(idx==0){
                    continue;
                }
                idx-=1;
                array[idx] = 0;


            }

        }

        for(int i = 0 ; i<array.length; i ++){
            result += array[i];
        }


        System.out.println(result);
    }
}
