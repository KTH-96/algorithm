package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Num10026 {
    static char[][] map = new char[101][101];
    static boolean[][] visit = new boolean[101][101];
    static int n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = chars[j];
            }
        }
        int one = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    one++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visit[i][j] = false;
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }


        int two = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    two++;
                }
            }
        }
        System.out.println(one + " " + two);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        visit[x][y] = true;
        q.offer(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }
                if (visit[nx][ny] || map[cur[0]][cur[1]] != map[nx][ny]) {
                    continue;
                }
                visit[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
