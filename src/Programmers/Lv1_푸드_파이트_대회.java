package Programmers;

public class Lv1_푸드_파이트_대회 {

    public String solution(int[] food) {
        String answer = "";
        // 1번쨰요소는 무조건 물이라서 1이고 두번쨰요소부터 1번째음식(즉 인덱스번호)이ㅣ고 개수이기도 하다 이때
        // food[i]/2 ,그러니까 몫이 곧 배치될 수 있는 음식의 횟수이다 따라서
        // 3이 올시 1개는 남으므로
        // for문으로 food의 마지막 요소까지 반복하며 food[i]/2 한 값을 char배열에 저장.
        // 마지막 요소는 물을 뜻하는 0이 들어오고 그 뒤로는 char배열을 거꾸로 돌려서 더해주면된다.
        String str = "";
        for (int i = 1; i < food.length; i++) {
            int tmp = food[i] / 2;
            while (tmp-- != 0) {
                str += i;

            }
        }
        answer += str + "0";
        for (int j = 1; j <= str.length(); j++) {
            answer += str.charAt(str.length() - j);
        }
        return answer;
    }
}

class Student{
    String name ;
}
class StudentTest{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "김영찬";
        Student s2 = new Student();
        s2.name = "김영찬2";
        System.out.println(s1.name +"  /  "+ s2.name);
        s1= s2;

        System.out.println(s1.name +"  /  "+ s2.name);


    }
}