package inflearn_Algorithm;

import java.util.Scanner;

public class problem22 {

	public static void main(String[] args) {
//		문제: 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//			각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
//			격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//			만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[][] arr = new int[num+2][num+2]; // 가장자리 위아래 오른쪽 왼쪽을 더해줘야하기떄문에 +2 씩 더해준다

		for(int i=1; i<arr.length-1;i++) {
			for(int j=1;j<arr.length-1;j++) {  // 인덱스 0 이랑 마지막 인덱스 빼고 받기
				arr[i][j] = sc.nextInt();
               }
		}
// 방법 1)
//		int cnt = 0;
//		for(int i=1;i<arr.length;i++) {
//			for(int j=1; j< arr.length;j++) {
//				if(arr[i][j] != 0) { // 0 이아닐때(가장자리가 아닐때)
//					if(arr[i][j]> arr[i-1][j] && arr[i][j]> arr[i][j-1] && arr[i][j]> arr[i+1][j] && arr[i][j]> arr[i][j+1]) { // 왼쪽 오른쪽 위 아래보다 클때 더해준다
//						cnt++;
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
// 방법 2)
		int[] dx= { -1,0,1,0};
		int[] dy = {-1,0,1,0};

		int answer = 0;
		for(int i=0; i< num;i++) {
			for(int j=0;j<num; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					 int nx = i+dx[k];
					 int ny = i+dy[k];

					 if(arr[nx][ny] > arr[i][j]) {
						 flag = false;
						 break;
					 }
				}
				if(flag) answer++;
			}
		}
	System.out.println(answer);

	}

}
