package programmers;

import java.util.Arrays;

public class lvl1_과일장수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/135808
     *
     * @문제 푸드파이터 대회
     */
    public static void main(String[] args) {
        int[] phone_book = {1, 7, 1, 2};

        System.out.println(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }


    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=0;i<score.length;i++){
            int reset = 0;
            int min = 0;
            if(reset == m){

                reset++;
            }
        }
        return answer;
    }
}
