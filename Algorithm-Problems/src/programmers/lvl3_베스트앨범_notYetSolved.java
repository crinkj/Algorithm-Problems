package programmers;

import java.util.HashMap;
import java.util.Map;

public class lvl3_베스트앨범_notYetSolved {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/42579
     *
     * @문제 베스트 앨범
     */
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution(genres, plays));
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> combinedResult = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            combinedResult.put(genres[i], combinedResult.getOrDefault(genres[i], 0) + plays[i]);
        }

        return answer;
    }
}
