package BruteForce.BOJ_2231;

import java.io.*;


// 14876kb 128ms
public class Enhanced {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=1; i<=n;i++) {
            int sum = i;
            int temp = i;

            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == n) {
                result = i;
                break;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}