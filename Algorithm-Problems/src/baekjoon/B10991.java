package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1463
public class B10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dp = new int[num + 1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + 1;
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }
        }
        System.out.println(dp[num]);
    }

}
