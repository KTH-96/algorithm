package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Num7562 {
    static int[][] dist = new int[305][305];
    static int[] dx = {-2, -2, 2, 2, 1, 1, -1, -1};
    static int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            Queue<int[]> q = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());
            String[] start = br.readLine().split(" ");
            String[] finish = br.readLine().split(" ");
            dist = new int[n][n];
            for (int j = 0; j < n; j++) {
                Arrays.fill(dist[j], -1);
            }
            int startX = Integer.parseInt(start[0]);
            int startY = Integer.parseInt(start[1]);
            dist[startX][startY] = 0;
            int finishX = Integer.parseInt(finish[0]);
            int finishY = Integer.parseInt(finish[1]);
            q.offer(new int[]{startX, startY});

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                for (int j = 0; j < 8; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                        continue;
                    }
                    if (dist[nx][ny] >= 0){
                        continue;
                    }
                    dist[nx][ny] = dist[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
            System.out.println(dist[finishX][finishY]);
        }
    }
}
