package bruteforce.boj_3040;

import java.io.*;
import java.util.ArrayList;

// 14320kb 108ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> nums = new ArrayList<>();
        String str = "";
        boolean flag = false;
        while ((str= br.readLine()) != null) {
            nums.add(Integer.parseInt(str));
        }
        for (int i=0;i<9;i++) {
            for (int j=i+1;j<9;j++) {
                for (int k=j+1;k<9;k++) {
                    for (int l=k+1;l<9;l++) {
                        for (int m=l+1;m<9;m++) {
                            for (int n=m+1;n<9;n++) {
                                for (int o=n+1;o<9;o++) {
                                    if (100 == nums.get(i) + nums.get(j) + nums.get(k) + nums.get(l) + nums.get(m) + nums.get(n) + nums.get(o)) {
                                        if (flag) break;
                                        bw.write(nums.get(i) + "\n");
                                        bw.write(nums.get(j) + "\n");
                                        bw.write(nums.get(k) + "\n");
                                        bw.write(nums.get(l) + "\n");
                                        bw.write(nums.get(m) + "\n");
                                        bw.write(nums.get(n) + "\n");
                                        bw.write(nums.get(o) + "");
                                        bw.flush();
                                        br.close();
                                        bw.close();
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
