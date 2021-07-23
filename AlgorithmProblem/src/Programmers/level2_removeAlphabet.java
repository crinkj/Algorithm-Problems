package Programmers;

import java.util.Stack;

public class level2_removeAlphabet {

	public static void main(String[] args) {
	String s = "cdcd";
	Stack<Character> stack = new Stack<Character>();
	int answer = 0;
	for(int i=s.length()-1;0 <= i;i--) {
		if(!stack.empty()) {
			if(stack.peek() == s.charAt(i)) {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}
		}else {
			stack.push(s.charAt(i));
		}
	}

	if(stack.size() == 0) {
		answer = 1;
	}
		System.out.println(answer);
	}
}
