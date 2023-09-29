package BaekJoon.silver;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Num11651 {

    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;


        // 오답1 : 시간초과

        // 이유 : 버블정렬 알고리즘을 사용하면 시간복잡도가 바로 n의 제곱이 되어버리기 때문에(정확히는 n x n/2 에 가까울 것)
        // 입력값의 최대범위인 10만이개의 입력이 주어진다면 버블정렬 알고리즘에서 바로 박살나버림.

        // 해결방법 : treeSet을 이용한다.
        // TreeSet 자료구조의 특징은 중복된 값을 허용하지 않으면서도 요소를 정렬시키기 떄문에 문자열을 통쨰로 저장하고 정렬시키면된다.


        // 지금 내 생각으로는 y좌표를 기준으로 정렬하면서 x좌표도 당연히 같은 인덱스를 가져야하기 때문에 같이 정렬하되
        // 이때 y좌표의 값이 같다면 x좌표의 값을 기준으로 한 번 더 비교한후 x y좌표를 버블정렬하는 것.


        try{

            n = Integer.parseInt(br.readLine());

            int []  xArray = new int[n]; // x좌표를 저장하는 배열
            int []  yArray = new int[n]; // y좌표를 저장하는 배열
            TreeSet<String> testArray = new TreeSet<>();

            for(int i = 0 ; i < n ; i++){ // 입력값을 모두 배열에 저장하는 배열 초기화 for문.

                testArray.add(br.readLine());
//                String [] input = br.readLine().split(" ");
//                int x = Integer.parseInt(input[0]);
//                int y = Integer.parseInt(input[1]);
//
//                xArray[i] = x;
//                yArray[i] = y;

            }



            for(int j = 0 ; j < n-1 ; j ++){ // 배열을 정렬하는 버블 알고리즘.

                for(int k = 0 ; k < n-j-1 ; k++){
                    int xTmp;
                    int yTmp;
                    if(yArray[k] > yArray[k+1]){ // 앞에 수가 뒤에 수보다 크다면 뒤로 보내야하낟.

                        // y좌표 정렬
                        yTmp = yArray[k];
                        yArray[k] = yArray[k+1];
                        yArray[k+1] = yTmp;

                        // x좌표 정렬
                        xTmp = xArray[k];
                        xArray[k] = xArray[k+1];
                        xArray[k+1] = xTmp;
                    }else if(yArray[k] == yArray[k+1] && xArray[k] > xArray[k+1]){ // y좌표의 값이 서로 같다면 x좌표의 값을 기준으로 정렬한다.

                        yTmp = yArray[k];
                        yArray[k] = yArray[k+1];
                        yArray[k+1] = yTmp;

                        xTmp = xArray[k];
                        xArray[k] = xArray[k+1];
                        xArray[k+1] = xTmp;

                    }
                }
            }



            // 결과출력
            String result = "";
            for(int i = 0 ; i < n ; i++){

                result += xArray[i] + " " + yArray[i] + "\n";
            }

            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

class Num11651_2{


    // 실패 : 시간 초과
    // 정렬과 초기화를 동시에 진행?
    
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try {
            int n = Integer.parseInt(br.readLine());

//        int n = sc.nextInt();
            // treeset으로 문자열을 정렬하면서 받기 위해서는 입력된 문자열을 공백 기준으로 나누고 x와 y값을 바꿔줘야한다.

            String result = "";
            for (int i = 0; i < n; i++) {

                String[] input = br.readLine().split(" ");

                String changed = String.format("%s %s", input[1], input[0]);
                treeSet.add(changed);
            }

            Iterator<String> iterator = treeSet.iterator();


            while (iterator.hasNext()) {

                String[] input = iterator.next().split(" ");

                String changed = String.format("%s %s", input[1], input[0]);

                result += changed + "\n";

            }
            bw.write(result);
            bw.flush();

        }
        catch (IOException e){

        }
    }

}
