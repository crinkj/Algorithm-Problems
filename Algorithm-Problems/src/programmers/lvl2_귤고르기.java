package programmers;

import java.util.*;

public class lvl2_귤고르기 {

    public static void main(String[] args) {
        int[] size = {1, 3, 2, 5, 4, 5, 2, 3};
        int k = 6;
        System.out.println(getAnswer(size, k));

    }

    public static int getAnswer(int[] size, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int answer = 0;
        for (int i : size) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> intArr = new ArrayList<>(map.values());
        Collections.sort(intArr, Collections.reverseOrder());
        for (int i : intArr) {
            k -= i;
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}
