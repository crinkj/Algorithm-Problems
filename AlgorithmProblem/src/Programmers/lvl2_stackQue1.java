package Programmers;

import java.util.Stack;

public class lvl2_stackQue1 {
	// https://programmers.co.kr/learn/courses/30/lessons/42586 기능개발
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=progresses.length-1;i>=0;i--){
            stack.push(progresses[i]);
        }
         System.out.println(stack.peek());

        return answer;
    }
}
