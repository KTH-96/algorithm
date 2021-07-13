package m07.day0712;

import java.io.*;

public class S2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = 0;
        for (int i = 0; i < n; i++) {
            bw.write(++c + "\n");
        }
        bw.flush();
        bw.close();

    }
}
