package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Num10026 {
    static StringBuilder sb = new StringBuilder();
    static boolean[][] vist;
    static int[][] map;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        vist = new boolean[n + 1][n + 1];
        map = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                String color = split[j];
                if (color.equals("R")) {
                    map[i][j] = 1;
                }
                if (color.equals("G")) {
                    map[i][j] = 2;
                }
                if (color.equals("B")) {
                    map[i][j] = 3;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!vist[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        sb.append(count).append(" ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 2) {
                    map[i][j] = 1;
                }
            }
        }
        Arrays.fill(vist, false);
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!vist[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        vist[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }
                if (vist[nx][ny] || map[x][y] != map[nx][ny]) {
                    continue;
                }
                vist[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
