package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B2884 {
    /**
     * https://www.acmicpc.net/problem/2884
     *
     * @문제 알람 시계
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int leftMinutes = minutes - 45;

        if(leftMinutes < 0){
            if(hour == 0){
                hour = 23;
            }else{
                hour = hour - 1;
            }
            minutes = 60 + leftMinutes;
        }else{
            minutes = leftMinutes;
        }

        System.out.println(hour + " " + minutes);
    }
}
