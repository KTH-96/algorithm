package leetcode;

import java.util.*;


public class Lc743 {
    public static void main(String[] args) {
        Lc743 k = new Lc743();
        k.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2);
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<Node>> map = new HashMap<>();
        for (int[] time : times) {
            map.putIfAbsent(time[0], new ArrayList<>());
            map.get(time[0]).add(new Node(time[1], time[2]));
        }

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.time));
        queue.offer(new Node(k, 0));
        boolean[] visited = new boolean[n + 1];

        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            if (visited[curNode.node]) {
                continue;
            }
            visited[curNode.node] = true;
            n--;
            if (n == 0) {
                return curNode.time;
            }
            if (map.containsKey(curNode.node)) {
                for (Node nxNode : map.get(curNode.node)) {
                    queue.offer(new Node(nxNode.node, curNode.time + nxNode.time));
                }
            }
        }
        return -1;
    }
    static class Node {
        int node;
        int time;

        public Node(int node, int length) {
            this.node = node;
            this.time = length;
        }
    }
}


