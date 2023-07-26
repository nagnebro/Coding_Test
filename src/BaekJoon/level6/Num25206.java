package BaekJoon.level6;

import java.util.Scanner;

public class Num25206 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double grade_score = 0;
        double sum = 0;
        int subject_count = 0;
        double sum_subject_score = 0; // 학점

        while(sc.hasNext()){
            subject_count++;

            if(subject_count==21){
                break;
            }
            String [] line = sc.nextLine().split(" ");
            if(line[2].equals("A+")){
                grade_score = 4.5;
            }else if(line[2].equals("A0")){
                grade_score = 4.0;
            }else if(line[2].equals("B+")){
                grade_score = 3.5;

            }else if(line[2].equals("B0")){
                grade_score = 3.0;

            }else if(line[2].equals("C+")){
                grade_score = 2.5;

            }else if(line[2].equals("C0")){
                grade_score = 2.0;

            }else if(line[2].equals("D+")){
                grade_score = 1.5;

            }else if(line[2].equals("D0")){
                grade_score = 1.0;

            }else if(line[2].equals("F")){
                grade_score = 0.0;

            }else if(line[2].equals("P")){
                continue;
            }
            sum_subject_score += Double.parseDouble(line[1]);
            sum += grade_score * Double.parseDouble(line[1]);
        }
        System.out.println(sum/sum_subject_score);

    }
}
