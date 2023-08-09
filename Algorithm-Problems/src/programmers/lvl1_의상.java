package programmers;

import java.util.HashMap;
import java.util.Map;

public class lvl1_의상 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/42578
     *
     * @문제 의상
     */
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            map.put(category, map.getOrDefault(category, 1) + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key);
        }
        return answer-1;
    }
}
