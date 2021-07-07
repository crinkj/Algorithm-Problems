package inflearn_Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class problem36 {

	/*
	 * 올바른 괄호: 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	 *			 (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	 */

	public static boolean main(String[] args) {
				Scanner sc = new Scanner(System.in);
				String s = sc.next();
		        boolean answer = true;
		        Stack<Character> stack = new Stack<Character>();

		        for(int i=0; i<s.length(); i++){
		                if(s.charAt(i) == '(')  // 현재 (가 들어갈 자리면 스택에 넣는다.
		                    stack.push('(');
		                else{
		                    if(stack.isEmpty()) // 현재 )가 들어갈 자리인데 스택이 비어있을경우 -> false
		                        return false;
		                    else
		                        stack.pop();    // 현재 )가 들어갈 상태에서 스택에 괄호('(')가 있는경우 -> pop
		                }
		        }
		        answer = (stack.isEmpty()) ? true : false;
		        return answer;
	}
}
