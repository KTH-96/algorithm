package programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class num12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }

    @Test
    void 정답() {
        int[][] arr1 = {{2, 3, 2},
                        {4, 2, 4},
                        {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3},
                        {2, 4, 1},
                        {3, 1, 1}};
        //arr1 행 arr2 열
        int[][] answer = {{22, 22, 11},
                          {36, 28, 18},
                          {29, 20, 14}};
        int[][] solution = solution(arr1, arr2);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                assertEquals(answer[i][j], solution[i][j]);
            }
        }
    }
}
