package inflearn.string;

import java.util.Scanner;

public class 특정문자뒤집기 {
    /*
        설명:영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
            특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
        입력:첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
        출력:첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

        예시 입력 1: a#b!GE*T@S             예시 출력 1: S#T!EG*b@a
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(printString(sc.next()));
    }

    public static String printString(String word) {
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while (start < end) {
            char letter;
            if (!Character.isAlphabetic(charArr[start])) {
                start++;
            } else if (!Character.isAlphabetic(charArr[end])) {
                end--;
            } else {
                letter = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = letter;
                start++;
                end--;
            }
            System.out.println(start);
            System.out.println(end);
        }
        return String.valueOf(charArr);

    }
}
