package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1924
public class B1924 {
    // 1,3,5,7,8,10,12  -> 31일
    // 4,6,9,11    -> 30일
    // 2        -> 28일

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT" };

        int totalDays = 0;
        for (int i = 0; i < month; i++) {
            totalDays += months[i];
        }
        totalDays += day;

        String answer = days[totalDays % 7];
        System.out.println(answer);
    }
}
