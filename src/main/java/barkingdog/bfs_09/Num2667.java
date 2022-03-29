package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num2667 {
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            Arrays.fill(visit[i], false);
            for (int j = 0; j < n; j++) {
                map[i][j] = chars[j];
            }
        }

        int area = 0;
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j] || map[i][j] == '0') {
                    continue;
                }
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{i, j});
                visit[i][j] = true;
                int size = 1;
                area++;
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = cur[0] + dx[k];
                        int ny = cur[1] + dy[k];

                        if (nx < 0 || ny < 0 || ny >= n || nx >= n) {
                            continue;
                        }
                        if (visit[nx][ny] || map[nx][ny] == '0') {
                            continue;
                        }
                        q.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        size++;
                    }
                }
                sizes.add(size);
            }
        }
        Collections.sort(sizes);
        System.out.println(area);
        for (Integer size : sizes) {
            System.out.println(size);
        }
    }
}
