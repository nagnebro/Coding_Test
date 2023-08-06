package BaekJoon.silver;

import java.util.HashSet;
import java.util.Scanner;

public class Num1235 {

    public static void main(String[] args) {


        // 학생들의 번호를 구별할 수 있는 최소자리수 k를 구하여라.
        // k는 즉 문자열을 뒤에서부터 잘라서 비교했을 떄 같은 값이 아닐경우의 문자열의 길이를 뜻한다.

        //알고리즘으로 구현하려면 for문을 좀 써여할거 같고
        // 자료구조를 이용하면 hashset이런걸 이용하면 되지 않을까
        // 즉 중복을 허용하지않고 저장하는 자료구조를 선택하고
        // 그 자료구조에 처음부터 substring한 문자열을 자료구조에 집어넣는다
        // 이때 그 자료ㅕ구조의 길이가 입력받은 n보다 작다면 중복이 있다는 소리이므로
        // 다시 길이를 늘려 자료구조를 초기화하고 새로 저장한다
        // 이런식으로 반복하다가 입력받은 길이와 자료구조의 길이가 같은 순간이
        // k가 되는 것이다.

        // 여기서 중요한 것은 hashset을 써서 풀어도 되지만
        // hashset을 써서 풀지 않을거라면 결국에는 알고리즘 구현을 배열로 hashset을 구현하는 편이 더 효율적이었을 것이다.
        // 즉 배열에 substring한 문자열을 다 집어넣는데 그떄의 배열의 길이를 구하는 것이다.
        // 단 배열은 알다시피 초기화 및 추가 메서드가 없으므로 직접 초기화시켜주고.. 해야하는 부분이 번거롭다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        HashSet hashSet = new HashSet();
        int k = 0 ;
        for (int i = 0; i < n; i++) { // hash set초기화. 처음에 입력으로 들어오는 모든 학생들의 번호는 다르므로 hashset으로 받아도된다.

            String str = sc.next();
            array[i] = str;
        }

        for (int i = array[0].length()-1; i >= 0; i--) { // 학생들의 번호를 1의자리 수부터 비교하기 위한 for문 .
            // 초기값과 증감식을 이렇게 설정하면 끝에자리수부터 앞의자리수로 문자열을 자르게 된다.

            for (int j = 0; j < array.length; j++) { // j는 문자열의 인덱스, i는 문자열 자리수의 인덱스이다.

                hashSet.add(array[j].substring(i));
            }

            if(hashSet.size() != n){
                hashSet.clear(); //초기화하고 다시 for문을 돌아야한다.

            }else{ // 길이가 같다는 건 중복되는 문자열이 ㅇ럾다는 것.

                k = array[0].length() - i; // 자리수를 세기 위해서는 전체 문자열의 길이에 i를 뺴야허ㅏㄴ다.
                break;
            }
        }
        System.out.println(k);


    }
}

class Test {

    public static void main(String[] args) {


        HashSet hashSet = new HashSet();
        hashSet.add("anbc");
        hashSet.add("def");
        hashSet.add("def2");
        boolean result1= hashSet.add("def3");
        boolean result2= hashSet.add("def3");
        boolean result3= hashSet.add("def3");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(hashSet);
        String abc = "abcdef";
        System.out.println(abc.substring(5));
    }
}
