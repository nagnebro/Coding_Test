package Programmers;

class Lv1_추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // photh 2차원배열을 2중 포문으로 돌린 후에 안쪽포문의 인덱스에 해당하는
        //photo[j]가 name 배열을 다시 for문 돌려서 비교하고 같으면 같은 인덱스 번호의
        // yearning 배열의 인덱스 점수를 더한다.
        int[] answer = new int[photo.length];
        int score = 0;
        for ( int i = 0 ; i<photo.length; i++){
            score = 0;
            for( int j = 0 ; j<photo[i].length; j++){

                for( int k = 0; k<name.length; k++){

                    if(name[k].equals(photo[i][j])){
                        score += yearning[k];
                        break;
                    }
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}