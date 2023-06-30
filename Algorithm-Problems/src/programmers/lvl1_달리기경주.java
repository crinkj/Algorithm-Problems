package programmers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class lvl1_달리기경주 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
     *
     * @문제 달리기 경주
     */
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players,callings)));
    }


    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> called = Arrays.stream(callings).collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        for (int i = 0; i < players.length; i++) {
            String currentPlayer = players[i];
            if (called.containsKey(currentPlayer)) {
                String movedPlayer = answer[i - called.get(currentPlayer)];
                answer[i - called.get(currentPlayer)] = players[i];
                answer[i - called.get(currentPlayer) + 1] = movedPlayer;
            }else{
                answer[i] = currentPlayer;
            }
        }
        return answer;
    }
}
