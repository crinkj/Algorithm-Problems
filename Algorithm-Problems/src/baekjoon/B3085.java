package baekjoon;

import java.util.Scanner;

public class B3085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        char[][] arr = new char[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                char temp = arr[i][j];
                System.out.println(temp);
// 양옆
                arr[i][j] = arr[i][j + 1];
                arr[i][j+1] = temp;

                result = Math.max(result,compareLength(arr));

                temp = arr[i][j+1];
                arr[i][j+1] = arr[i][j];
                arr[i][j] = temp;

// 위 아래
                temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;

                result = Math.max(result,compareLength(arr));
                temp = arr[j+1][i];
                arr[j+1][i] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        System.out.println(result);
    }


    public static int compareLength(char[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    sum++;
                } else {
                    Math.max(sum, result);
                    sum = 0;
                }
            }
            result = Math.max(sum,result);
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == arr[j+1][i]) {
                    sum++;
                } else {
                    Math.max(sum, result);
                    sum = 0;
                }
            }
            result = Math.max(sum,result);
        }

        return result;
    }
}

