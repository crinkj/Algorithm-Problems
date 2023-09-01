package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lvl1_이상한문자만들기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12930https://school.programmers.co.kr/learn/courses/30/lessons/42577
     *
     * @문제 이상한 문자 만들기
     */
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }


    public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ",-1);
        for(int i=0;i<strArr.length;i++){
            char[] charArr = strArr[i].toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(int j=0;j<charArr.length;j++){
                char a;
                if((j+1)%2 == 1){
                    a = Character.toUpperCase(charArr[j]);
                }else{
                    a = Character.toLowerCase(charArr[j]);
                }
                stringBuilder.append(a);
            }
            if(i < strArr.length-1){
                answer += String.valueOf(stringBuilder) + " ";
            }else{
                answer += String.valueOf(stringBuilder);
            }
        }
        return answer;
    }
}
