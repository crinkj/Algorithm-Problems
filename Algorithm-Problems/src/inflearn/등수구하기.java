package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class 등수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            ans[i] = sc.nextInt();
        }
        getAnswer(ans);
    }

    public static void getAnswer(int[] scores) {
        for(int i=0;i<scores.length;i++){
            int rank = 1;
            for(int j=0;j< scores.length;j++){
                 if(scores[i] < scores[j]){
                     rank++;
                 }
             }
            System.out.print(rank + " ");
        }
    }

}
