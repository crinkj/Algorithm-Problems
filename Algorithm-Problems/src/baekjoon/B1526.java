package baekjoon;

import java.io.IOException;
import java.util.Scanner;

class B1526 {
    /**
     * https://www.acmicpc.net/problem/1526
     *
     * @문제 가장 큰 금민수
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            boolean isAnswer = false;
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '4' || s.charAt(j) == '7') {
                    isAnswer = true;
                } else {
                    isAnswer = false;
                    break;
                }
            }
            if (isAnswer) {
                System.out.println(Integer.valueOf(s));
                break;
            }
        }
    }
}
