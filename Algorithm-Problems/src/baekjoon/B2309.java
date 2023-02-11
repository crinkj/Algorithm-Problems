package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B2309 {
    /**
     * https://www.acmicpc.net/problem/10798
     *
     * @문제 5줄 문자 받아서 세로로 읽기
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char[][] inputs = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < input.length(); j++) {
                inputs[i][j] = input.charAt(j);
            }
        }

        String result = "";
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (inputs[j][i] != '\0')
                    result += inputs[j][i];
            }
        }
        System.out.println(result);
    }
}
