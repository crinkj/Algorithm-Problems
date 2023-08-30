package inflearn;

import java.util.Scanner;

public class 임시반장정하기 {

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
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i + 1;
            }
        }
        System.out.println(answer);
    }

}
