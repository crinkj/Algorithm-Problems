package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class beginning_로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        return answer;
    }


    public static void main(String[] args){
        System.out.println(solution("dfjardstddetckdaccccdegk",4));
    }
    public static String solution(String cipher, int code) {
        String answer = "";
        char[] arr = cipher.toCharArray();
        for(int i=0;i<arr.length;i++){
            if((i+1) % code == 0){
                answer += arr[i];
            }
        }
        Collections.sort(new ArrayList<String>(), Collections.reverseOrder());
        return answer;
    }
}
