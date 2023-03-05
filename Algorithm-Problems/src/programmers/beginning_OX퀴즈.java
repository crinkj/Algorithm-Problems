package programmers;

public class beginning_OX퀴즈 {
    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(solution(quiz));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] quizArr = quiz[i].split(" ");
            int firstNum = Integer.parseInt(quizArr[0]);
            int secondNum = Integer.parseInt(quizArr[2]);
            int eqNum = Integer.parseInt(quizArr[4]);
            switch (quizArr[1]) {
                case "+":
                    if (firstNum + secondNum == eqNum) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                    break;
                case "-":
                    if (firstNum - secondNum == eqNum) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                    break;
            }
        }
        return answer;
    }
}
