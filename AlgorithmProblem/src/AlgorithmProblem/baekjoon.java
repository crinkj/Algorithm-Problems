package AlgorithmProblem;


import java.util.Arrays;
import java.util.Scanner;

public class baekjoon{
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
    	
    }    
}