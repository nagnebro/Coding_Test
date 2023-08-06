package BaekJoon.silver;

import java.util.*;

public class Num1302 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap hashMap = new HashMap();
        int max = 0;
        String result = "";

        // 입력이 1이나 2일경우에 예외가발생한다.
        // 또한 입력이 모두 다른 경우에도 예외가 발생한다. count가 모두 1인경우.

        for(int i = 0 ; i < n ; i ++){
            String book = sc.next();
             // 중복된 값이 있으면 false가 나올것. 중복된값이 없으면 true를 반환.
            if(hashMap.get(book) == null){ // 처음들어오는 경우.

                max = max == 0 ? 1 : max; //
                hashMap.put(book,1);
                if(max == 1 && result.equals("")){ // 최대값이 1이면서 result가 비어있는 경우는 곧 한개의 문자열만 입력으로 들어왔을 경우이다.
                    result = book;
                }else if( max== 1 && !result.equals("")){ // 최대값이 1인데도 불구하고result가 있다면 새로 들어온 입력값으로 현재
                    // hashmap내부의 최대 count가 1이라는 뜻. 이 중에서 알파벳 순서가 가장 앞서는 문자열로 설정해야한다.

                    result = result.compareTo(book) < 0 ? result : book;
                }

            }else{ // book의 이름을 가진 요소가 이미 haspMap에 존재할떄.
                int count = (Integer)hashMap.get(book);
                hashMap.put(book,count+1);
                if(max < count+1){ // max보다 큰 경우에는 무조건 book값이 result가되고 아래의 경우에는
                    // 기존의 max값을 이번에 책을 넣으며 count가 같아지는 경우에는 알파벳순으로 비교해야한다.
                    max = count+1;
                    result = book;
                     // 그때그떄 최대값을 바로 저장한다. hashMap특성상 key값을 알아야 요소를 불러올 수 있는데
                    // 그럴려면 입력으로 들어오는 값을 배열로 담아야하고 같은 값을 가진 문자열이라도 다 저장해야하기 때문.
                    // hashwset역시 인덱스가 없어서 문자열로 찾아야하기 때문에 사용할 수 없다.
                }else if(max == count+1){ // 기존에 저장된 책이 있다면 여기서 사전순으로 앞서는 단어를 선택해야하기 떄문에 비교해줘야한다.

                    // 이 떄여기에 result에는 count가 가장큰 책 이름이 담겨 있을 것이고 내가 받은 입력은 book이다.
                    // result와 book을 compareTo로 비교한다.
                    result = result.compareTo(book) < 0 ? result : book;
                }
            }

            // compareTo메서드는 왼쪽의 메서드 실행 문자열이 매개변수 문자열보다 사전순으로 뒤진다면 양수값이 나오고 앞선다면 음수가 나온다.
            // 앞에서부터 charAt으로 비교하는 ㄱ것 같고 같으면 뒷자리로 계속 이동하는 식으로 charAt의 차이를 결과값으로 반환한다.


        }
        // 입력이 1개나 2개의 예외일 경우는 여기서 처리한다.

        System.out.println(result);



    }
}

class Test2{

    public static void main(String[] args) {



        HashMap hashMap = new HashMap();
        if(hashMap.get("abc")==null){
            System.out.println("null입니다");
        }
        hashMap.put("abc",3);
        hashMap.put("abcd",3);
        hashMap.put("abce",3);
        hashMap.put("dbce",3);
        hashMap.put("cbce",3);
        System.out.println(hashMap);
        System.out.println(hashMap.get("abc"));

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("abce",3);
        treeMap.put("dbce",3);
        treeMap.put("cbce",3);
        treeMap.put("abc",3);
        treeMap.put("abcd",3);

        System.out.println("abc".hashCode());
        System.out.println("z".hashCode());
        System.out.println("abd".compareTo("abc"));


        System.out.println(treeMap);


    }
}