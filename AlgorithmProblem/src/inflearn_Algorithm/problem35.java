package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem35 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		Integer[] arr = new Integer[n];
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());

		int lt=0,sum=0,count=0,answer=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				sum+=arr[j];
				for(int t=j+1;t<arr.length;t++) {
					sum+= arr[t];
					ans.add(sum);
					sum-= arr[t];
				}
				sum-=arr[j];
			}
			sum-=arr[i];
		}
		Collections.sort(ans);
	for(int i=ans.size()-1;0<i;i--) {
			System.out.println(ans.get(i));
	}
	}
}
