package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Num1012 {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] map;
    static boolean[][] vist;

    static int m, n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            String[] split = br.readLine().split(" ");
            m = Integer.parseInt(split[0]);
            n = Integer.parseInt(split[1]);
            map = new int[m][n];
            vist = new boolean[m][n];
            for (int j = 0; j < Integer.parseInt(split[2]); j++) {
                String[] xy = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                map[x][y] = 1;
            }
            int count = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (map[j][k] == 1 && !vist[j][k]) {
                        bfs(j, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        vist[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int j = 0; j < 4; j++) {
                int nx = cur[0] + dx[j];
                int ny = cur[1] + dy[j];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n){
                    continue;
                }
                if (map[nx][ny] != 1 || vist[nx][ny]){
                    continue;
                }
                vist[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
