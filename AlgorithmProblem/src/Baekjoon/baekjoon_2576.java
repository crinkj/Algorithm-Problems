package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2576 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean chk = false;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a % 2 == 1) {
                chk = true;
                sum += a;
                min = Math.min(min, a);
            }
        }
        if(!chk) bw.write("-1\n");
        else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
