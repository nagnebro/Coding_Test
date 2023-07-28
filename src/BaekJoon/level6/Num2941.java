package BaekJoon.level6;

import java.util.Scanner;

public class Num2941 {

    public static void main(String[] args) {


        //c와 d와 과 j와 z와 n과 s뒤에 각각 어떤 문자열 혹은 알파벳이 오는지 검사해야한다.
        // 만약 크로아티아 알파벳을 나타내는 알파벳, 혹은 특수기호가 아닐경우에는 그냥 알파벳으로 개수를 세야한다.
        // 뒤의 문자열을 검사하기 때무넹 indexOutOfRange 에외가 발생할 수 있다.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 0;

        // 크로아티아 문자에서 중복 처리 될 수 있는 문자는 dz=이므로 제일먼저 검사하도록 한다.  예를들어
        // ad 와  dc 라는 문자가 각각 크로아티아 알파벳을 뜻한다면 앞뒤가 서로 같기 때문에 순서에 따라 결과값이 달라질 수 잇다.
        // 그러나 현재 문제에서는 dz=과 z=을 제외하고는(심지어 이것도 포함관계이다) 크로아티아 알파벳이 겹치는 것이 없다.
        // 따라서 발견하는 족족 없애버리고 count를 센 후 나머지 문자는 모두 크로아티아 알파벳을 나타내는 문자가 아닌 일반 알파벳일 것이므로
        // 그 문자의 길이와 아까 구한 count를 더하면 된다.

        while(true){

            String rm_str = ""; // 조건식에 따라 제거해야할 문자를 저장한다.


            if(str.contains("dz=")){// contains메서드와 indexof메서드가 문자열의 처음부터 찾아서 구한다는 가정하에 작성한 코드이다.
                // 아마 실제로 동작도 그럴것이다.

                rm_str = "dz=";
            }else if(str.contains("z=")){
                rm_str = "z=";

            }else if(str.contains("c=")){
                rm_str = "c=";

            }else if(str.contains("c-")){
                rm_str = "c-";

            }else if(str.contains("d-")){
                rm_str = "d-";

            }else if(str.contains("lj")){
                rm_str = "lj";

            }else if(str.contains("nj")){
                rm_str = "nj";

            }else if(str.contains("s=")){
                rm_str = "s=";

            }

            if(rm_str.equals("")){break;} // 이렇게 작성하면 조건식이 하나 생기게 되고
            // 이렇게 작성안하고 매조건식마다 아래의 처리식을 작성하고 continue를 작성하면 코드의 중복은 심하지만 조건 하나는 뺄 수 있다.
            //  else if문 제일 아래에 break문을 달면 되기 때문이다.
            // 이때 replace는 모든 문자열을 치환해버리기 때문에.
            count++;


            // 그냥 제거하면 앞뒤로 합쳐진 문자열이 또다른 크로아티아 알파벳을 만들 수 있기 때문에
            // 크로아티아 알파벳으로 인식할 수 없는 문자로 치환한다.
            str = str.replaceFirst(rm_str,"-"); // 얘 역시 contains처럼 처음 발견되는 문자열만 치환해주는 메서드이다.

        }
        str = str.replace("-","");
        System.out.println(count+str.length());


    }
}
