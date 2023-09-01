package etc;

public class 초시간변환기 {
    public static void main(String[] args) {
        int price = 12345678;
        String string = String.valueOf(price);
        String answer = "";
        for (int i = 0; i < string.length(); i++) {
            int remainingDigits = string.length() -(i + 1);
            answer += string.charAt(i);
            if (remainingDigits % 3 == 0 && remainingDigits > 0) {
                answer += ",";
            }
        }
        System.out.println(answer);
    }
}
