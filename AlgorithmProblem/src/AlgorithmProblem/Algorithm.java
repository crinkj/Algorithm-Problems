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

//		* Problem 1070
//		Problem:월이 입력될 때 계절 이름이 출력되도록 해보자.
		
//		 Scanner sc = new Scanner(System.in);
//	        int num1 = sc.nextInt();
//	        
//	        switch(num1){
//	        	case 12:
//	            case 1:
//	            case 2:
//	                System.out.println("winter");
//	                break;
//	            case 3:
//	            case 4:
//	            case 5:
//	                System.out.println("spring");
//	                break;
//	            case 6:
//	            case 7:
//	            case 8:
//	                System.out.println("summer");   
//	                break;
//	            case 9:
//	            case 10:
//	            case 11:
//	                System.out.println("fall");   /// 9, 10 , 11 은 어차피 fall이므로 11에 응답만해주면 출력되고 break으로 끊긴다.
//	                break;
//	        } 

//  		input: 4 	output:spring

// ************************* Goto Statement: a statement performs a one - way transfer of control to anothe rline of code( it supports some languagues, not all).
		
//		* Problem 1071
//		Problem:0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.  ( there is no goto statement in java, so used while loop)
		
//		Scanner sc = new Scanner(System.in);
		
//        while(true){						// break가 작동전까지 계속 돌아감
//            int num1 = sc.nextInt();
//            
//            if(num1 == 0){
//                break;        			// 0일때 반복문 작동안하게
//            }else{
//                System.out.println(num1);
//            }
//        }

//  input and output: it asks you a number until you type 0;

//	* Problem 1074
//	   Problem: 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
		
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int num = sc.nextInt();
//	        
//	        for(int i = num; i > 0; i--){
//	            System.out.println(i);
//	        }
//	       
//	        input: 5 output: 5 4 3 2 1 

//	* Problem 1076
//		* Problem: 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
//		Scanner sc = new Scanner(System.in);
//        
//		char input = sc.next().charAt(0);
//		
//		char start = 'a';
//		
//		do {
//			System.out.print(start + " ");
//			start+=1;									// 알파벳 증
//			
//		} while(start <= input);

//		input: d 	output: a b c d

//	* Problem 1078
//		* Problem: 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
//		
//		Scanner sc = new Scanner(System.in);
//    
//		    int num = sc.nextInt();
//		    int total = 0;
//		    
//		    for(int i=0; i<= num; i++){		        
//		        if(i % 2 == 0){
//		            total += i;
//		        }
//		    }
//  
//		    System.out.println(total);

//			input: 8  output: 20
	        
//	* Problem 1079
//		* Problem: 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
//			Scanner sc = new Scanner(System.in);
//			
//			while(true) {
//				char word = sc.next().charAt(0);
//				
//				if(word == 'q') {
//					System.out.println(word);
//					break;
//				}
//				System.out.println(word);
//			}

//		when input is 'q', the function will be stopped after it prints out 'q'
		
//	* Problem 1081
//		* Problem: 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
//		
//			Scanner sc = new Scanner(System.in);
//	        
//	        int n = sc.nextInt();
//	        int m = sc.nextInt();
//	        
//	        for(int i=1; i <= n; i++){
//	            for(int j=1; j <= m; j++){
//	                System.out.println(i+" " + j);			// for loop(j) runs every for loop(i);
//	            }
//	        }

// 			input: 2 3   output: 1 1, 1 2, 1 3, 2 1, 2 2, 2 3
        
//	* Problem 1083
//		* Problem: 3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
//		3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
//	
//		 Scanner sc = new Scanner(System.in);
//    
//		    int num = sc.nextInt();
//		    
//		    for (int i=1; i<= num; i++){
//		        if(i%10 == 3 || i%10 == 6 || i%10 == 9){
//		            System.out.println("X");
//		        }else {
//		            System.out.println(i);
//		        }
//		    }
//		    
//		    input: 6   output: 1 2 X 4 5 X
	
//	* Problem 1084
//		* Problem: 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
//		줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
//
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int red = sc.nextInt();
//	        int green = sc.nextInt();
//	        int blue = sc.nextInt();
//	        
//	        int total = 0;
//	        
//	        if( red >= 0 && green >= 0 && blue >= 0) {
//	        for(int i= 0; i < red; i++){
//	            for(int j=0; j<green; j++){
//	                for(int k=0; k<blue; k++){
//	           
//	                    System.out.println(i + " " + j + " " + k);
//	                    total++;
//	                }
//	            }
//	        }
//	        System.out.println(total);
//	        }				// it prints out as the answer, but it exceeds time.
		
		
							//		Scanner sc = new Scanner(System.in);
							//		int red = sc.nextInt();
							//		int green = sc.nextInt();
							//		int blue = sc.nextInt();
							//		
							//		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));   
										// BufferedWriter:Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast.
							
							//			for(int i=0; i<red; i++) {
							//				for(int j=0; j<green; j++) {
							//					String str="";
							//					for(int k=0; k<blue;k++) {
							//						str += i+" "+j+" "+k+"\n";						
							//					}
							//					bf.write(str);
							//					bf.flush();
							//				}
							//			}
							//			System.out.println(red*green*blue);
							//		}					// answer and it executes on time;   

		
//		    
//		    input: 2 2 2 output:    0 0 0
//								    0 0 1
//								    0 1 0
//								    0 1 1
//								    1 0 0
//								    1 0 1
//								    1 1 0
//								    1 1 1
//								    8
		
//	* Problem 1085
//		* Problem:h, b, c, s 가 공백을 두고 입력된다. h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.

//        Scanner sc = new Scanner(System.in);
//        
//        int h= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int s= sc.nextInt();
//        
//        if(h <= 48000 && b <= 32 & b % 8 == 0 && c <= 5 && s <= 6000 ){
//            double total = h * b * c * s ;
//            double result = ((total/8)/1024)/1024;
//            
//            System.out.printf("%.1f MB", result);   // printf() reads % to function. .2f -> 2 decimal places. 
//         									   // when you use %d or %s, you have to use it in printf();
//		    }

//		  Scanner sc = new Scanner(System.in);
//	        
//	        int w = sc.nextInt();
//	        int h = sc.nextInt();
//	        int b = sc.nextInt();
//	        
//	        if ( w >= 1 && w <= 1024 && h >=1 && h <= 1024 && b <= 40 && b % 4 == 0){
//	            double total = (w * h * b)/8;
//	            double result = (total/1024)/1024;
//	            
//	            System.out.printf("%.2f MB", result); // %.2f =  2자리 소수
//	            
//	        }
//	        
//	        input: 1024 768 24 output: 2.25 MB

// * Problem 1087 
//		* problem : 언제까지 합을 계산할 지, 정수 1개를 입력받는다. 단, 입력되는 자연수는 100,000,000이하이다.
//		
//		내풀이: 
//		  Scanner sc = new Scanner(System.in);
//	        
//	        int total = 0;
//	        int num = 0;
//	        while(true){
//	            
//	             num = sc.nextInt();
//	            
//	            for(int i= 0; i<=num; i++){
//	                if( num >= total){
//	                    total += i;
//	                    
//	                }else{
//	                    System.out.println(total);
//	                    break;
//	                }
//	            }
//	        }
		
//		정답:
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			int sum = 0;
//			if(num <= 100000000){
//				int x = 1;
//				while(true){
//					if(sum >= num){
//						break;
//					}else{
//						sum += x;
//						x++;	
//					}
//				}
//			}
//			System.out.println(sum);
//	     
//	        input: 57      output: 66  
		
//	* Problem 1088
//		Problem: 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되 3의 배수는 출력하지 않는다.
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int num = sc.nextInt();
//	        if(num <= 100) {
//	        for(int i=1; i< num; i++){
//	            if( i % 3 == 0){
//	                continue;
//	            }else{
//	                 System.out.println(i);
//	            }
//	        }
//	        } 
//	        
//	        input:10 output: 1 2 4 5 7 8 10
		
		    
	}	
	
}
