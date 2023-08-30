package programmers;

import java.util.HashSet;
import java.util.Set;

public class lvl2_영어끝말잇기 {
    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int num = 3;
        solution(num, words);
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> spokenWords = new HashSet<>();

        int person = 0;
        int round = 0;
        spokenWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)
                    && !spokenWords.contains(words[i])) {
                spokenWords.add(words[i]);
            } else {
                person = (i % n) + 1;
                round = (i / n) + 1;
                break;
            }
        }
        answer[0] = person;
        answer[1] = round;
        return answer;
    }
}
