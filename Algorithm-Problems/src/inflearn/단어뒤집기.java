package inflearn;

import java.util.Scanner;

public class 단어뒤집기 {
    /*
        설명: N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
        입력: 첫 줄에 자연수 N(3<=N<=20)이 주어집니다. 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
        출력: N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

        예시 입력:3                                예시 출력:doog
                good                                     emiT
                Time                                     giB
                Big

            String a = "abcd";
            StringBuilder(a).reverse().toString();

            StringBuilder() 와 reverse() 함수를 사용해 문자열을 거꾸로 뒤집을 수 있다.
            StringBuffer()는 객체를 생성할때 한번만 생성되고 변경이 가능하다. String 자료형은 변경이 불가능하다.
            String 자료형보다 무거우므로 문자열 추가나 변경작업이 많을떼 사용하는걸 추천한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(reverseWord(arr[i]));
        }
    }

    public static String reverseWord(String word) {
        String answer = "";
        char[] charArr = word.toCharArray();
        for (int i = charArr.length - 1; 0 <= i; i--) {
            answer += charArr[i];
        }
        return answer;
    }

}
