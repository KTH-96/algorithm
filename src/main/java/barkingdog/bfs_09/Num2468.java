package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Num2468 {
    static int n, maxArea, limitHeight;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(split[j]);
                limitHeight = Math.max(limitHeight, Integer.parseInt(split[j]));
            }
        }

        for (int height = 0; height < limitHeight + 1; height++) {
            int area = 0;
            visit = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                Queue<int[]> q = new LinkedList<>();
                for (int j = 0; j < n; j++) {
                    if (visit[i][j] || map[i][j] <= height) {
                        continue;
                    }
                    visit[i][j] = true;
                    q.offer(new int[]{i, j});
                    area++;
                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = cur[0] + dx[k];
                            int ny = cur[1] + dy[k];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                                continue;
                            }
                            if (visit[nx][ny] || map[nx][ny] <= height) {
                                continue;
                            }
                            q.offer(new int[]{nx, ny});
                            visit[nx][ny] = true;
                        }
                    }
                }
                maxArea = Math.max(maxArea, area);
            }
        }
        System.out.println(maxArea);
    }
}
