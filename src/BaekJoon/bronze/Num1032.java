package BaekJoon.bronze;

import java.util.Scanner;

public class Num1032 {

    public static void main(String[] args) {

        // 문자열의 자리수를 모두 비교해서 다른 값이 나온다 -> ?
        // .이 나온다 즉 .이 다 같으면 그냥 당연히 같은것이므로 그대로 냅두면 된디ㅏ
        // 즉 .이 들어왔을 경우의 예외처리는 없다는 것이다(입력조건이 그렇게 정해져있으므로)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] array = new String[n];
        String result = "";

        for(int i = 0 ; i < n; i ++){
            array[i] = sc.next();
        }

        for(int i = 0 ; i < array[0].length(); i ++){ // 첫번째 문자열의 길이만큼 각 자리수를 비교한다. 입력값이 1개만 들어올 수 있으므로
            // 배열의 첫번째 값으로 하는것이 가장 안전하다.
            // 여기서 문자열을 비교해야하는데 이때 배열의 모든 요소를 비교하는데 조금 비효율적이긴 하다.
            // 더 좋은 방법이 있을테지만.. 어쩃든 그 방법 역시 메서드를 이용해야할테니까 그냥 직접 하드코딩한다.
            char tmp = array[0].charAt(i); // 모든 비교의 기준점은 첫번째 문자로한다.
            boolean check = true;

            for(int j = 0 ; j<array.length; j++){
                if(tmp != array[j].charAt(i)){
                    check = false;
                    result+= "?";
                    break;
                }
            }

            if(check){ //for문을 다 돌고 나왔다면
                result += array[0].charAt(i);
            }
        }

        System.out.println(result);
    }
}
