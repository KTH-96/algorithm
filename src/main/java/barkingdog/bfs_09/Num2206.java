package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num2206 {

	private static int[] dx = {-1, 1, 0, 0};
	private static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][][] dist = new int[n][m][2];
		char[][] map = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				char ch = str.charAt(j);
				map[i][j] = ch;
				dist[i][j][0] = -1;
				dist[i][j][1] = -1;
			}
		}
		System.out.println(bfs(n, m, dist, map));
	}

	private static int bfs(int n, int m, int[][][] dist, char[][] map) {
		Queue<int[]> q = new LinkedList<>();
		dist[0][0][0] = 1;
		dist[0][0][1] = 1;
		q.offer(new int[]{0, 0, 0});
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];
			int broken = cur[2];
			if (x == n - 1 && y == m - 1) {
				return dist[x][y][broken];
			}
			int nextDist = dist[x][y][broken] + 1;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if (map[nx][ny] == '0' && dist[nx][ny][broken] == -1) {
					dist[nx][ny][broken] = nextDist;
					q.offer(new int[]{nx, ny, broken});
				}
				if (broken == 0 && map[nx][ny] == '1' && dist[nx][ny][1] == -1) {
					dist[nx][ny][1] = nextDist;
					q.offer(new int[]{nx, ny, 1});
				}
			}
		}
		return -1;
	}
}
