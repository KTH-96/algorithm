package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Lc787 {
    public static void main(String[] args) {
        Lc787 a = new Lc787();
        int cheapestPrice = a.findCheapestPrice(13,
                new int[][]{{11,12,74},
                        {1,8,91},
        {4,6,13},
        {7,6,39},
        {5,12,8},
        {0,12,54},
        {8,4,32},
        {0,11,4},
        {4,0,91},
        {11,7,64},
        {6,3,88},
        {8,5,80},
        {11,10,91},
        {10,0,60},
        {8,7,92},
        {12,6,78},
        {6,2,8},
        {4,3,54},
        {3,11,76},
        {3,12,23},
        {11,6,79},
        {6,12,36},
        {2,11,100},
        {2,5,49},
        {7,0,17},
        {5,8,95},
        {3,9,98},
        {8,10,61},
        {2,12,38},
        {5,7,58},
        {9,4,37},
        {8,6,79},
        {9,0,1},
        {2,3,12},
        {7,10,7},
        {12,10,52},
        {7,2,68},
        {12,2,100},
        {6,9,53},
        {7,4,90},
        {0,5,43},
        {11,2,52},
        {11,8,50},
        {12,4,38},
        {7,9,94},
        {2,7,38},
        {3,7,88},
        {9,12,20},
        {12,0,26},
        {10,5,38},
        {12,8,50},
        {0,2,77},
        {11,0,13},
        {9,10,76},
        {2,6,67},
        {5,6,34},
        {9,7,62},
        {5,3,67}
        },
                10, 1, 10);
        System.out.println(cheapestPrice);
    }
    //src 시작 dst 도착 k 경유지 갯수
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<Node>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(new Node(flight[1], flight[2], 0));
        }

        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.wt));
        q.offer(new Node(src, 0, -1));
        int[] stop = new int[n + 1];
        Arrays.fill(stop, Integer.MAX_VALUE);

        while (!q.isEmpty()) {
            Node poll = q.poll();
            if (poll.dist > k || stop[poll.v] < poll.dist) {
                continue;
            }
            stop[poll.v] = poll.dist;
            if (poll.v == dst) {
                return poll.wt;
            }

            if (graph.containsKey(poll.v)) {
                for (Node nxNode : graph.get(poll.v)) {
                    q.offer(new Node(nxNode.v, poll.wt + nxNode.wt, poll.dist + 1));
                }
            }
        }

        return -1;
    }
    static class Node {
        private int v;
        private int wt;
        private int dist;

        public Node(int v, int wt, int dist) {
            this.v = v;
            this.wt = wt;
            this.dist = dist;
        }
    }
}

