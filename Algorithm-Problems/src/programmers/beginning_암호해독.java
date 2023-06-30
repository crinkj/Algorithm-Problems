package programmers;

public class beginning_암호해독 {
    public static void main(String[] args){
        System.out.println(solution("dfjardstddetckdaccccdegk",4));
    }
    public static String solution(String cipher, int code) {
        String answer = "";
        char[] arr = cipher.toCharArray();
        for(int i=0;i<arr.length;i++){
            if((i+1) % code == 0){
                answer += arr[i];
            }
        }
        return answer;
    }
}
