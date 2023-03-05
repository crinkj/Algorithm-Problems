package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class beginning_숫자찾기 {
    public static void main(String[] args) {
        System.out.println(solution(232443, 4));
    }

    public static int solution(int num, int k) {
        int result = -1;
        char[] charArr = String.valueOf(num).toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (String.valueOf(charArr[i]).equals(String.valueOf(k))) {
                result = i + 1;
                return result;
            }
        }
        return result;
    }
}
