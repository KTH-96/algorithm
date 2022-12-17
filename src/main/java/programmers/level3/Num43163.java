package programmers.level3;

import java.util.Arrays;

public class Num43163 {
    boolean[] visited;
    int answer = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }

    private void dfs(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            answer = Math.min(count, answer);
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && checkChange(words[i], begin)) {
                visited[i] = true;
                dfs(words[i], target, words, count + 1);
                visited[i] = false;
            }
        }
    }

    private boolean checkChange(String word, String begin) {
        int alphaCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != begin.charAt(i)) {
                alphaCount++;
            }
        }
        return alphaCount == 1;
    }
}
