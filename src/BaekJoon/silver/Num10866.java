package BaekJoon.silver;

import java.io.*;
import java.util.LinkedList;

public class Num10866 {

    public static void main(String[] args) {


        // 인데스에 접근하는 명령이 없으니 연결리스트로 구현하는 편이 시간복잡도 측면에서 훨씬 효율적일 듯.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<String> linkedList = new LinkedList<>();
        // 인덱스간 연산이 없기 떄문에 제네릭 타입을 문자열로 해도 관계없을 듯 하다.
        // 문자열을 사용함으로서 메모리를 조금 더 쓰느냐 혹은 정수형으로 파싱하면서 파싱시간이 조금 더
        // 걸리느냐 하는 차이 정도

        try {

            int n = Integer.parseInt(br.readLine());



            for (int i = 0; i < n; i++) {


                boolean check = true;
                String [] input = br.readLine().split(" ");
                String firstInput = input[0];
                String value = "";
                int size = linkedList.size()-1;
                if(input.length == 2){

                    value = input[1];
                }

                switch (firstInput) {
                    case "front":
                        if (linkedList.size() == 0) {
                            bw.write("-1");
                        } else {

                            bw.write(linkedList.get(0));
                        }
                        break;

                    case "back":
                        if (linkedList.size() == 0) {
                            bw.write("-1");
                        } else {
                            bw.write(linkedList.get(size)+"");
                        }
                        break;

                    case "empty":
                        if (linkedList.size() == 0) {
                            bw.write("1");
                        } else {
                            bw.write("0");
                        }
                        break;

                    case "size":
                        bw.write(linkedList.size()+"");
                        break;

                    case "pop_front":
                        if (linkedList.size() == 0) {
                            bw.write("-1");
                        }else{
                            bw.write(linkedList.getFirst());
                            linkedList.removeFirst();
                        }
                        break;
                    case "pop_back":
                        if (linkedList.size() == 0) {
                            bw.write("-1");
                        }else{
                            bw.write(linkedList.getLast());
                            linkedList.removeLast();
                        }
                        break;
                    case "push_front":
                        check = false;
                        linkedList.addFirst(value);
                        break;
                    case "push_back":
                        check = false;
                        linkedList.addLast(value);
                        break;
                }
                if(check){

                bw.write("\n");
                }

            }// for문의 끝.

            bw.flush();
        } catch (IOException e) {
        }
    }
}
