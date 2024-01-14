package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10813
public class B10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basketSize = sc.nextInt();
        int changeCounts = sc.nextInt();

        int[] givenArray = makeGivenArray(basketSize);

        for (int i = 0; i < changeCounts; i++) {
            int givenFirstNum = sc.nextInt();
            int givenSecondNum = sc.nextInt();

            int tempNum = givenArray[givenSecondNum - 1];
            givenArray[givenSecondNum - 1] = givenArray[givenFirstNum - 1];
            givenArray[givenFirstNum - 1] = tempNum;
        }

        for(int i: givenArray){
            System.out.print(i + " ");
        }

    }

    private static int[] makeGivenArray(int arraySize) {
        int[] givenArray = new int[arraySize];

        for (int i = 0; i < givenArray.length; i++) {
            givenArray[i] = i + 1;
        }
        return givenArray;
    }

}

//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 바구니의 개수 N과 교환 횟수 M 입력 받기
//        int basketSize = sc.nextInt();
//        int exchangeCount = sc.nextInt();
//
//        // 초기 바구니 상태 생성
//        int[] baskets = initializeBaskets(basketSize);
//
//        // 교환 수행
//        for (int i = 0; i < exchangeCount; i++) {
//            int firstBasket = sc.nextInt();
//            int secondBasket = sc.nextInt();
//
//            // 교환 수행
//            exchangeBalls(baskets, firstBasket, secondBasket);
//        }
//
//        // 최종 바구니 상태 출력
//        printBaskets(baskets);
//    }
//
//    private static int[] initializeBaskets(int size) {
//        int[] baskets = new int[size];
//        for (int i = 0; i < size; i++) {
//            baskets[i] = i + 1;
//        }
//        return baskets;
//    }
//
//    private static void exchangeBalls(int[] baskets, int first, int second) {
//        // 바구니의 인덱스는 0부터 시작하므로 1을 뺀 값을 사용
//        first--;
//        second--;
//
//        // 교환 수행
//        int temp = baskets[first];
//        baskets[first] = baskets[second];
//        baskets[second] = temp;
//    }
//
//    private static void printBaskets(int[] baskets) {
//        // 바구니 상태 출력
//        for (int ball : baskets) {
//            System.out.print(ball + " ");
//        }
//    }
//}
