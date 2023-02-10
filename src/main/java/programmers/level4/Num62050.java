package programmers.level4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Num62050 {
    public static void main(String[] args) {
        Num62050 aa = new Num62050();
        aa.solution(new int[][]{{1, 4, 8, 10}, {5, 5, 5, 5}, {10, 10, 10, 10}, {10, 10, 10, 20}}, 3);
    }
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int[][] colorMap;
    private static int colorCount = 0;
    private static ArrayList<Edge> edges;
    private static int[] roots;
    public int solution(int[][] land, int height) {
        colorMap = new int[land.length][land[0].length];
        edges = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land.length; j++) {
                if (colorMap[i][j] == 0) {
                    colorCount++;
                    coloring(land, height, i, j, colorCount);
                }
            }
        }

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land.length; j++) {
                findWay(land, i, j);
            }
        }
        Collections.sort(edges);

        return Mst(colorCount);
    }

    private int Mst(int colorCount) {
        roots = new int[colorCount + 1];
        int answer = 0;
        for (int i = 0; i < roots.length; i++) {
            roots[i] = i;
        }
        int c = 0;
        for (Edge edge : edges) {
            if (findRoot(edge.sE) != findRoot(edge.bE)) {
                answer += edge.cost;
                union(edge.sE, edge.bE);
            }
        }
        return answer;
    }

    private void union(int sE, int bE) {
        int seP = findRoot(sE);
        int beP = findRoot(bE);
        if (seP < beP) {
            roots[beP] = seP;
        } else {
            roots[seP] = beP;
        }
    }

    private int findRoot(int n) {
        if (n == roots[n]) {
            return n;
        }
        return roots[n] = findRoot(roots[n]);
    }

    private void findWay(int[][] land, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx == land.length || ny == land.length) {
                continue;
            }
            if (colorMap[x][y] != colorMap[nx][ny]) {
                edges.add(new Edge(colorMap[x][y], colorMap[nx][ny],
                        Math.abs(land[nx][ny] - land[x][y])));
            }
        }
    }

    private void coloring(int[][] land, int height, int x, int y, int color) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        colorMap[x][y] = color;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int cx = poll[0];
            int cy = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + cx;
                int ny = dy[i] + cy;
                if (nx < 0 || ny < 0 || nx == land.length || ny == land.length) {
                    continue;
                }

                if (colorMap[nx][ny] > 0) {
                    continue;
                }

                if (Math.abs(land[nx][ny] - land[cx][cy]) > height) {
                    continue;
                }
                colorMap[nx][ny] = color;
                q.add(new int[]{nx, ny});
            }
        }
    }

    private static class Edge implements Comparable<Edge>{
        int sE;
        int bE;
        int cost;

        public Edge(int sE, int bE, int cost) {
            this.sE = Math.min(sE, bE);
            this.bE = Math.max(sE, bE);
            this.cost = cost;
        }


        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
