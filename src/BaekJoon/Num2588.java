package BaekJoon;

import java.io.*;
public class Num2588 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {

            // 두가지 풀이 방법이 있다.
            // 1. 첫번째 입력받은 숫자는 그대로 정수형으로 변환하고 두번째 입력받은 문자열은
            // 문자열 상태(String 타입의 변수) 그대로 받고 charAt을 이용해 일의 자리수, 십의자리수, 백의자리수와 첫번째 입력받은 숫자와
            // 곱해주면 된다.

            // 2. 두번째 방법은 첫번째 입력받은 수를 정수현으로 변환한 후에 두번째 입력받은 수를 10, 100, 1000으로 나눈 나머지로 첫번째수와 곱하게 되면 된다.


            // 두번째 방법 풀이.
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());

            int result1 = num1*(num2%10);
            int result2 = num1*((num2%100)/10);
            int result3 = num1*((num2%1000)/100);

//            bw.write(String.valueOf(result1)+"\n"+ String.valueOf(result2)+ "\n"+ String.valueOf(result3)+ "\n" + String.valueOf(num1*num2));
//            bw.flush();


            // 위 처럼 한줄에 작성하는 것보다 이렇게 작성하는 것이 실행시간도 빠르고 가독성도 훨씬 좋다.
            bw.write(String.valueOf(result1)+"\n");
            bw.write(String.valueOf(result2)+"\n");
            bw.write(String.valueOf(result3)+"\n");
            bw.write(String.valueOf(num1*num2));
            bw.flush();



        }catch(IOException e){

        }
    }


}

class Num2588_2{

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {

            throw new IOException();
            // 첫번째 방법 풀이.
            // 이 방법을 사용할 때 유의할점은 charAt으로 문자열을 인덱싱했을 때 산술기호를 통해 연산을 하게되면 인덱스값으로 계산이 된다는 것이다.
            // 따라서 charAt으로 요소를 가져온다 한들 결국에는 정수형으로 변환 후에 계산해야하기 때문에 두번째 방법이랑 다른 점이 없다. 효율적인 면이나
            // 방법론적인 면에서 크게 차이가 없다는 뜻. 나머지를 이용해 자리수를 구하느냐 혹은 문자열로 가져와서 그 문자열을 Integer로 캐스팅 시키느냐의 차이이다.

        }catch(IOException e){

        }
    }


}
