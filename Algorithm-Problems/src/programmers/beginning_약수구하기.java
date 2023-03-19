package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class beginning_약수구하기 {
    public static void main(String[] args) {
        System.out.println(solution(24));
    }

    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answers.add(i);
            }
        }
        return answers;
    }
}
