package programmers;

public class lvl0_7의개수 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120912?language=java
     * @문제 7의 개수
     */
    public static void main(String[] args) {
        int[] nums = {7,77,17};
        int answer = 0;

        for (int num : nums) {
            answer += checkSeven(num);
        }
        System.out.println(answer);
    }

    public static int checkSeven(int value) {
        int result = 0;
        String num = String.valueOf(value);
        char[] numArr = num.toCharArray();
        for (char number : numArr) {
            if (number == '7') {
                result++;
            }
        }
        return result;
    }
}
