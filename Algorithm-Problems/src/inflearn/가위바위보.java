package inflearn;

import java.util.Scanner;

public class 가위바위보 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rounds = sc.nextInt();
        int[] first = new int[rounds];
        int[] second = new int[rounds];
        for (int i = 0; i < rounds; i++) {
            first[i] = sc.nextInt();
        }
        for (int i = 0; i < rounds; i++) {
            second[i] = sc.nextInt();
        }
        getAnswer(rounds, first, second);
    }

    public static void getAnswer(int rounds, int[] first, int[] second) {

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                System.out.println("D");
            } else {
                String winner = getWinner(first[i], second[i]);
                if (winner.equals("first")) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
        }
    }

    public static String getWinner(int first, int second) {
        String whatFirstHas = "";
        String whatSecondHas = "";
        if (first == 1) {
            whatFirstHas = "scissor";
        } else if (first == 2) {
            whatFirstHas = "rock";
        } else if (first == 3) {
            whatFirstHas = "paper";
        }

        if (second == 1) {
            whatSecondHas = "scissor";
        } else if (second == 2) {
            whatSecondHas = "rock";
        } else if (second == 3) {
            whatSecondHas = "paper";
        }

        if (whatFirstHas.equals("scissor") && whatSecondHas.equals("rock")) {
            return "second";
        } else if (whatFirstHas.equals("rock") && whatSecondHas.equals("paper")) {
            return "second";
        } else if (whatFirstHas.equals("paper") && whatSecondHas.equals("scissor")) {
            return "second";
        }
        return "first";
    }
}
