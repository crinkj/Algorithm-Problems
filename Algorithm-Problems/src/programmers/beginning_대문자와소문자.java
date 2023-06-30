package programmers;

import java.util.ArrayList;

public class beginning_대문자와소문자 {
    public static void main(String[] args) {
        System.out.println(solution("ccccCCCC"));
    }

    public static String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(char c: arr){
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }else{
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }
}
