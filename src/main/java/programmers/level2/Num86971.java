package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Num86971 {
    List<Integer>[] map;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        map = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            map[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            map[wire[0]].add(wire[1]);
            map[wire[1]].add(wire[0]);
        }

        for (int[] wire : wires) {
            int n1Node = bfs(wire[0], wire[1], n);
            int n2Node = bfs(wire[1], wire[0], n);

            answer = Math.min(answer, Math.abs(n1Node - n2Node));
        }
        return answer;
    }

    private int bfs(int node1, int node2, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];
        visit[node1] = true;
        queue.add(node1);
        int nodeCount = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            nodeCount++;
            for (int nextNode : map[node]) {
                if (nextNode != node2 && !visit[nextNode]) {
                    queue.add(nextNode);
                    visit[nextNode] = true;
                }
            }
        }
        return nodeCount;
    }

}
