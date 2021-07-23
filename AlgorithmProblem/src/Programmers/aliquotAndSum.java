package Programmers;


public class aliquotAndSum  {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;

		int sum = 0;
		for(int i=left;i<=right;i++) {
			if(aliquot(i) % 2 ==0){
				sum+= i;
			}else {
				sum -=i;
			}
		}
		System.out.println(sum);
	}

	public static int aliquot(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		return count;
	}
}
