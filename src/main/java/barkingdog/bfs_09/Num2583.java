package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num2583 {
    static int m, n, k;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1,};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visit = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int fx = Integer.parseInt(st.nextToken());
            int fy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            for (int j = fy; j < ey; j++) {
                for (int l = fx; l < ex; l++) {
                    map[j][l] = 1;
                }
            }
        }
        int area = 0;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 || visit[i][j]) {
                    continue;
                }
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{i, j});
                visit[i][j] = true;
                int width = 1;
                area++;
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    for (int l = 0; l < 4; l++) {
                        int nx = cur[0] + dx[l];
                        int ny = cur[1] + dy[l];
                        if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                            continue;
                        }
                        if (map[nx][ny] == 1 || visit[nx][ny]) {
                            continue;
                        }
                        q.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        width++;
                    }
                }
                answer.add(width);
            }
        }
        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        sb.append(area).append("\n");
        for (int i = 0; i < answer.size(); i++) {
            if (i == answer.size() - 1) {
                sb.append(answer.get(i));
                break;
            }
            sb.append(answer.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
