package baekjoon;

import java.util.*;

// https://www.acmicpc.net/problem/17413
public class B17413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean isInside = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                isInside = true;
                System.out.print(word.charAt(i));
            } else if (word.charAt(i) == '>') {
                isInside = false;
                System.out.print(word.charAt(i));
            } else if (isInside) {
                System.out.print(word.charAt(i));
            } else {
                if (word.charAt(i) != ' ') {
                    stack.push(word.charAt(i));
                } else {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(' ');
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
