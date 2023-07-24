package BaekJoon.level4;

import java.util.Scanner;

public class Num5597 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        // 어차피 출석번호가 곧 인덱스번호와 같기 떄문에 입력으로 주어지는 출석번호에서 1을 뺀 값이 곧 배열의 인덱스번호가 된다.
        byte []  num_array = new byte[30]; // 초기값이 0으로 설정돼있을 것.

        for(byte i = 0 ; i <28 ; i++){

            byte num = sc.nextByte();
            num_array[num-1] = 1; // 출석번호를 입력으로 받게되면 해당 출석번호의 요소값을 1로 변경해준다.
            // 그리고 요소값이 0인 것들을 for문이 끝난 후 index로 뽑아낸다.
            // 여기서 의문점은 그냥byte배열을 for문으로 다시 돌려서 조건문을 통해 요소값을 비교해서 인덱스를 찾아내는 편이 나은지
            // 혹은 문자열을 indexOf로 뽑ㅂ아내는 것이 더 나은지 모르겠다. indexOf메서드도 결국에는 요소를 찾아내기 위해
            // 반복적인 작업을 수행할 것이고 단순히 메서드를 사용한다고 해서 효율적이라고는 할 수 없다는 것.
            // 물론 그 메서드가 같은 결과를 가져오는 내가 작성한 코드보다는 훨씬 효율적이겠지만.
            // indexof를 이용하고자 String타입의 배열을 쓰는것은 메[모리 사용량이 많지만 사실
            // 엄청난 크기의 배열을 생성하는 것이 아닌 이상은 더 괜찮을 수 있다...?
            //비교해보자. byte로 한것과 string으로 indexof한것과
        }

        for(int j = 0 ; j < num_array.length ; j++){

            if(num_array[j] == 0){
                System.out.println(j+1);
            }
        }

    }
}

class Num5597_2{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        // 어차피 출석번호가 곧 인덱스번호와 같기 떄문에 입력으로 주어지는 출석번호에서 1을 뺀 값이 곧 배열의 인덱스번호가 된다.
        String []  num_array = new String[30]; // 초기값이 0으로 설정돼있을 것.

        for(byte i = 0 ; i <28 ; i++){

            byte num = sc.nextByte();
            num_array[num-1] = "1"; // 출석번호를 입력으로 받게되면 해당 출석번호의 요소값을 1로 변경해준다.
            // 그리고 요소값이 0인 것들을 for문이 끝난 후 index로 뽑아낸다.
            // 여기서 의문점은 그냥byte배열을 for문으로 다시 돌려서 조건문을 통해 요소값을 비교해서 인덱스를 찾아내는 편이 나은지
            // 혹은 문자열을 indexOf로 뽑ㅂ아내는 것이 더 나은지 모르겠다. indexOf메서드도 결국에는 요소를 찾아내기 위해
            // 반복적인 작업을 수행할 것이고 단순히 메서드를 사용한다고 해서 효율적이라고는 할 수 없다는 것.
            // 물론 그 메서드가 같은 결과를 가져오는 내가 작성한 코드보다는 훨씬 효율적이겠지만.
            // indexof를 이용하고자 String타입의 배열을 쓰는것은 메[모리 사용량이 많지만 사실
            // 엄청난 크기의 배열을 생성하는 것이 아닌 이상은 더 괜찮을 수 있다...?
            //비교해보자. byte로 한것과 string으로 indexof한것과
        }



    }
}
