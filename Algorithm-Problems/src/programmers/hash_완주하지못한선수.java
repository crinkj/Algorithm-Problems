package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hash_완주하지못한선수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/43163
     *
     * @문제 완주하지 못한 선수
     */
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }


    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            if (participantMap.get(c) > 1) {
                participantMap.put(c, participantMap.get(c) - 1);
            } else if (participantMap.get(c) == 1) {
                participantMap.remove(c);
            }
        }
        Set<String> result = participantMap.keySet();
        for (String r : result) {
            answer = r;
        }
        return answer;
    }
}
