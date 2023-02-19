package programmers;

public class beginning_배열원소의길이 {

    public static void main(String[] args) {
        /**
         * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120854
         * 배열 원소의 길이
         */
        String[] strlist = {"We", "Are", "the", "world!"};

        int[] result = new int[strlist.length];
        for (int i=0;i< strlist.length;i++) {
            result[i] = strlist[i].length();
            System.out.println(result[i]);
        }

    }
}
