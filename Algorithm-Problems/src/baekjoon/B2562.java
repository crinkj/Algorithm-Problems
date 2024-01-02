package baekjoon;

import java.util.Scanner;

public class B2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
