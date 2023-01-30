package programmers.level2;

import static java.util.Arrays.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Num12978 {
    public static void main(String[] args) {
        Num12978 a = new Num12978();
        System.out.println(a.solution(5, new int[][]{
                {1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}
        }, 3));
    }

    public int solution(int N, int[][] road, int K) {
        Map<Integer, List<Node>> graph = new HashMap<>();
        for (int[] node : road) {
            graph.putIfAbsent(node[0], new ArrayList<>());
            graph.putIfAbsent(node[1], new ArrayList<>());
            graph.get(node[0]).add(new Node(node[1], node[2]));
            graph.get(node[1]).add(new Node(node[0], node[2]));
        }
        return answer(1, graph, K);
    }

    private int answer(int start, Map<Integer, List<Node>> graph, int k) {
        int[] dist = new int[graph.size() + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));

        dist[start] = 0;
        q.offer(new Node(start, 0));
        while (!q.isEmpty()) {
            Node now = q.poll();

            if (dist[now.node] < now.weight) {
                continue;
            }

            if (graph.containsKey(now.node)) {
                for (Node next : graph.get(now.node)) {
                    if (dist[next.node] > dist[now.node] + next.weight) {
                        dist[next.node] = dist[now.node] + next.weight;
                        q.offer(new Node(next.node, dist[next.node]));
                    }
                }
            }
        }
        return (int) stream(dist).filter(d -> d <= k).count();
    }

    public class Node {
        int node;
        int weight;

        public Node(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

}
