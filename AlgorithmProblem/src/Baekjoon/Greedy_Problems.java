package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_Problems{
    public static void main(String[] args){
        
    	
//    * Problem 11399: 줄을 [2, 5, 1, 4, 3] 순서로 줄을 서면, 2번 사람은 1분만에, 5번 사람은 1+2 = 3분, 1번 사람은 1+2+3 = 6분, 4번 사람은 1+2+3+3 = 9분, 3번 사람은 1+2+3+3+4 = 13분이 걸리게 된다. 
//    		각 사람이 돈을 인출하는데 필요한 시간의 합은 1+3+6+9+13 = 32분이다. 이 방법보다 더 필요한 시간의 합을 최소로 만들 수는 없다.
//      
//    	Scanner sc = new Scanner(System.in);
//        
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//        
//        for(int i=0; i<num; i++){
//            arr[i] = sc.nextInt();
//        }
//        // Arrays.sort 메소드를 이용하면 ascending 순서로 숫자가 정렬된
//        Arrays.sort(arr);
//        
//        int min = 0;
//        int total = 0;
//        for(int i=0; i< arr.length; i++) {
//        	min += arr[i];
//        	total += min;
//        	
//        }
//        System.out.println(total);
//       
//        input: 5			output: 32
//        	   3 3 1 2 4
        
//    	* Problem 11047:준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
//    						동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
//    							첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
//    								둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
//    		
//    	Scanner sc = new Scanner(System.in);
//        
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//        int[] arr = new int[N];
//        int count= 0;
//        for(int i = 0; i < N; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = N-1; i >= 0; i--){ // 높은숫자부터 계
//            if(K >= arr[i]){	// 금액이 동전 가치보다 클경우 
//                count += K/arr[i]; // 4200원 / 1000원 = 4.2 4개로들어가고 
//                K = K%arr[i]; 200원이 새로운 K값이된다;
//            }
//        }
//        System.out.println(count);
//    	
//        input:  10 4200					output: 6
//		        1
//		        5
//		        10
//		        50
//		        100
//		        500
//		        1000
//		        5000
//		        10000
//		        50000
    	
//    * Problem 5585: 타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 
//    					타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
//    	 Scanner sc = new Scanner(System.in);
//          
//         int pay = sc.nextInt();
//         int[] arr = new int[]{500,100,50,10,5,1};
//          
//         int change = 1000 - pay;
//         int count = 0;
//         
//         for(int i=0; i<arr.length; i++){       
//                 if(change >= arr[i]){
//                 
//                   count += change/arr[i];
//                   change = change%arr[i];
//                 }
//         }
//          System.out.println(count);
//          
//          input: 380			output: 4  // 620원  500원 1개 100원 1개 십원 2


//      * Problem 2217: 첫째 줄에 정수 N이 주어진다. 다음 N개의 줄에는 각 로프가 버틸 수 있는 최대 중량이 주어진다. 이 값은 10,000을 넘지 않는 자연수이다.
//    	  
//    	   Scanner sc = new Scanner(System.in);
//    
//		    int num = sc.nextInt();
//		    
//		    int[] arr = new int[num];
//		    for(int i=0; i< num; i++){
//		         arr[i] = sc.nextInt();  
//		    }
//		    Arrays.sort(arr);
//		     
//		    for(int i=0; i<arr.length; i++){
//		        arr[i] = arr[i] * (num -i); //최대값 넣어주기 
//		    }
//		    Arrays.sort(arr); // 큰숫자로 정렬 
//		    System.out.println(arr[num-1]); //마지막 최대값 출력
//		    
//		    input: 2 			output: 30
//		    	   15 20    
    	
//		* Problem 10610: 어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
//  							미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라. 만약 그숫자가안만들어지면 -1 출	
//		문제조건 받은 숫자를 정해서 섞어서 30배수가 되는 가장 큰 숫자를 만들려면
//					마지막은 0으로 끝나면서 다 더했을때 3으로 나누면 0으로떨어지는 숫자여야한다 
//    	Scanner sc = new Scanner(System.in);
//    	
//    	String num = sc.next();
//    	int[] arr = new int[num.length()];
//    	int sum = 0; 
//    	
//    	for(int i=0; i<arr.length; i++) {
//    		arr[i] = num.charAt(i) - '0'; // change string character to int
//    		
//    		sum += arr[i]; // declare sum if it can be divided by 3.
//    	}
//    	Arrays.sort(arr);	// sort an array from smallest number to largest number
//    	if(sum % 3 == 0 && arr[0] == 0) {
//    		for(int i = arr.length -1; i >= 0; i--) {
//    			System.out.print(arr[i] + "");
//    		}
//    	}
//    		else {
//    			System.out.println(-1);
//    		
//    	}
//     
//    	input: 102			output: 210
//    	input: 2931			output: -1
    
//    	* Problem 1541: 첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다.
//         조건: -로시작하는 자리 뒤에 (를 추가하고 새로은 -로시작하기전에 )를 추가한다
    
//    	Scanner sc = new Scanner(System.in);
//    	
//    	String num = sc.nextLine();
//    	
//    	for(int i=0; i< num.length(); i++){
//    		String[] arr = num.split("");
//    		 
//    		if(arr[i] == "-") {
//    			arr[i] = "-(";
//    		};
//    		
//    	}
//    	* Problem 2875: 여러분은 여학생의 수 N, 남학생의 수 M, 인턴쉽에 참여해야하는 인원
//    			K가 주어질 때 만들 수 있는 최대의 팀 수를 구하면 된다.

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // Female
//        int m = sc.nextInt(); // Male
//        int k = sc.nextInt(); // Intern
//        
//        int count = 0; 
//        
//        // Condition for a competition
//        // female should be more than 2 and 
//        // male should be more than 1 and 
//        // total number should be intern number + 3(competition team)
//        while(n > 2 && m > 1 && k + 3 <= n + m){ 
//        	
//            n = n-2;
//            m = m-1;
//            count++; 
//        }
//        System.out.println(count);
//    
//        input: 6 3 2    output: 2
    
//		* Problem 1931: 여러분은 여학생의 수 N, 남학생의 수 M, 인턴쉽에 참여해야하는 인원
//		K가 주어질 때 만들 수 있는 최대의 팀 수를 구하면 된다.
//    	Scanner sc = new Scanner(System.in);
//    	
//    	int num = sc.nextInt();
//    	
//    	int[][] arr = new int[num][2];
//    	
//    	for(int i=0; i<num; i++) {
//    		arr[i][0] = sc.nextInt();
//    		arr[i][1] = sc.nextInt();
//    	}
//    	
//    	Arrays.sort(arr, (a,b) -> a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
//    	
//    	int endTime = 0; // 끝나는 시간 
//    	int count = 0; // 회의의 수
//    	for(int i=0; i<num; i++){ 
//    		if (arr[i][0] >= endTime) { // 회의 시작 시간이 이전 회의의 끝나는 시간 이후면 
//    			endTime = arr[i][1]; // 끝나는 시간 바꿔주고 count++; // 회의 추가 } } System.out.print(count);
//    		}
//    	}
//		* 별 출력  
//    	 Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++) {
//            	 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = n; i > 0; i--) {
//             for(int j = 0; j < i-1; j++) {                
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         
//         입력 : 3		출력: *
//         					 **
//         					 ***
//         					 **
//         					 *
       
//    	 Scanner sc = new Scanner(System.in);
//         
//         int n = sc.nextInt();
//         
//         for(int i=1;i<=n;i++) { // 중앙을 포함하므로 n까지 반복한다.
// 			for(int j=1;j<=n;j++) { // 열은 기본적으로 n까지 반복한다.
// 				if( j> n-i &&j<= n) { // 마지막 부분을 시작으로 -i값의 범위까지 별을 찍어준다.
// 					System.out.print("*");
// 				}
// 				else System.out.print(" ");
// 			}			
// 			System.out.println();
// 		}
//         for(int i=n-1;i>0;i--) { // 윗 부분과 반대로 찍어야 하기 때문에 반복문의 조건을 바꿔준다.
// 			for(int j=1;j<=n;j++) { // 열은 동일
// 				if( j> n-i &&j<= n) { // 마지막 부분부터 n-i까지의 범위에
// 					System.out.print("*"); // 별을 찍는다.
// 				}
// 				else System.out.print(" ");
// 			}			
// 			System.out.println();
// 		}
////          입력: 3    출력:    *
////         				     **
////         				    ***
////         				     **
////         				      *
    
 //   	* Problem 1120: 첫째 줄에 A와 B가 주어진다. A와 B의 길이는 최대 50이고, A의 길이는 B의 길이보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.
//    	 String x = scanner.next();
//         String y = scanner.next();
//
//         int result = x.length();
//
//         for(int i=0;i<y.length()-x.length()+1;i++){
//             int tmp=0;
//
//             for(int j=0;j<x.length();j++){
//                 if(x.charAt(j)!=y.charAt(j+i)){
//                     tmp++;
//                 }
//             }
//             if(result > tmp){
//                 result = tmp;
//             }
//         }
//
//         System.out.println(result);
//		입력: X=”jimin”, Y=”minji”    출력: 4   
    
    
//    Scanner sc = new Scanner(System.in);
//        
//        int num = sc.nextInt();
//        int total = sc.nextInt();
//        
//        int[] arr = new int[num];
//        
//        int count = 0;
//        for(int i=0; i<num; i++){
//            int coin = sc.nextInt();
//            arr[i] = coin;
//        }
//        for(int i=num-1; i>=0; i--){
//            if(total > arr[i]){
//                count += total/arr[i];
//                total = total%arr[i]; 
//            }
//        }
//        System.out.println(count);
//    }
    	
//    	* Problem 2562:
    			// 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//	Scanner scan = new Scanner(System.in);
//		
//		int max = 0;
//		int max_loc = 0;
//		for(int i = 1; i <= 9; i++) {
//			int num = scan.nextInt();
//			if(num > max) {
//				max = num;
//				max_loc = i;
//			}
//		}
//		System.out.println(max);
//		System.out.println(max_loc);
//	}
    
    // 입력: 3				출력:85
//		    29 					8
//		    38
//		    12
//		    57
//		    74
//		    40
//		    85
//		    61
//    	* Problem 1138: N명의 사람들은 매일 아침 한 줄로 선다. 이 사람들은 자리를 마음대로 서지 못하고 오민식의 지시대로 선다.
			//    	Scanner sc = new Scanner(System.in);
			//	int n = sc.nextInt();
			//	int[] a = new int[n+1];
			//	int[] b = new int[n+1];
			//	
			//	for(int i = 1; i <= n; i++){
			//		a[i] = sc.nextInt();
			//	}
			//	
			//	for(int i = 1; i <= n; i++) {
			//		int j = 1;
			//		while(true) {
			//			if(a[i] == 0 && b[j] == 0) {
			//				b[j] = i;
			//				break;
			//			}
			//			else if(b[j] == 0) {
			//				a[i] = a[i] - 1;
			//			}
			//			j++;
			//		}
			//	}
			//	
			//	for(int i = 1; i <= n; i++) {
			//		System.out.print(b[i] + " ");
			//	}
			//
			//	입력: 4					출력: 4 2 1 3
			//		 2 1 1 0
//    }
    // 로또 번호 생성 ( 조건: 로또 공 45개  추첨하는 번호는 6개)
    	    	
    	int[] lotto = new int[6];	
    	int jackPot = 0;
    	
    	
    	for(int i=0; i<6; i++) {
    		
    	  jackPot = (int)(Math.random()*45 + 1);
    	  lotto[i] = jackPot;
   
    	}
    	for(int j=0; j<lotto.length; j++) {
    		
    			System.out.print(lotto[j] + " ");
    		
    	}
    
    }
    
}