package programmers;

public class beginning_문자열계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");

        for (int i = 1; i < arr.length; i++) {
            int firstNum = Integer.parseInt(arr[0]);
            if (i == 1) {
                if (arr[i].equals("-")) {
                    answer -= firstNum;
                } else {
                    answer += firstNum;
                }
            } else {
                if (arr[i].equals("-")) {
                    answer -= Integer.parseInt(arr[i]);
                } else {
                    answer += Integer.parseInt(arr[i]);
                }
            }
        }

        return answer;
    }
}
