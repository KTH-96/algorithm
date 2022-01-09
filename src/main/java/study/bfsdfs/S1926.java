package study.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int[][] board = new int[row][column];
        boolean[][] visit = new boolean[row][column];
        Queue<Pair> qu = new LinkedList<>();

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < board.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 0 || visit[i][j] == true) {
                    continue;
                }
                count++;
                qu.add(new Pair(i, j));
                visit[i][j] = true;
                area = 0;
                while (!qu.isEmpty()) {
                    Pair p = qu.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nextX = p.x + dx[k];
                        int nextY = p.y + dy[k];
                        if (nextX < 0 || nextY < 0 || nextX >= row || nextY >= column) {
                            continue;
                        }
                        if (board[nextX][nextY] == 1 && !visit[nextX][nextY]) {
                            qu.add(new Pair(nextX, nextY));
                            visit[nextX][nextY] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }

            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
