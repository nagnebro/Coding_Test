package BaekJoon.silver;

import java.util.Scanner;

public class Num2178 {

    public static void main(String[] args) {

        // 미제출 보류. 생각으론 돼도 코드로 짜지를 못하겠다.
        // n은 행의 개수이고 m은 열의 개수이다.
        // 즉 n개의 줄만큼 입력이 들어오고
        // m은 그 줄의 길이를 뜻한다.
        // 미로를찾는 것은 기본적으로 현재의 위치와 n과 m의 값에 비교에 의해 결정된다.
        // 시작위치는 1,1이고 n,m이 5,5라면 무조건 오른쪽 아래로 가야한다.
        // 이 식은 n-현재행의위치, m-현재열의위치로 이루어지며
        // 이 값에 따라 미로를 이동해야 하는 방향을 결정해야한다. 당연하게도 방향은
        // n이 현재위치보다 크다면 현재위치에서 1을 더해주고 작다면 빼면서 이동해야하지만
        // 이떄 이동하려는 방향에 길이 없다면 다른 방향으로 가야하며 이또한 맞는 방향인지 아닌지는 모른다.
        // 가령 가야하는 방향에는 길이없고 왔던 길과 남은 길 2개, 총 3개의 선택지가 있으나 왔던길을 돌아가는 것은 좋지 않다.
        // 그냥 차라리 갈림길이 나왔을 때 경우의 수를 생각해 여러번 계산하는 것을 택해야지 다시 돌아가는 것은 이미 정답에서 멀어지는 길이다.
        // 우선순위를 정해야한다.
        // 컴퓨터는 바보기 때문에 결국 모든 경우의수를 다 구해야한다. 위에서 돌아가는 방법은 얘기하지 않아지만 결국 돌아가야한다.
        // 그래서 그 count가 크게나오든 어떻든 결국에 최소값만 구하면 되기 땨문.
        // 막혀있는 미로의 위치를 기억해야한다. 즉 갈림길에 섰을 때마다 해당 좌표를 기억하는 배열을 만든다.
        // 그렇지 않고서야 모든 경우의수를 구할 수 없다. 프로그램 돌릴때마다 계속 같은 길로만 갈 것이다.
        // 따라서 갈림길에 갈림길에 갈림길이 나올 수 있다. 이떄 마지막 갈림길에서 막다른 길(온방향 말고 나머지 방향이 모두0이다)일떄
        // 마지막 갈림길로 이동한다. 이떄 이동한 횟수도 똑같이 빼준다.
        // 막다른 길이 나올떄마다 그 수를 뺀만큼 돌아간다고 생각하면 된다. 일종의 체크포인트 개념이다.
        // 그리고 그 갈림길로 이동했을 때 갈수 있는 다른 방향이 있다면 또 그방향으로 가봐야한다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


    }
}
