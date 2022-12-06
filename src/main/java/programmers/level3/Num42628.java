package programmers.level3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Num42628 {
    public static int[] solution(String[] operations) {
        PriorityQueue<Integer> maxp = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minp = new PriorityQueue<>();
        for (String operation : operations) {
            StringTokenizer st = new StringTokenizer(operation, " ");
            String command = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            System.out.println("value : " + value);
            if (command.equals("I")) {
                maxp.offer(value);
                minp.offer(value);
                continue;
            }
            if (command.equals("D")) {
                if (value == -1) {
                    if (minp.isEmpty()) {
                        continue;
                    }
                    Integer min = minp.poll();
                    System.out.println("최소 삭제 : " + min);
                    maxp.remove(min);
                } else {
                    if (maxp.isEmpty()) {
                        continue;
                    }
                    Integer max = maxp.poll();
                    System.out.println("최대 삭제 : " + max);
                    minp.remove(max);
                }
            }
        }
        int[] answer = {0, 0};
        if (maxp.size() > 0) {
            answer[0] = maxp.poll();
        }
        if (minp.size() > 0) {
            answer[1] = minp.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        solution(operations);
    }
}
