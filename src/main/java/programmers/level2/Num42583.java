package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Num42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int time = 0;
        for (int truck_weight : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.add(truck_weight);
                    sum += truck_weight;
                    time++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if (sum + truck_weight <= weight) {
                        q.add(truck_weight);
                        sum += truck_weight;
                        time++;
                        break;
                    } else {
                        q.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}
