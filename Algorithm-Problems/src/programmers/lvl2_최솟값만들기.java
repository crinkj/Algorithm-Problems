package programmers;

import java.util.Arrays;

public class lvl2_최솟값만들기 {

    public static void main(String[] args) {

        System.out.println(getAnswer(new int[]{1, 2, 4}, new int[]{5, 6, 2}));

    }

    public static int getAnswer(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}
