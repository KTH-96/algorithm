package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Num42584 {
    public int[] solution(int[] prices) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        System.out.println("시작");
        for (int i = prices.length - 2; i >= 0; i--) {
            int time = 0;
            int preQ = q.size();
            for (int j = i + 1; j < prices.length; j++) {
                time++;
                System.out.println("시간 : " + time);
                if (prices[j] < prices[i]) {
                    System.out.println("떨어진 숫자 넣기");
                    q.add(time);
                    break;
                }
            }
            if (preQ == q.size()) {
                System.out.println("안떨어지는 숫자 넣기");
                q.add(q.size());
            }
        }
        int[] answer = new int[q.size()];
        System.out.println(q.toString());
        for (int i = q.size() - 1; i >= 0; i--) {
            answer[i] = q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Num42584 a = new Num42584();
        a.solution(new int[]{1, 2, 3, 2, 3});
    }
}
