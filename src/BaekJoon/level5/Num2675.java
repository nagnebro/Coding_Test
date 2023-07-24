package BaekJoon.level5;

import java.util.Scanner;

public class Num2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < count ; i ++){


            String [] line = sc.nextLine().split(" ");
            int first = Integer.parseInt(line[0]);
            String second = line[1];
            String result = "";
            for( int j = 0 ; j < second.length() ; j++){

                for( int k = 0 ; k < first ; k++){

                    result +=  second.charAt(j);

                }

            }
            System.out.println(result);

        }
    }
}
