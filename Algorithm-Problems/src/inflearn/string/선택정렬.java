package inflearn.string;

import java.util.Scanner;

public class 선택정렬 {
    /*
        설명: N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
        정렬하는 방법은 선택정렬입니다.

        입력: 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

        출력:오름차순으로 정렬된 수열을 출력합니다.

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] numbers = new int[input1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        for(int n: doSort(numbers)){
            System.out.println(n);
        }
    }

    public static int[] doSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int idx = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[idx]) {
                    idx = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[idx];
            numbers[idx] = temp;
        }
        return numbers;
    }

}
