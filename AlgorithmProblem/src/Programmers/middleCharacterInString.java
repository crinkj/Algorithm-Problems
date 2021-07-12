package Programmers;

public class middleCharacterInString {
/*
 * 문제: 	가운데 글자 가져오기)단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
	public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();

        if(arr.length % 2 == 1){ // 캐릭터 배열이 홀 수 일경우 
            answer += arr[arr.length/2];  
        }else{ // 캐릭터 배열이 짝우리경우
           answer += arr[(arr.length/2)-1];
           answer += arr[(arr.length/2)];  //
        }
        return answer;
    }
}
