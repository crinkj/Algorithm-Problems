package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B3048_NotSolved {
    /**
     * https://www.acmicpc.net/problem/3048
     *
     * @문제 개미
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String groupSize = sc.nextLine();
        String first = sc.nextLine();
        String second = sc.nextLine();

        String[] size = groupSize.split(" ");
        int firstGroupSize = Integer.parseInt(size[0]);
        int secondSize = Integer.parseInt(size[1]);

        char[] firstGroup = first.toCharArray();
        char[] secondGroup = second.toCharArray();

        int seconds = sc.nextInt();

        firstGroup = reverseCharArr(firstGroup);

        for (int i = 0; i < seconds; i++) {
            if (i == 0) {
                firstGroup[firstGroupSize] = secondGroup[i];
                secondGroup[i] = firstGroup[firstGroupSize - i];
            } else {
                char firstChar = firstGroup[firstGroupSize - i - 1];
                firstGroup[firstGroupSize - i - 1] = firstGroup[firstGroupSize - 1];
                firstGroup[firstGroupSize - i] = firstChar;

                char secondChar = firstGroup[i + 1];
                secondGroup[i + 1] = secondGroup[i];
                secondGroup[i] = secondChar;
            }
        }
        String result = new String(firstGroup) + new String(secondGroup);
        System.out.println(result);
    }

    public static char[] reverseCharArr(char[] firstGroup) {
        System.out.println(firstGroup.length);
        char[] reversedArr = new char[firstGroup.length];

        for (int i = 0; i < firstGroup.length / 2; i++) {
            char a = firstGroup[i];
            firstGroup[i] = firstGroup[firstGroup.length - 1];
            firstGroup[firstGroup.length -1 ] = a;
        }
        return reversedArr;
    }
}
