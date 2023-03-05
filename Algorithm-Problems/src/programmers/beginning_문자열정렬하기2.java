package programmers;

import java.util.Arrays;

public class beginning_문자열정렬하기2 {
    public static void main(String[] args) {
        /**
         * https://school.programmers.co.kr/learn/courses/30/lessons/120911
         * 문자열 정렬하기 2
         */
        String given = "Bcad";
        String result = "";

        char[] charArr = given.toLowerCase().toCharArray();
        Arrays.sort(charArr);

        result = new String(charArr);
        System.out.println(result);

    }
}
