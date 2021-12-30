package study.backtracking;

import java.io.IOException;

public class S15651 {
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        N = 4;
        M = 2;

        arr = new int[M];
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int dept) {
        if (dept == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= N; i++) {
            arr[dept] = i;
            dfs(dept + 1);
        }
    }
}
