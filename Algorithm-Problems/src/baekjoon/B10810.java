package baekjoon;

import java.util.Scanner;

public class B10810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        int arrayRows = sc.nextInt();
        int[] answerArray = new int[arrayLength];
        int[] givenArray = new int[3];

        for (int i = 0; i < arrayRows; i++) {
            for (int j = 0; j < 3; j++) {
                givenArray[j] = sc.nextInt();
            }
            for (int j = givenArray[0] - 1; j < givenArray[1]; j++) {
                answerArray[j] = givenArray[2];
            }
        }

        for (int i : answerArray) {
            System.out.println(i);
        }
    }
}
