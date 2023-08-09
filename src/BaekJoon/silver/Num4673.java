package BaekJoon.silver;

public class Num4673 {

    public static void main(String[] args) {

        // d(n)의 수열은 단지 생성자를 생성하는 원리를 나타내기 위해 보여준 숫자일뿐이다.
        // 1부터 n까지 for문을 돌린다 이때 변수는 i이다.
        // 그리고 이 안에 for문을 한개 더만들고 변수는 j라고 하자
        // 얘는 j < i ㄱ만ㅋ큼 돈다. 더 적은 범위를 돌려도되겠지만 예외상황이 발생할 수 잇으니 돌린다.
        // 그리고 이때 j 의 초기값은 i - 자리수 *10 부터 시작해도된다.
        // 어차피 그 밑에수는 나올 수가 없기 떄문이다.
        // 가령 100이 있을때  80 아래의 숫자 79는 자릿수가 9 9에 79라고 가정을해도 100을 절대 만들 수 없기 때문이다
        // 다만 이러면 1~20정도까지는 예외상황이 발생하게 된다.

        // 그리고 j를 문자열로 더하고
        // j의 값 + j의 charAt+""을 파싱 시킨 합이 i랑 같다면 break, 아니라면 출력한다.

        // 여기서 i는 수를 뜻하고 안쪽의 for문에서 구하는 것은 생성자이다

        for(int i = 1 ; i <=10000 ; i ++ ){
            boolean check = false;
            for(int j = 1 ; j < i ; j++){

                String str = j+"";
                int sum = 0;
                for(int k = 0 ; k < str.length(); k++){ // j를 문자열로 만든것의 자리수의 합을 모두 더한다.
                    sum += Integer.parseInt(str.charAt(k)+"");
                }
                if(j+sum == i){ // 생성자가 한개라도 나가면 더 검사할 필요가없고 for문을 break로 나왔다는 것을 체크값으로 확ㅇ니해준다.
                    check = true;
                    break;

                }

            }
            if(!check){
                System.out.println(i);
            }
        }

    }
}
