package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lvl1_추억점수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java
     *
     * @문제 추억점수
     */
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(solution(name, yearning, photo));
        Arrays.stream(solution(name, yearning, photo)).forEach(System.out::println);
    }


    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (scoreMap.get(photo[i][j]) != null) {
                    totalScore += scoreMap.get(photo[i][j]);
                }
            }
            answer.add(totalScore);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
