package programmers;

import java.util.HashMap;

public class beginning_영어가싫어요 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120894
     * @param args
     */

    public static void main(String[] args){
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
    }
    public static long solution(String numbers){
        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<numberArr.length;i++){
            System.out.println(numberArr[i]);
            numbers = numbers.replace(numberArr[i],String.valueOf(i));
        }
        return Long.valueOf(numbers);
    }
}
