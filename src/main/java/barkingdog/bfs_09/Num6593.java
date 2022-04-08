package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.FileReader;
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
    static int sl, sr, sc;
    static int[] dx = {0, 0, 1, -1, 0, 0};
    static int[] dy = {1, -1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        //new InputStreamReader(System.in)
        BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (l == 0 && r == 0 && c == 0){
                break;
            }
            map = new char[l][r][c];
            dist = new int[l][r][c];

            for (int floor = 0; floor < l; floor++) {
                for (int i = 0; i < r; i++) {
                    String line = br.readLine();
                    for (int j = 0; j < c; j++) {
                        char ch = line.charAt(j);
                        map[floor][i][j] = ch;
                        if (ch == '#') {
                            dist[floor][i][j] = -1;
                        }
                        if (ch == 'S') {
                            dist[floor][i][j] = 0;
                            sr = i;
                            sc = j;
                            sl = floor;
                        }
                        if (ch == 'E'){
                            dist[floor][i][j] = 0;
                            fr = i;
                            fc = j;
                            fl = floor;
                        }
                        if (ch == '.') {
                            dist[floor][i][j] = 0;
                        }
                    }
                }
                br.readLine();
            }
            bfs();
        }
    }

    private static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sl, sr, sc});
        dist[sl][sr][sc] = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 6; i++) {
                int nr = cur[1] + dx[i];
                int nc = cur[2] + dy[i];
                int nl = cur[0] + dz[i];

                if (nr < 0 || nc < 0 || nl < 0 || nr >= r || nc >= c || nl >= l) {
                    continue;
                }
                if (dist[nl][nr][nc] == -1) {
                    continue;
                }
                if (map[nl][nr][nc] == 'E') {
                    System.out.println("Escaped in "+(dist[cur[0]][cur[1]][cur[2]])+" minute(s).");
                    return;
                }
                dist[nl][nr][nc] = dist[cur[0]][cur[1]][cur[2]] + 1;
                q.offer(new int[]{nl, nr, nc});
            }
        }
        System.out.println("Trapped!");
        return;
    }
}
