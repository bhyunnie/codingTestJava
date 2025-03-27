package bruteforce.boj_22864;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 14184kb 104ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tired = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(st.nextToken());
        int release = Integer.parseInt(st.nextToken());
        int maxTired = Integer.parseInt(st.nextToken());
        int tiredSum = 0;
        int result = 0;
        for (int i=0;i<24;i++) {
            if (tiredSum + tired <= maxTired) {
                result += work;
                tiredSum += tired;
            } else {
                tiredSum = Math.max(0, tiredSum - release);
            }
        }
        System.out.print(result);
    }
}
