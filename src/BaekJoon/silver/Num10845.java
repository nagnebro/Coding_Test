package BaekJoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Num10845 {

//    정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//    명령은 총 여섯 가지이다.
//
//    push X: 정수 X를 큐에 넣는 연산이다.
//    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    size: 큐에 들어있는 정수의 개수를 출력한다.
//    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//    front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    입력
//    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
//    주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

    public static void main(String[] args) {


        // 입력이 계속 들어오니 버퍼로 받자
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        String result = "";

        // 아래와 같이 작성하면 시간초과발생.
        try {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String str = br.readLine();

                // 이렇게 작성시 시간초과.
            if(str.contains("push")){
                int num = Integer.parseInt(str.split(" ")[1]);
                arrayList.add(num);
                continue; // 개행문자를 붙이지 않기 위함.
            }else if(str.equals("pop")){
                if(arrayList.size() == 0){
                    result += "-1";
                }else{
                    result+= arrayList.get(0);
                    arrayList.remove(0);
                }
            }else if(str.equals("size")){

                result += arrayList.size();
            }else if(str.equals("empty")){

                if(arrayList.size() == 0){ // 큐가 비어있으면
                    result += "1";
                }else{
                    result += "0";
                }
            }else if(str.equals("front")){
                if(arrayList.size() == 0){
                    result += "-1";
                }else{
                    result+= arrayList.get(0);
                }
            }else if(str.equals("back")){

                if(arrayList.size() == 0){
                    result += "-1";
                }else{
                    result+= arrayList.get(arrayList.size()-1);
                }
            }
                result += "\n";


            }
            bw.write(result);
            bw.flush();

        }catch(IOException e){

        }




    }
}


class Num10845_1 {

//    정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//    명령은 총 여섯 가지이다.
//
//    push X: 정수 X를 큐에 넣는 연산이다.
//    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    size: 큐에 들어있는 정수의 개수를 출력한다.
//    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//    front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    입력
//    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
//    주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

    public static void main(String[] args) {


        // 입력이 계속 들어오니 버퍼로 받자
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        String result = "";

        // 아래와 같이 작성하면 시간초과발생.
        try {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String str = br.readLine();


                switch (str) {

                    case "pop":
                        if (arrayList.size() == 0) {
                            result += "-1";
                        } else {
                            result += arrayList.get(0);
                            arrayList.remove(0);
                        }
                        break;
                    case "size":
                        result += arrayList.size();

                        break;
                    case "empty":
                        if (arrayList.size() == 0) { // 큐가 비어있으면
                            result += "1";
                        } else {
                            result += "0";
                        }
                        break;
                    case "front":
                        if (arrayList.size() == 0) {
                            result += "-1";
                        } else {
                            result += arrayList.get(0);
                        }
                        break;
                    case "back":

                        if (arrayList.size() == 0) {
                            result += "-1";
                        } else {
                            result += arrayList.get(arrayList.size() - 1);
                        }
                        break;

                    default: // 입력이 다른게 들어오지 않는다는 가정이기 떄문에 이렇게 작성가능. 이부분에는 push x 로 입력된 문자열이 들어올것.
                        int num = Integer.parseInt(str.split(" ")[1]);
                        arrayList.add(num);
                        continue; // 개행문자를 붙이지 않기 위함.

                }


                result += "\n";


            }
            bw.write(result);
            bw.flush();

        }catch(IOException e){

        }




    }
}







class Test3{

    public static void main(String[] args) {

        Scanner sc = new Scanner("abcd");
        switch (sc.next()){

            case "abc":
                System.out.println("abc입니다");
                break;
            case "bde":
                System.out.println();
        }
    }
}

// 이렇게 작성시 시간초과.
//            if(str.equals("push")){
//                int num = sc.nextInt();
//                arrayList.add(num);
//                continue; // 개행문자를 붙이지 않기 위함.
//            }else if(str.equals("pop")){
//                if(arrayList.size() == 0){
//                    result += "-1";
//                }else{
//                    result+= arrayList.get(0);
//                    arrayList.remove(0);
//                }
//            }else if(str.equals("size")){
//
//                result += arrayList.size();
//            }else if(str.equals("empty")){
//
//                if(arrayList.size() == 0){ // 큐가 비어있으면
//                    result += "1";
//                }else{
//                    result += "0";
//                }
//            }else if(str.equals("front")){
//                if(arrayList.size() == 0){
//                    result += "-1";
//                }else{
//                    result+= arrayList.get(0);
//                }
//            }else if(str.equals("back")){
//
//                if(arrayList.size() == 0){
//                    result += "-1";
//                }else{
//                    result+= arrayList.get(arrayList.size()-1);
//                }
//            }