package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class lvl1_전화번호목록 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/42577
     *
     * @문제 전화번호 목록
     */
    public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};

        System.out.println(solution(phone_book));
    }


    public static Boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> phone = new HashSet<>();
        phone.addAll(Arrays.asList(phone_book));
        for(String p: phone){
            for(int i=0;i<phone_book.length;i++){
                if(phone.contains(p.substring(0,i))){
                    return false;
                }
            }
        }
        return answer;
    }
}
