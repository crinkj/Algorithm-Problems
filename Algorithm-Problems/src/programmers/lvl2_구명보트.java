package programmers;

import java.util.Arrays;
import java.util.Stack;

public class lvl2_구명보트 {

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(getAnswer(people, limit));

    }

    public static int getAnswer(int[] people, int limit) {

        Arrays.sort(people);
        int index = 0;
        int boats = 0;
        for (int i = people.length - 1; i >= index; i--) {
          int sum = people[i] + people[index];
          if(sum <= limit){
              index++;
          }
          boats++;
        }
        return boats;
    }
}
