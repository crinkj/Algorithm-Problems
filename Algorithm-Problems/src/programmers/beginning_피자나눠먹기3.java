package programmers;

public class beginning_피자나눠먹기3 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120816
     *
     * @param args 피자 나눠먹기 3
     * @return
     */
    public static void main(String[] args) {


    }
    public static int solution(int slice, int n ){
        int answer = 0;
        while(n > 0){
            n = n- slice;
            answer++;
        }
        return answer;
    }


}
