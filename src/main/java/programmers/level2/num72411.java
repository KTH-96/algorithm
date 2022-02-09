package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num72411 {
    private static List<String> combination;
    public String[] solution(String[] orders, int[] course) {
        String[] answer;
        combination = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            char[] orders_char = orders[i].toCharArray();
            Arrays.sort(orders_char);

            for (int j = 0; j < orders_char.length; j++) {
                for (int k = 0; k < course.length; k++) {
                    dfs(orders_char, j, 1, course[k], String.valueOf(orders_char[j]));
                }
            }
        }
    }

    private void dfs(char[] arr, int idx, int length, int course, String str) {
        햣
    }
}
