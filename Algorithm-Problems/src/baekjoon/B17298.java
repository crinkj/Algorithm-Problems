package baekjoon;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/17298
public class B17298 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }

        for(int a: arr){
            System.out.print(a + " ");
        }

    }
}
