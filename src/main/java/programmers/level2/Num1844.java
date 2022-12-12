package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Num1844 {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int[][] visit;
    public int solution(int[][] maps) {
        visit = new int[maps.length][maps[0].length];

        bfs(maps, 0, 0);
        if (visit[maps.length - 1][maps[0].length - 1] == 0) {
            return -1;
        }
        return visit[maps.length - 1][maps[0].length - 1];
    }

    private void bfs(int[][] maps, int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        visit[y][x] = 1;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int py = poll[0];
            int px = poll[1];
            for (int i = 0; i < 4; i++) {
                int ny = py + dy[i];
                int nx = px + dx[i];

                if (ny < 0 || ny > maps.length - 1 || nx < 0 || nx > maps[0].length - 1) {
                    continue;
                }
                if (visit[ny][nx] == 0 && maps[ny][nx] == 1) {
                    visit[ny][nx] = visit[py][px] + 1;
                    q.add(new int[]{ny, nx});
                }
            }
        }
    }

}
