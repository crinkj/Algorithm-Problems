package Programmers;

import java.util.Arrays;

public class level1_sort_KthNum {
	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/42748
	 */
	public static void main(String args[]) {

		// Arrays.copyOfRange 사용
	     	int[] array = {1,5,2,6,3,7,4};
	        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	        int[] answer = new int[commands.length];

//	        for(int i=0;i<commands.length;i++) {
//	        	int first = commands[i][0];
//	        	int end = commands[i][1];
//	        	int idx = commands[i][2];
//	        	// 배열 복사해서 새로운 배열 생성( Arrays.copyOfRange(배열이름,시작인덱스, 끝 인덱스)
//	        	int[] arr1 = Arrays.copyOfRange(array,first-1, end);
//	        	// 배열 정렬
//	        	Arrays.sort(arr1);
//	        	answer[i] = arr1[idx -1];
//	        }

        for(int i=0;i<commands.length;i++) {
	        	int first = commands[i][0];
	        	int end = commands[i][1];
	        	int selectedIndex = commands[i][2];
	        	int[] arr = new int[end-first+1];
	        	// 인덱스를 0으로 세팅해준후 for문에 돌리기위해
	        	int index = 0 ;

	        	for(int j=first-1; j<end;j++) {
	        		arr[index] = array[j];
	        		index++;
	        	}

	        	// 배열 정렬
	        	Arrays.sort(arr);
	        	
	        	answer[i] = arr[selectedIndex-1];
        }


	}

}
