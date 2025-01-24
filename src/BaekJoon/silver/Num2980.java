package BaekJoon.silver;

import java.util.Scanner;

public class Num2980 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫 라인은 그냥 읽는다
        String temp = sc.nextLine();
        String[] startValue = temp.split(" ");
        int line = Integer.parseInt(startValue[0]);
        int targetDistance = Integer.parseInt(startValue[1]);

//        2 10
//        3 5 5
//        5 2 2
        int time = 0;
        int currentDistance = 0;
        for(int i = 0 ; i < line ; i++){

            if(currentDistance == targetDistance){

                break;
            }


            String[] value = sc.nextLine().split(" ");;

            int trafficLocation = Integer.parseInt(value[0]);
            int redTime = Integer.parseInt(value[1]);
            int greenTime = Integer.parseInt(value[2]);


            // 현재 위치가 신호등의 위치보다 작으면 신호등 위치만큼 단순하게 distance와 time을 더해준다
            if(currentDistance < trafficLocation ){
                int gap = trafficLocation - currentDistance;
                currentDistance += gap;
                time += gap;

                // 예를들어 빨간불 3초, 초록불 5초라고했을떄
                // 현재 시간이 10초가 흘렀다면 2초가 남을것.
                // 이 2초는 빨간물의 사이클이므로 이 남은 시간을 기점으로 빨간불의 시간인지 파란불의 시간인지 체크한다.
                int remainCycleTime = time % (redTime + greenTime);

                //현재 남은 시간이 빨간불 사이클일 경우 초록불로 바뀌기까지로 건너뛴 다음 전진
                if(remainCycleTime <= redTime){

                    int toChangeGreenLight = redTime - remainCycleTime + 1;
                    time += toChangeGreenLight;
                    currentDistance += 1;
                    continue;
                }

                // 아닌 경우
                currentDistance += 1;
                time += 1;
            }else{
                int remainCycleTime = time % (redTime + greenTime);

                //현재 남은 시간이 빨간불 사이클일 경우 초록불로 바뀌기까지로 건너뛴 다음 전진
                if(remainCycleTime <= redTime){

                    int toChangeGreenLight = redTime - remainCycleTime + 1;
                    time += toChangeGreenLight;
                    currentDistance += 1;
                    continue;
                }

                // 아닌 경우
                currentDistance += 1;
                time += 1;
            }
            // 여기서부터는 현재위치와 신호등 위치가 동일할때 일것이다.

        }
        // for문이 종료되고 나면 신호등이 앞으로 더 없다는 뜻이므로 남은 거리만큼 시간과 거리를 똑같이 더해준다


        int destinationGap = targetDistance - currentDistance;
//        System.out.println("final result, current Distance : " + (currentDistance + destinationGap) + "time : " + (time + destinationGap));
        System.out.println(time + destinationGap);
    }
}
