package study.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ecote_5_10 {
    public int solution(int x, int y, int[][] board) {
        int result = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (dfs(i, j , board)) {
                    result += 1;
                }
            }
        }
        return result;
    }

    private boolean dfs(int x, int y, int[][] board) {
        if (x <= -1 || x >= 4 || y <= -1 || y >= 5) {
            return false;
        }
        if (board[x][y] == 0) {
            board[x][y] = 1;

            dfs(x - 1, y, board);
            dfs(x + 1, y, board);
            dfs(x, y - 1, board);
            dfs(x, y + 1, board);
            return true;
        }
        return false;
    }

    @Test
    void 정답() {
        int x = 4;
        int y = 5;
        int[][] board = {{0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};
        Assertions.assertEquals(3, solution(x,y,board));
    }
}
