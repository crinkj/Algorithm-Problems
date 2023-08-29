package inflearn;

import java.util.Scanner;

public class 격자판최대합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        getAnswer(num, arr);
    }

    public static void getAnswer(int num, int[][] arr) {
        int sum1, sum2;
        int answer = 0;
        for (int i = 0; i < num; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < num; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < num; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][num - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        System.out.println(answer);
    }

}
