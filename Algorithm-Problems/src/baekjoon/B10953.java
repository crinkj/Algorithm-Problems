package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10953
public class B10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n  = sc.nextInt();
        Character answer = word.charAt(n-1);
        System.out.println(answer);
    }
}
