package bruteforce.boj_10448;

import java.io.*;

// 16140kb 180ms
// bufferedWriter 제거
// 근데 시간복잡도 워스트 케이스에서 10억이 넘지않나?
// 이걸 보고 브루트 포스를 생각할 수 있나?
public class Enhanced {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] nums = new int[45];
        for (int i=0;i<45;i++) {
            nums[i] = ((i+1) * (i+2)) / 2;
        }
        for (int t=0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i : nums) {
                for (int j: nums) {
                    for (int k: nums) {
                        if (i + j + k == n) {
                            result = 1;
                            break;
                        }
                    }
                    if (result == 1) break;
                }
                if (result == 1) break;
            }
            System.out.println(result);
        }
    }
}
