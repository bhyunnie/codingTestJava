package bruteforce.boj_2231;

import java.io.*;

// 74784kb 284ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=1; i<=n;i++) {
            int sum = i;
            for(char c: String.valueOf(i).toCharArray()) {
                sum += Character.getNumericValue(c);
            };
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