package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        boolean[][] visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int size = 0;
        int num = 0;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visit[i][j] || board[i][j] == 0) {
                    continue;
                }
                num++; //1개만 있어도 그림 수 증가
                Queue<int[]> q = new LinkedList<>();
                visit[i][j] = true;
                q.offer(new int[]{i, j});
                area = 0;
                while (!q.isEmpty()) {
                    area++;
                    int[] poll = q.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = poll[1] + dx[k];
                        int ny = poll[0] + dy[k];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue;
                        }
                        if (visit[nx][ny] || board[nx][ny] == 0) {
                            continue;
                        }
                        visit[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
                size = Math.max(size, area);
            }
        }
        System.out.println(num);
        System.out.println(size);
    }
}
