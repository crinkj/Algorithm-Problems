package inflearn.string;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(printString(sc.next()));
    }

    public static String printString(String word) {
        char[] charArr = word.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char first;
            int count = 1;
            if (Character.isAlphabetic(charArr[i])) {
                first = charArr[i];
                charArr[i] = charArr[charArr.length - count];
                charArr[charArr.length - count] = first;
                count++;
            }else{
                count++;
            }
        }
        return String.valueOf(charArr);

    }
}
