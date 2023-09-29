package BaekJoon.silver;

import java.io.*;
import java.lang.reflect.Member;
import java.util.ArrayList;

public class Num10814 {

    public static void main(String[] args) {


        // 오답 시간초과. 자료형 선택에 문제가 있는지. 로직은 확실히 별로긴하다.

        // 나이순으로 정렬하는 것은 어렵지 않으나 그렇게 정렬을 하고 난 후에도 나이가 같을 경우에는 가입순, 즉 입력이 들어온 순서대로 다시
        // 정렬을해야한다는 것이다.
        // 문자열은 arrayList에 저장한다. 그러면 contains 메서드를 이용해서 해당 문자열의 인덱스를 얻어올 수 있고
        // 나이순이 같을때는 해당 인덱스로 비교한다. 단 이때 같은 이름을 가진 사람이 입력으로 들어온다고 가정하면
        // contains는 아마도 제일 먼저 찾는 문자열의 idx를 반환할 것이다.
        // 따ㅏㄹ서 찾았을때는 해당 문자열을 입력으로 주어질 수 없는 특수문자로 바꿔주던가 한다. 그럼 자연스레 같은 이름이
        // 있더라도 인덱스는 해당 문자열의 인덱스를 반환할 것이다.


//23 Sooyoung
//21 Junkyu
//21 Dohyun
//20 Sunyoung
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        try{
            ArrayList<Integer> ageList = new ArrayList<>();
            ArrayList<String> nameList = new ArrayList<>();
            ArrayList<String> orderList = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            for(int i = 0 ; i < n ; i++){ //배열 초기화

                String [] input = br.readLine().split(" ");
                ageList.add(Integer.parseInt(input[0]));
                nameList.add(input[1]);
                orderList.add(input[1]);
            }

            for(int i = 0 ; i < n-1 ; i++){ // 버블정렬 실시 (나이순 정렬)

                 for(int j = 0 ; j < n-1-i ; j++){

                     int tmp = 0;
                     String tmpStr = "";
                     if(ageList.get(j) > ageList.get(j+1)){

                         tmp = ageList.get(j);
                         ageList.set(j,ageList.get(j+1));
                         ageList.set(j+1,tmp); // 숫자 배열 정렬

                         tmpStr = nameList.get(j);
                         nameList.set(j,nameList.get(j+1));
                         nameList.set(j+1,tmpStr); // 문자열 배열 정렬
                         //이떄 orederList는 입력이 들어온 순서대로 이름을 저장하고 있다.
                     }
                 }
            }

            for(int i = 0 ; i < n-1 ; i++) { // 버블 정렬 실시 (나이가 같을떄 입력순으로 정렬.

                for (int j = 0; j < n - 1 - i; j++) {

                    int tmp = 0;
                    String tmpStr = "";

                    if (ageList.get(j) == ageList.get(j + 1) && orderList.indexOf(nameList.get(j))>orderList.indexOf(nameList.get(j+1))) { // 나이가 같으면서 들어온 순서가 앞에 사람이 뒤질떄

                        tmp = ageList.get(j);
                        ageList.set(j,ageList.get(j+1));
                        ageList.set(j+1,tmp); // 숫자 배열 정렬

                        tmpStr = nameList.get(j);
                        nameList.set(j,nameList.get(j+1));
                        nameList.set(j+1,tmpStr); // 문자열 배열 정렬

                    }
                }
            }


            String result = "";
            for(int i = 0 ; i < n ; i++){

                result += String.format("%d %s\n",ageList.get(i),nameList.get(i));

            }
            System.out.println(result);

        }catch (IOException e){

        }




    }
}


