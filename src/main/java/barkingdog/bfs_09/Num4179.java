package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num4179 {
    static String[][] map = new String[1002][1002];
    static int[][] dist1 = new int[1002][1002];
    static int[][] dist2 = new int[1002][1002];

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Queue<int[]> q1 = new LinkedList<>();
        Queue<int[]> q2 = new LinkedList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dist1[i][j] = -1;
                dist2[i][j] = -1;
            }
        }

        for (int i = 0; i < r; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < c; j++) {
                String input = split[j];
                map[i][j] = input;
                if (input.equals("F")) {
                    q1.offer(new int[]{i, j});
                    dist1[i][j] = 0;
                    continue;
                }
                if (input.equals("J")) {
                    q2.offer(new int[]{i, j});
                    dist2[i][j] = 0;
                    continue;
                }
            }
        }

        while (!q1.isEmpty()) {
            int[] cur = q1.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                    continue;
                }
                if (dist1[nx][ny] >= 0 || map[nx][ny].equals("#")) {
                    continue;
                }
                dist1[nx][ny] = dist1[cur[0]][cur[1]] + 1;
                q1.offer(new int[]{nx, ny});
            }
        }

        while (!q2.isEmpty()) {
            int[] cur = q2.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                    System.out.println(dist2[cur[0]][cur[1]] + 1);
                    return;
                }
                if (dist2[nx][ny] >= 0 || map[nx][ny].equals("#")) {
                    continue;
                }
                if (dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[cur[0]][cur[1]] + 1) {
                    continue;
                }
                dist2[nx][ny] = dist2[cur[0]][cur[1]] + 1;
                q2.offer(new int[]{nx, ny});
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
