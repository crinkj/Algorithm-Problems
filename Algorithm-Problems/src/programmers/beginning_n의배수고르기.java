package programmers;

import java.util.ArrayList;

public class beginning_n의배수고르기 {
    public static void main(String[] args){
        System.out.println(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }

    public static ArrayList<Integer> solution(int n, int[] numlist){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int num: numlist){
            if(num % n == 0) answer.add(num);
        }
        return answer;
    }
}
