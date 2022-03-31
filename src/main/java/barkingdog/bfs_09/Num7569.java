package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num7569 {
    static int[][][] map = new int[101][101][101];
    static int[][][] dist = new int[101][101][101];
    static int m, n, h;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {0, 0, 1, -1, 0, 0};
    static int[] dy = {1, -1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " "); 
                for (int k = 0; k < m; k++) {
                    int tomato = Integer.parseInt(st.nextToken());
                    map[j][k][i] = tomato;
                    if (tomato == 1){
                        q.offer(new int[]{j, k, i});
                    }
                    if (tomato == 0) {
                        dist[j][k][i] = -1;
                    }
                }
            }
        }

        while (!q.isEmpty()){
            int[] cur = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                int nz = cur[2] + dz[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) {
                    continue;
                }
                if (dist[nx][ny][nz] >= 0) {
                    continue;
                }
                dist[nx][ny][nz] = dist[cur[0]][cur[1]][cur[2]] + 1;
                q.offer(new int[]{nx, ny, nz});
            }
        }
        int maxDist = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (dist[j][k][i] == -1){
                        System.out.println(-1);
                        System.exit(0);
                    }
                    maxDist = Math.max(maxDist, dist[j][k][i]);
                }
            }
        }
        System.out.println(maxDist);
    }
}
