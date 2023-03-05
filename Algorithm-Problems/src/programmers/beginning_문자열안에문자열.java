package programmers;

public class beginning_문자열안에문자열 {

    public static void main(String[] args) {
        /**
         * https://school.programmers.co.kr/learn/courses/30/lessons/120908
         * 문자열안에 문자열
         */

        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        System.out.println(solution(str1,str2));
    }

    public static int solution(String str1, String str2) {
        int result = 0;

        if (str1.contains(str2)) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}
