package Baekjoon;

import java.util.Scanner;

public class baekjoon_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if(h == 0) {
			h = 24;
		}
		m = (h*60)+m-45;

		while(m > 60) {
			h=m/60;
			m=m%60;
		}

		System.out.println(h + " " + m);
	}

}
