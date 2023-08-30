package programmers;

public class lvl2_JadenCase문자열만들기 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }

    public static String solution(String s) {
        String[] sp = s.toLowerCase().split("");
        String answer = sp[0].toUpperCase();
        for(int i=1;i<sp.length;i++){
            if(sp[i-1].equals(" ")){
                answer += sp[i].toUpperCase();
            }else{
               answer += sp[i];
            }
        }
        return answer;
    }
}
