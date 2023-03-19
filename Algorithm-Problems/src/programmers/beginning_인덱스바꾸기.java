package programmers;

import java.util.Arrays;

public class beginning_인덱스바꾸기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120895
     */
    public static void main(String[] args) {
        System.out.println(solution("I love you",3,6));
    }

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strings = my_string.split("",-1);
        String first = strings[num1];
        strings[num1] = strings[num2];
        strings[num2] = first;
        for(String s: strings){
            answer += s;
        }
        return answer;
    }
}
