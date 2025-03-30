package bruteforce.boj_15721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 14924kb 112ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int people = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        String want = br.readLine();
        StringBuilder sb = new StringBuilder();
        String intro = "0101";
        int n = 1;
        while (sb.length() < t*2) {
            sb.append(intro);
            sb.append("0".repeat(n+1)).append("1".repeat(n+1));
            n += 1;
        }
        String[] str = sb.toString().split("");
        int count = 0;
        for (int i=0;i<str.length;i++) {
            if (want.equals(str[i])) {
                count++;
                if (count == t) {
                    System.out.println(i % people);
                }
            }
        }
    }
}
