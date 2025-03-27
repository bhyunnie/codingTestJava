package bruteforce.boj_3040;

import java.io.*;

// 14120kb 104ms
public class Enhanced {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];
        boolean flag = false;
        int sum = 0;
        for(int i=0;i<9;i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        for (int i=0; i<9; i++) {
            for (int j=i+1; j<9; j++) {
                if ((sum - (nums[i] + nums[j])) == 100) {
                    for(int n=0;n<9;n++) {
                        if(n != i && n != j) {
                            System.out.println(nums[n]);
                        }
                    }
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        br.close();
    }
}
