package programmers;

public class beginning_잘라서배열로저장하기 {
    public static void main(String[] args) {
        String given = "abc1Addfggg4556b";
        String[] result = solution(given, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] solution(String given, int n) {
        int totalLength = (given.length() + n - 1) / n;
        String[] result = new String[totalLength];
        for (int i = 0; i < totalLength; i++) {
            int first = n * i;
            int last = 0;
            if (first + n >= given.length()) {
                last = given.length();
            } else {
                last = first + n;
            }
            result[i] = given.substring(first, last);
        }
        return result;
    }
}
