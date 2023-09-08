package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10953
public class B10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseCount = sc.nextInt();
        String[] cases = new String[caseCount];
        for (int i = 0; i < caseCount; i++) {
            cases[i] = sc.next();
        }

        for (String s : cases) {
            String[] numbers = s.split(",");
            int first =  Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);
            System.out.println(first + second);
        }
    }
}
