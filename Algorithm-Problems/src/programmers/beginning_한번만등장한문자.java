package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class beginning_한번만등장한문자 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120896
     */
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                sb.append(c);
            }
        }
        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
