package BaekJoon.level2;

import java.util.Scanner;
public class Num9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = Integer.parseInt(sc.next());

        String grade = score >= 90 ? "A" : score>=80 ? "B" : score>=70 ? "C" : score>=60 ? "D" : "F";

        System.out.println(grade);
    }
}
