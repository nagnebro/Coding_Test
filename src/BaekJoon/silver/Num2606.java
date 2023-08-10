package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Num2606 {

    public static void main(String[] args) {

        // 오답. 30퍼 대에서 틀림.
        // 예외상황을 찾아보자.

        // 문제의 예외 상황   // 1번컴퓨터는 바이러스에 감염되는 컴퓨터의 대수에서 제외한다.
        // 1 2번이 첫번째 쌍으로 주어지고 마지막 쌍이 1번 혹은 2번과 관련된 숫자가 나오게 된다면 ..
        // 그때부터 연쇄적으로 검사할 수 있게 되는 것이다.
        // 상식적으로 같은 컴퓨터번호끼리 중복된 쌍이 제공되지는 않는다고 가정한다.
        // 이 떄 1번 컴퓨터와 어떤 컴퓨터와 연결돼있는지 가장 먼저 찾아본다.
        // 이떄 빈배열에 숫자 1만 넣는다.
        // 이떄 ArrayList를 이용해 길이가 고정적이지 않고 ㅏ가변적인 배열을 사용해
        // 그떄그떄 바이러스에 검사된 컴퓨터를 검사해야하므로 길이는 짧으면 짧을수록 좋다.
        // 그리고 그렇게 찾은 컴퓨터의 번호를 배열에 넣는다.
        // 이떄 검사를 끝내는 조건을 무엇으로 할 것인지가 중요하다
        //
        // 처음 한번은 처음부터 끝가지 1번을 통해 바이러스에 걸린 컴퓨터가 몇번몇번인지 스캔해야한다
        // 이후에는 조건이 성립하면 continue식으로 반복하다가 만족하지 못할시 반복문을 종료한다.
        // 쌍으로 주어지는 컴퓨터를 c1 c2라고 했을 떄
        // c1이 배열에있는데 c2가없으면 저장한다
        // 이 떄 continue시키고 이 조건이 성립하지 않는다는 것은 더이상 바이러스걸린 컴퓨터 배열과 연결된
        // 컴퓨터가 없다는 뜻이된다.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> list = new ArrayList<>();
        list.add("1");

        try {
            int n = Integer.parseInt(br.readLine()); // 컴퓨터의 대수
            int m = Integer.parseInt(br.readLine()); // 쌍의 개수
            String[] comList = new String[m * 2];

            for (int i = 0; i < m; i++) {
                String[] input = br.readLine().split(" ");
                String com1 = input[0];
                String com2 = input[1];
                comList[i * 2] = com1;
                comList[i * 2 + 1] = com2;
            }

            while (true) {

                int count = 0;

                for (int i = 0; i < comList.length ; i++) { // 전체 입력된 쌍을 배열로 저장하고있다.



                    for (int j = 0; j < list.size(); j++) {// 바이러스 컴퓨터가 저장된 배열이다.

                        if (comList[i].equals(list.get(j))) {// 현재 돌고있는 쌍에 해당하는 컴퓨터가 바이러스배열에 저장된 컴퓨터 번호일때 인덱스가 홀수이면 -1 인덱스를 바이러스 배열에 집어넣고
                            // 인덱스가 짝수이면 +1 인덱스를 바이러스 배열에 집어넣는다.
                            int idx = 0;
                            int result = -1;
                            if (i % 2 != 0) { // 홀수일떄
                                idx = i - 1;
                                result = checkVirus(list, comList[i-1]);


                            } else if (i % 2 == 0) {
                                idx = i + 1;
                                result = checkVirus(list, comList[i+1]);

                            }

                            if (result == 1) {
                                list.add(comList[idx]);

                                count++;

                            }


                        }

                    }
                }
                if(count == 0){
                    System.out.println(list.size()-1);
                    return;
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static int checkVirus(ArrayList<String> list, String idx) { // 검사하고 있는 comList[i]가 바이러스 배열에 있으면 추가하면 안되고
        // 없으면 추가한다.

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(idx)) {
                return 0;
            }
        }
        return 1;


    }
}
