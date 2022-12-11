package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num84512 {
    char[] arr = {'A', 'E', 'I', 'O', 'U'};
    List<String> list = new ArrayList<>();
    public int solution(String word) {
        int answer = 0;
        bfs(0, "");
        Collections.sort(list);
        return list.indexOf(word) + 1;
    }

    private void bfs(int i, String s) {
        if (i >= 5) {
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            list.add(s + arr[j]);
            bfs(i + 1, s + arr[j]);
        }
    }
}
