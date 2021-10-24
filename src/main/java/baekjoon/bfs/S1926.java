package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1926 {
    static int n,m;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];
        qu = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        int count = 0;
        int area = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                count++;
                qu.add(new Pair(i,j));
                visited[i][j] = true;
                area = 0;
                while (!qu.isEmpty()) {
                    Pair pair = qu.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nx = pair.getX() + dx[k];
                        int ny = pair.getY() + dy[k];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if (board[nx][ny] != 1 || visited[nx][ny]) continue;
                        qu.add(new Pair(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
                max = Math.max(max, area);
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    public static class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
    }

}
