package baekjoon;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int maxNumber = sc.nextInt();
        for (int i = 0; i < arrayLength; i++) {
            int number = sc.nextInt();
            if(number < maxNumber){
                System.out.print(number + " ");
            }
        }
    }
}
