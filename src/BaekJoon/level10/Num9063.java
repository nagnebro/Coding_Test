package BaekJoon.level10;

import java.util.Scanner;

public class Num9063 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // x의최소값과 최대값, y의 최소값과 최대값을 구한뒤 각 x, y의 최대값 - 최소값은 변의 길이가 되고 이것을 곱한 값은
        // 넓이가 될 것이다.
        int n = sc.nextInt();
        int min_x = sc.nextInt();
        int min_y = sc.nextInt(); // n은 1과 같거나 크기떄문에
        int max_x = min_x;
        int max_y = min_y;
        // 처음에 최소값은 여기 담아둔다.

        if(n==1){ // 옥구슬이 1개인경우에는 가로 세로를 구할 수 없다. 그러나 아래의 로직에 의해서는 예외처리가 되지 않으므로
            // 여기서 예외처리를 한다.
            System.out.println(0);
            return;
        }


        for(int i = 0 ; i < n-1 ; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if( min_x > x){
                min_x = x;
            }
            if( min_y > y){
                min_y = y;
            }
            if( max_x <x){
                max_x = x;
            }
            if( max_y < y){
                max_y = y;
            }
        }
        int width = max_x - min_x;
        int height = max_y - min_y;
        System.out.println(width * height);

    }
}
