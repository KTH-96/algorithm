package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num5427 {
    static char[][] map;
    static int[][] distF;
    static int[][] distP;
    static int test, m,n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean impossible = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        test = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int a = 0; a < test; a++) {
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            map = new char[n][m];
            distF = new int[n][m];
            distP = new int[n][m];
            Queue<int[]> qF = new LinkedList<>();
            Queue<int[]> qP = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                char[] chars = br.readLine().toCharArray();
                for (int j = 0; j < m; j++) {
                    map[i][j] = chars[j];
                    if (map[i][j] != '#') {
                        if (map[i][j] == '*') {
                            qF.offer(new int[]{i, j});
                            distF[i][j] = 1;
                        }
                        if (map[i][j] == '@') {
                            qP.offer(new int[]{i, j});
                            distF[i][j] = 1;
                        }
                    } else {
                        distF[i][j] = -1;
                        distF[i][j] = -1;
                    }
                }
            }
            while (!qF.isEmpty()) {
                int[] cur = qF.poll();
                int x = cur[0];
                int y = cur[1];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                        continue;
                    }
                    if(map[nx][ny] == '.' || map[nx][ny] == '@') {
                        distF[nx][ny] = distF[x][y] + 1;
                        qF.offer(new int[]{nx, ny});
                    }
                }
            }
            while (!qP.isEmpty() && !impossible) {
                int[] cur = qP.poll();
                int x = cur[0];
                int y = cur[1];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                        System.out.println(distP[x][y]);
                        impossible = true;
                        break;
                    }
                    if (map[nx][ny] == '.' && distF[nx][ny] < distP[x][y] + 1) {
                        qP.offer(new int[]{nx, ny});
                        distP[nx][ny] = distP[x][y] + 1;
                    }
                }
            }
            if (!impossible){
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
