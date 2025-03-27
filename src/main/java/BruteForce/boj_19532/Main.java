package bruteforce.boj_19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 16160kb 168ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        int e = Integer.parseInt(arr[4]);
        int f = Integer.parseInt(arr[5]);
        for(int x=-999;x<1000;x++) {
            for (int y=-999;y<1000;y++) {
                if (((a+d) * x) + ((b+e) * y) == c+f) {
                    if (((a-d) * x) + ((b-e) * y) == c-f) {
                        System.out.println(x + " " + y);
                    }
                }
            }
        }
    }
}
