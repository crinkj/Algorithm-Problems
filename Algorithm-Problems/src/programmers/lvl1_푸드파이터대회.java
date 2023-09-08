package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lvl1_푸드파이터대회 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/134240
     *
     * @문제 푸드파이터 대회
     */
    public static void main(String[] args) {
        int[] phone_book = {1, 7, 1, 2};

        System.out.println(solution(phone_book));
    }


    public static String solution(int[] food) {
        String answer = "";
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1) {
                for (int j = 0; j < food[i] / 2; j++) {
                    left.append(i);
                    right.insert(0, i);
                }
            }
        }
        answer += left + "0" + right;
        return answer;
    }
}
