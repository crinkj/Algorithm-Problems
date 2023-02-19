package programmers;

public class beginning_특정문자제거하기 {

    public static void main(String[] args) {
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            char convertedChar = letter.charAt(0);
            if (c != convertedChar) {
                answer += c;
            }
        }
        return answer;
    }
}
