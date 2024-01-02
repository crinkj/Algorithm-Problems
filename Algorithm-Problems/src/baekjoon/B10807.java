package baekjoon;

import java.util.Scanner;

public class B10807 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int givenNumber = sc.nextInt();
       int[] givenArray = new int[givenNumber];
       for(int i=0;i<givenNumber;i++){
           givenArray[i] = sc.nextInt();
       }
       int targetNumber = sc.nextInt();
       System.out.println(getAnswer(givenArray,targetNumber));

   }

   private static int getAnswer(int[] givenArray, int targetNumber){
       int answerCount = 0;
       for(int number : givenArray){
           if(targetNumber == number){
               answerCount++;
           }
       }
       return answerCount;
   }
}
