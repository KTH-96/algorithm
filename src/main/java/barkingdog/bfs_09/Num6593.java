package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num6593 {
    static char[][][] map;
    static int[][][] dist;
    static int l, r, c;
    static int fl, fr, fc;
    static int[] finish = new int[3];
    static int[] dx = {0, 0, 1, -1, 0, 0};
    static int[] dy = {1, -1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (l == 0 && r == 0 && c == 0){
                break;
            }
            map = new char[r + 1][c + 1][l + 1];
            dist = new int[r + 1][c + 1][l + 1];

            Queue<int[]> q = new LinkedList<>();
            for (int floor = 0; floor < l; floor++) {
                for (int i = 0; i < r; i++) {
                    String line = br.readLine();
                    for (int j = 0; j < c; j++) {
                        char ch = line.charAt(j);
                        map[i][j][floor] = ch;
                        if (ch == '#') {
                            dist[i][j][floor] = -1;
                        }
                        if (ch == '.'){
                            dist[i][j][floor] = 0;
                        }
                        if (ch == 'S') {
                            dist[i][j][floor] = 0;
                            q.offer(new int[]{i, j, floor});
                        }
                        if (ch == 'E'){
                            dist[i][j][floor] = 0;
                            fr = i;
                            fc = j;
                            fl = floor;
                        }
                    }
                }
            }
            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                int z = cur[2];
                for (int dir = 0; dir < 6; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    int nz = z + dz[dir];
                    if (nx < 0 || ny < 0 || ny < 0 || nx >= r || ny >= c || nz >= l) {
                        continue;
                    }
                    if (dist[nx][ny][nz] == -1) {
                        continue;
                    }
                    dist[nx][ny][nz] = dist[x][y][z] + 1;
                    q.offer(new int[]{nx, ny, nz});
                }
            }

            if (dist[fr][fc][fl] == 0) {
                System.out.println("Trapped!");
            }else {
                System.out.println("Escaped in " + dist[fr][fc][fl] + " minute(s).");
            }
        }
    }
}
