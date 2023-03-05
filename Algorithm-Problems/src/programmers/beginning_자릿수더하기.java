package programmers;

public class beginning_자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(930211));
    }

    public static int solution(int n) {
        int result = 0;
        String convertedString = String.valueOf(n);
        char[] charArr = convertedString.toCharArray();
        for(char c: charArr){
            result += Integer.parseInt(String.valueOf(c));
        }
        return result;
    }
}
