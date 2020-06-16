package AlgorithmProblem;

import java.util.Scanner;

public class Algorithm {
	
	public static void main(String args[]) {

// 기초 알고리즘 100문제(Code Up)
		
// * Problem 1013 
//		Problem: 2개의 정수가 공백으로 구분되어 입력된다.
		
//		    Scanner num = new Scanner(System.in);
//		    int num1 = num.nextInt();
//		    int num2 = num.nextInt();
//		        
//		       System.out.println(num1 + " " + num2);
//	    	   input: 1 2  output: 1 2
		
// * Problem 1014
//		Problem: 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		
//			Scanner stg = new Scanner(System.in);		
//			String fst = stg.next();
//			String snd = stg.next();
//			
//			System.out.println(snd + " " + fst);
 //         input: A b  output: b A

// * Problem 1017
// 		Problem: int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
		
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			
//				for(int i=0; i<3; i++) {
//					System.out.print(num + " ");
//				}
//           input: 125 output: 125 125 125
		
//	* Problem 1018
//		Problem: 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
//		
//			Scanner sc = new Scanner(System.in);
//			
//			String tm = sc.nextLine();
//			System.out.println(tm);
//		input: 3:15 output: 3:15
		
//	* Problem 1023
//		Problem: 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.   
//     * 나눌때는 꼭 특수기호앞에 \\ 붙힐것. 
			
//		Scanner sc = new Scanner(System.in);
//        
//        String array1[] = sc.next().split("\\.");
//        
//        for (int i=0; i< array1.length; i++) {
//        	System.out.println(array1[i]);
//  
//       }
//		 input: 123.45   output: 123  45
		
//	* Problem 1038
//		Problem: 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
//		(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
//		* 자릿수가 많은 Integer는 java.math.BigInteger 에 있는 변수 BigInteger를 써야된다.
//		
//		  Scanner sc = new Scanner(System.in);
//	        
//	        BigInteger num1 = sc.nextBigInteger();
//	        BigInteger num2 = sc.nextBigInteger();
//	        
//	        
//	        System.out.println(num1.add(num2));
//			input: 100000000 + 100000000  output: 200000000	
      
//	* Problem 1025
//		Problem: 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
//		 Scanner sc = new Scanner(System.in);
//	        
//	        String num1 = sc.nextLine();
//	        
//	        char[] ch = num1.toCharArray();  // 문자열을 캐릭터 어레이에 넣는 과정  
//	        
//	        for(int i=0; i<ch.length; i++){
//	        	System.out.print("[" + ch[i]);
//	            for (int j= ch.length-1; j>i; j--){     // 만약 2000이 인풋일때 i=0일때 j=3 3>0  j는 3, 2 , 1 로 줄어든다 
//	               System.out.print("0");
//	            }
//	            System.out.println("]");
//	        }
//	        
//	        input: 75234 output: 70000 5000 200 30 4
		
//	* Problem 1024
//		Problem: 단어를 1개 입력받는다. 입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력한다.
//		
//        Scanner sc = new Scanner(System.in);
//        
//        String word = sc.nextLine();
//        
//        char[] ch = word.toCharArray();
//        
//        for(int i=0; i< ch.length; i++){
//            System.out.println("'" +ch[i]+ "'");
//        }
//		
//        input: hmart output: 'h' 'm' 'a' 'r' 't'
		
//	* Problem 1040
//		Problem: 입력된 정수의 부호를 바꿔 출력해보자.
//		
//			   Scanner sc = new Scanner(System.in);
//    
//			    int num = sc.nextInt();
//			    
//			    System.out.println( -1*num);
		
//		  input: -1  output: 1
	
//	* Problem 1045
//		Problem: 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
//    Scanner sc = new Scanner(System.in);
//        
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//     
//        
//        System.out.println(num1 + num2); // 합 
//        System.out.println(num1 - num2); // 차
//        System.out.println(num1 * num2); // 곱
//        System.out.println(num1/num2); // 몫 
//        System.out.println(num1%num2); // 나머지 
//        double num3 = (double)num2;  // double 실수형으로 바꿔줘야함 소수점이나오기위해선 
//        System.out.printf("%.2f\n",num1/num3);   // printf() reads % to function. .2f -> 2 decimal places. 
//        										// when you use %d or %s, you have to use it in printf();
//        
//        input: 10 3 output: 13 7 30 3 1 3.33
	
//	* Problem 1052
//		Problem: 두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
//		
//		 Scanner sc = new Scanner(System.in);
//    
//		    int num1 = sc.nextInt();
//		    int num2 = sc.nextInt();
//		    
//		    if(num1 == num2){
//		        System.out.println(0);
//		    }else{
//		        System.out.println(1);
//		    }
//			
//        input: 1 1 output: 0
		
//	* Problem 1053
//		Problem: 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
//		
//		  Scanner sc = new Scanner(System.in);
//	        
//	        int num1 = sc.nextInt();
//	        
//	        if(num1 == 0){
//	            System.out.println(1);
//	        }else{
//	            System.out.println(0);
//	        }
//		
//	       input: 0  output: 1
		
//	* Problem 1066
//		Problem:세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
//		
//		 Scanner sc = new Scanner(System.in);
//    
//		    int num1 = sc.nextInt();
//		    int num2 = sc.nextInt();
//		    int num3 = sc.nextInt();
//		    
//		    if(num1 % 2 == 1){
//		        System.out.println("odd");
//		    }else{
//		        System.out.println("even");
//		    }
//		    if(num2 % 2 == 1){
//		        System.out.println("odd");
//		    }else{
//		        System.out.println("even");
//		    }
//		     if(num3 % 2 == 1){
//		        System.out.println("odd");
//		    }else{
//		        System.out.println("even");
//		    }
//		
//		     input: 1 2 5  output: odd even odd 
		
	}	
	
}
