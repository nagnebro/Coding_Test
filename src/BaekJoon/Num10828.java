package BaekJoon;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Num10828 {


    public static void main(String[] args) {
        // System.in 은 InputStream클래스 탕비으로 InputStream in = System.ㅑㅜ으로 저장이 가능하다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력값은 이렇게 주어질 것.

        try {


            int num = Integer.parseInt(br.readLine());

            ArrayList<Integer> stack_list = new ArrayList<>();
            String order = "";


            for (int i = 0; i < num; i++) {
                
                int size = stack_list.size();
                String next = i==stack_list.size()-1? "" : "\n" ; // 마지막 개행을 없애기 위한 가라방식.
                 order = br.readLine();  //실제 제출해야하는 코드


                String[] order_list = order.split(" "); //이 문자열 배열도 굳이 push 이외에는 사용되지 않기 때문에
                // 공백있는지 검사하고 없으면 그냥 문자열로 받고 공백있으면 배열로 받던지 해도 괜찮을 듯.
                int tmp = 0; // pop이나 top의 값을 저장할 임시변수.
                if (order_list[0].equals("push")) {
                    int value = Integer.parseInt(order_list[1]);
                    // 명령어가 push일떄는 index가 같이 주어지기 때문에 위에서 배열로 명령어를 받았을때 index1에는 명령어로 주어진 숫자가 있을 것이다.
                    // 이를 idx변수에 집어넣는다.
                    stack_list.add(value);



                } else if (order_list[0].equals("pop")) {
                    if (size != 0){

                        tmp = stack_list.get(size-1);
                        stack_list.remove(size-1);
                        bw.write(tmp + next);

                    }else{
                        bw.write("-1"+ next);
                    }

                } else if (order_list[0].equals("size")) {
                    bw.write(""+size+next);
                } else if (order_list[0].equals("empty")) {
                    if (size == 0) {
                        bw.write("1"+next);
                    }else{
                        bw.write("0"+next);

                    }
                } else if (order_list[0].equals("top")) {
                    if (size == 0){
                        bw.write("-1"+next);
                        continue;
                    } // write할떄 정수형으로 써도 어쨌든 문자열로 저장되기 떄문에 이렇게 문자열 형태로 숫자 적어도 상관없지않나?
                    bw.write(stack_list.get(size - 1) + next);

                }

            }



            bw.flush();
            bw.close();
            br.close();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
