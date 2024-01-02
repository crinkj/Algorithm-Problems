package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> dwarfs = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            dwarfs.add(sc.nextInt());
        }
        int spy1 = 0;
        int spy2 = 0;

        int total = dwarfs.stream().mapToInt(Integer::intValue).sum();
        for (int i = 0; i < dwarfs.size(); i++) {
            for (int j = i + 1; j < dwarfs.size(); j++) {
                if (total - dwarfs.get(i) - dwarfs.get(j) == 100) {
                    spy1 = dwarfs.get(i);
                    spy2 = dwarfs.get(j);
                }
            }
        }
        Collections.sort(dwarfs);
        for (int i = 0; i < dwarfs.size(); i++) {
            if (dwarfs.get(i) != spy1 && dwarfs.get(i) != spy2) {
                System.out.println(dwarfs.get(i));
            }
        }

    }
}
