package programmers;

public class beginning_편지 {
    public static void main(String[] args){
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message){
        return message.trim().length() * 2;
    }
}
