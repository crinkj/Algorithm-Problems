package programmers;

public class beginning_피자나눠먹기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120923
     *
     * @param args 피자 나눠먹기
     * @return
     */
    public static void main(String[] args) {

        int n = 1;
        int result = 0;

        while(0 < n){
            n = n - 7;
            result++;
        }
        System.out.println(result);
    }


}
