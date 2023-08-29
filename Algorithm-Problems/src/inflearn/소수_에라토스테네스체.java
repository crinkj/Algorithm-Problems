package inflearn;

import java.util.Scanner;

public class 소수_에라토스테네스체 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        getAnswer(num);
    }

    public static void getAnswer(int num) {
        int count = 1;
        for (int i = 3; i < num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

}
