package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[m][n];
        int[][] dist = new int[m][n];

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(split[j]);
                if (board[i][j] == 0) {
                    dist[i][j] = -1;
                }
                if (board[i][j] == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                    continue;
                }
                if (dist[nx][ny] >= 0) {
                    continue;
                }
                dist[nx][ny] = dist[cx][cy] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, dist[i][j]);
            }
        }
        System.out.println(max);
    }
}
