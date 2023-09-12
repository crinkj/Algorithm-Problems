package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/9093
public class B1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }

    public static int solution(int num) {
        int[] arr = new int[num];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < num; i++) {
            int min = arr[i - 1] + 1;
            if (arr[i] % 3 == 0) {
                arr[i] = Math.min(min, arr[i / 3] + 1);
            }
            if (arr[i] % 2 == 0) {
                arr[i] = Math.min(min, arr[i / 2] + 1);
            }
        }
        return arr[num-1];
    }
}
