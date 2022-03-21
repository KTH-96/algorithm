package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dist = new int[100002];
        Arrays.fill(dist, -1);
        dist[n] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(n);

        while (dist[k] == -1) {
            int cx = q.poll();
            for (int nx : new int[]{cx - 1, cx + 1, cx * 2}) {
                if (nx < 0 || nx > 100000) {
                    continue;
                }
                if (dist[nx] != -1) {
                    continue;
                }
                dist[nx] = dist[cx] + 1;
                q.offer(nx);
            }
        }
        System.out.println(dist[k]);
    }
}
