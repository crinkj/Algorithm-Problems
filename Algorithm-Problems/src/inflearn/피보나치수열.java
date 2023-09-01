package inflearn;

import java.util.Scanner;

public class 피보나치수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        getAnswer(num);
    }

    public static void getAnswer(int num) {

        int first = 1;
        int second = 1;
        int sum = 0;
        for (int i = 2; i < num; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

    }

}
