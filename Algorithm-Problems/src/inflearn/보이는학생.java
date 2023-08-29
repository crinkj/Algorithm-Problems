package inflearn;

import java.util.Scanner;

public class 보이는학생 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleCount = sc.nextInt();
        int[] peopleArr = new int[peopleCount];
        for (int i = 0; i < peopleCount; i++) {
            int current = sc.nextInt();
            peopleArr[i] = current;
        }
        System.out.println(getAnswer(peopleArr));

    }

    public static int getAnswer(int[] people) {
        int answer = 1;
        int first = people[0];
        for (int i = 1; i < people.length; i++) {
            if (first < people[i]) {
                answer++;
            first = people[i];
            }
        }
        return answer;
    }
}
