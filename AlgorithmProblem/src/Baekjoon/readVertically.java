package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class readVertically{
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        char[][] arr = new char[5][15];

        for (int i = 0; i < arr.length; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == ' ' || arr[j][i] == '\0')
                    continue;
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }

}