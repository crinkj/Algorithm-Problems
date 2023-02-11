package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B2490 {
    /**
     * https://www.acmicpc.net/problem/2490
     *
     * @문제 윷놀이
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] input = new int[3][4];

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                input[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<input.length;i++){
            int count = 0;
            for(int j=0;j<4;j++){
                if(input[i][j] == 0){
                    count++;
                }
            }
            switch (count){
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }
        }
    }
}
