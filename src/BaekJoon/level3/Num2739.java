package BaekJoon.level3;
import java.util.Scanner;

public class Num2739 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());

        for(int i = 1 ; i <= 9 ; i++){

            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
