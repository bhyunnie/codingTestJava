package bruteforce.boj_22864;

import java.io.*;

// 14352kb 104ms
public class Enhanced {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int tired = Integer.parseInt(input[0]);
        int work = Integer.parseInt(input[1]);
        int release = Integer.parseInt(input[2]);
        int maxTired = Integer.parseInt(input[3]);
        int tiredSum = 0;
        int result = 0;
        for (int i=0;i<24;i++) {
            if (tiredSum + tired <= maxTired) {
                result += work;
                tiredSum += tired;
            } else {
                tiredSum -= release;
                if (tiredSum < 0) tiredSum = 0;
            }
        }
        bw.write(result + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
