package BaekJoon.silver;

import java.util.Scanner;

public class Num1639 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // 행운의 티켓은 2N자리이다. 이 때 입력값으로 2N, 즉 길이가 짝수로 주어진다는 것은 아니다
        // 주어진 길이가 홀수일떄의 예외처리가 조금 복잡할 수 있겠다.
        // 여기서 함정은 그것이다. 무조건 왼쪽과 오른쪽의 양끝에서부터 비교하는 것이 아니라
        // 문자열의 처음부터 끝까지 비교해야한다는 것이다.
        // 문자열1과 문자열2가 있다고 하자. 이떄 for문이 끝나는 조건이 중요하다.
        // 첫문자열부터 끝문자열까지 반복하되 문자열의 개수가 늘어나든 줄어들든 문자열의 전체길이/2의 길이만큼은 비교를 해야한다
        // 홀수일경우에는 오히려 index범위를 넘어서기 때문이다.
        // 로직은 크게 다음과같이 3가지 단계로 구성된다.

        //1. 문자열의 인덱스를 옮기는 for문(인덱스를 옮기기 위해서 두번쨰문자열의 길이를 이용해 조건식을 설정해야한다.)
        //2. 문자열의 개수를 하나씩 늘리는 for문 -> 문자열의 개수를 한개씩 늘리는데 이떄의 최대 길이는 전체 문자열/2일것이다.
        //3. 구한 문자열의 길이만큼 해당 문자열의 합을 구한다.
        // 1번부터 3번까지 바깥쪽 -> 안쪽 for문이다.

        String str = sc.next();
        int str1_sum = 0;
        int str2_sum = 0;
        String str1 = "";
        String str2 = "";
        int result = 0;

        //
        for(int i = 1 ; i <= str.length()/2; i++){ // 비교되는 문자열1과 문자열2는 전체문자열 길이/2만큼만 늘어날수 있다.

            for(int j = 0 ; str1.length() + str2.length() + j <= str.length(); j++){ // 비교하기 위해 문자열의 자리를 옮기는 것은 2번째 문자열과 1번쨰문자열의
                // 합보다는 작아야한다. indexOutOfRange Exception이 발생하기 떄문이다.


                str1 = str.substring(j,j+i); //
                str2 = str.substring(j+i,j+i+str1.length()); // str1의 길이는 i에 영향을 받으므로 index 범위를 벗어나지는 않는다.

                // 문자열의 합을 구하기 위해서는 그 길이만큼 또 for문을 더해줘야한다

                for(int k = 0; k < str1.length(); k++){
                    str1_sum += str1.charAt(k);
                    str2_sum += str2.charAt(k);
                }
                if(str1_sum == str2_sum){
                    result = str1.length()*2;
                }
                str1_sum = 0;
                str2_sum = 0;
            }
        }
        System.out.println(result);

    }
}
