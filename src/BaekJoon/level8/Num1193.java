package BaekJoon.level8;

import java.util.Scanner;

public class Num1193 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        // 열이 바뀌면 분모가 ㅓ커지고 행이 바뀌면 분자가 커진다.
        // 지그재그의 움직임은 크게 다음과 같이 나뉘어진다.
        // 1. 분자가 일이면 오른쪽이동 분모가 1이면 아래쪽 이동, 이떄 분자의 우선순위가 더 높다 (1/1시작이 오른쪽으로 가서)
        // 2. 분모가 1일때까지 대각선아래로 이동
        // 3. 분자가 1일떄까지 대각선위로 이동.
        // 이떄 이동은 아래로 이동할때는 분자를 1을 더하고 분모를 1을 뺀다
        // 위로 이동할 때는 분모를 1을더하고 분자를 1을 뺀다.
        // 또한 n번째 수를 구하기 위해서는 n번째가 몇번째 줄에 해당하는 지를 알아야하는데
        // 이는 다음과 같다
        // 대각선라인의 분수의 개수는 1줄에 1개씩이다. 즉 1열에 1개, 2열에 2개, 3열3행 따라서 n번쨰 숫자를 구하려면
        // for문을 이용해 합계를 구하다가 n번째 숫자보다 합계가 크다면 그 전의 줄이 구해야할 수가 있는 라인이 된다.
        // 그리고 그 합계를 이용해 몇번째 숫자인지 for문으로 분자 분모를 하나씩 빼거나, 혹은
        // 구해야하는 수와 함ㄱ계를 뺀만큼 분자왑 분모를 뺴주면 구해야하는 x번쨰 수가 나온다.

        // 짝수열일떄는 내려가고 홀수열일떄는 올라간다. 즉 line이 짝수이냐 홀수이냐에 따라서 구해야하는 x번째수가 달라진다.
        int x = sc.nextInt();
        int sum = 0;
        int line = 0;
        int sub = 0;  // x번째수 - sum 을 하면 분자와 분모를 구할 수 있다.
        int boonja = 0;
        int boonmo = 0;


        for(int i = 1; sum < x ; i++){
            sum+= i;
            line = i; // 몇번쨰 라인인이 저장. for문을 나가면 가지고 있어야할 값.
        }
        sum -= line; // for문의 if문을 넣으면 되기는 하지만 굳이 조건을 하나 더 넣기보다는 그냥 for문 바깥에서 예외처리를 한다.
        // 이 줄의 코드는 합계가 이미 해당 줄을 넘었을 것이기 때문에 한번 그 line의 값만큼 빼줘야한다.


        int up_down = line%2==0 ? 1 : 0; // 짝수열이면 내려가고 홀수열이면 올라간ㄷ. 이떄 1이냐 0이냐를 비교해 그에 해당하는 로직을 구현한다.
        // 또한 짝수열이면 분모가 1, 분자가 line일것이고 홀수열이면 분모가 line, 분자가 1일것이다.


        sub = x-sum; // 예를들어 52번째 수를 구하려고한다고 하면 이떄의 sum은  50일 것이다.
        // 그렇다면 sub=2이되고 아래쪽에서 올라가냐 위에서 올라가냐에 따라 sub를 분자와 분모에 각각 빼고 더해주면 된다.
//        System.out.println("sum : " + sum);
//        System.out.println("x : " + x);
//        System.out.println("sub : " + sub);
//        System.out.println("line : " + line );


        if(up_down == 1){
            boonja = sub;
            boonmo = line-sub+1;

        }else if(up_down == 0){
            boonja = line-sub+1;
            boonmo = sub;
        }

        System.out.println(String.format("%d/%d",boonja,boonmo));
//        System.out.println(boonja);
//        System.out.println(boonmo);


    }
}
