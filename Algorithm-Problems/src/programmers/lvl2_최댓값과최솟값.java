package programmers;

public class lvl2_최댓값과최솟값 {

    public static void main(String[] args) {
        String s = "1 2 3 4";
        String[] arr = s.split(" ");

        int max = Integer.valueOf(arr[0]);
        int min = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int num = Integer.valueOf(arr[i]);
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.print(min + " " + max);
        System.out.print(max);
    }
}
