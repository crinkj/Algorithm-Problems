package programmers;

public class beginning_세균증식 {
    public static void main(String[] args) {
        /**
         * https://school.programmers.co.kr/learn/courses/30/lessons/120910
         * 세균증식
         */
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {
        int result = n;
        for (int i = 0; i < t; i++) {
            System.out.println(result);
            result = result * 2;
        }
        return result;
    }
}
