package BruteForce.BOJ_10448;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

// 20980kb 236ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();
            int result = 0;
            int x = 1;
            while((x * (x+1)) / 2 <= n) {
                nums.add((x * (x+1)) / 2);
                x++;
            }
            int len = nums.size();
            for (Integer i : nums) {
                for (Integer j: nums) {
                    for (Integer k: nums) {
                        if (i + j + k == n) {
                            result = 1;
                            break;
                        }
                    }
                    if (result == 1) break;
                }
                if (result == 1) break;
            }
            bw.write(result +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
