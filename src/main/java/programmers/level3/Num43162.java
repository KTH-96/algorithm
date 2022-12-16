package programmers.level3;

public class Num43162 {
    public int solution(int n, int[][] computers) {
        int network = 0;
        boolean[] visit = new boolean[n];
        for (int i = 0; i < computers.length; i++) {
            if (!visit[i]) {
                network++;
                dfs(computers, i, visit);
            }
        }
        return network;
    }

    private void dfs(int[][] computers, int index, boolean[] visit) {
        visit[index] = true;

        for (int i = 0; i < computers[0].length; i++) {
            if (!visit[i] && computers[index][i] == 1) {
                dfs(computers, i, visit);
            }
        }
    }
}
