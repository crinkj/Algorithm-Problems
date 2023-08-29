package inflearn;

import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            ans[i] = sc.nextInt();
        }
        System.out.println(getAnswer(ans));
    }

    public static int getAnswer(int[] ans) {

        int start = 0;
        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 1) {
                start++;
            } else {
                start = 0;
            }
            sum += start;
        }
        return sum;
    }

}
