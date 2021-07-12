package day0712;

import java.io.*;

public class S2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = n; i > 0; i--) {
            bw.write(n-- + "\n");
        }
        bw.flush();
        bw.close();

    }
}
