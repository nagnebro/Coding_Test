package BaekJoon.level13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Num10989 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];
            // ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < n; i++) { // 배열초기화.
                int number = Integer.parseInt(br.readLine());
                // array.add(number);
                array[i] = number;
            }

            // Collections.sort(array, new NumberComparator());
            // 배열을 이용해 직접 알고리즘 구현 O(n log n)
            //

            for (int i = 0; i < n; i++) {
                // bw.write(array.get(i) + "\n");
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {

        }
    }
}

class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 > o2) {
            return 1;
        } else if (o1 < o2) {
            return -1;
        }
        return 0;
    }

}