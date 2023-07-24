package BaekJoon.level4;

import java.util.Scanner;

public class Num10811 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] first_line = sc.nextLine().split(" ");
        int basket_size = Integer.parseInt(first_line[0]);
        int line_size=  Integer.parseInt(first_line[1]);
        int [] num_list = new int[basket_size];
        for(int h = 0; h < num_list.length ; h ++){

            num_list[h] = h+1; // 숫자는 1부터 초기화시킨다.

        }


        for(int i = 0 ; i < line_size ; i++){

            String [] second_line = sc.nextLine().split(" ");
            int start_num = Integer.parseInt(second_line[0]);
            int end_num = Integer.parseInt(second_line[1]);

            for(int j = 0 ; j < (end_num-start_num+1)/2  ; j++){

                int tmp = num_list[start_num-1+j];
                num_list[start_num-1+j] = num_list[end_num-1-j];
                num_list[end_num-1-j] = tmp;


            }

        }

        String result = "";
        for(int k = 0; k < num_list.length ; k++){

            result += num_list[k] + " ";
        }

        System.out.println(result);
    }
}
