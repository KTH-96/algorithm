package programmers.level2;

public class Num87946 {
    static int max = 0;
    static boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return max;
    }

    private void dfs(int dept, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(dept++, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        max = Math.max(max, dept);
    }
}
