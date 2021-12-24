package programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class num12913 {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][1], Math.max(land[i - 1][0], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][0]));
        }
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = Math.max(result, land[land.length - 1][i]);
        }
        return result;
    }

    @Test
    void 정답() {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        Assertions.assertEquals(16, solution(land));

    }
}
