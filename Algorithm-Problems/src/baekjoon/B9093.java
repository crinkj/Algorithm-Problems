package baekjoon;
import java.util.Scanner;

// https://www.acmicpc.net/problem/9093
public class B9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < times; i++) {
            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");

            // 각 단어를 뒤집어서 출력
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                System.out.print(reversedWord.reverse() + " ");
            }

            System.out.println(); // 개행
        }

    }
}
