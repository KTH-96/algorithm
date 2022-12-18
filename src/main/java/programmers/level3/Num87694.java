package programmers.level3;

import java.util.LinkedList;
import java.util.Queue;

public class Num87694 {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int[][] map;
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        map = new int[101][101];

        //도형그리기
        for (int i = 0; i < rectangle.length; i++) {
            for (int x = rectangle[i][0] * 2; x <= rectangle[i][2] * 2; x++) {
                for (int y = rectangle[i][1] * 2; y <= rectangle[i][3] * 2; y++) {
                    if (map[x][y] == 2) {
                        continue;
                    }
                    map[x][y] = 2;
                    if (x == rectangle[i][0] * 2 || x == rectangle[i][2] * 2 ||
                            y == rectangle[i][1] * 2 || y == rectangle[i][3] * 2) {
                        map[x][y] = 1;
                    }
                }
            }
        }
        return bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2);
    }

    private int bfs(int startX, int startY, int endX, int endY) {
        int[][] visited = new int[101][101];
        Queue<int[]> q = new LinkedList<>();
        visited[startX][startY] = 1;
        q.add(new int[]{startX, startY});
        int answer = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx < 0 || ny < 0 || nx > 100 || ny > 100) {
                    continue;
                }
                if (visited[nx][ny] == 0 && map[nx][ny] == 1) {
                    visited[nx][ny] = visited[now[0]][now[1]] + 1;
                    q.add(new int[]{nx, ny});
                }
                if (nx == endX && ny == endY) {
                    answer = Math.min(answer, visited[endX][endY]);
                }
            }
        }
        return answer / 2;
    }
}
