package study.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S1021 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int wantNum = Integer.parseInt(st.nextToken());

        int count = 0;
        int[] arr = new int[wantNum];
        for (int i = 1; i <= num; i++) {
            deque.offer(i);
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < wantNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < wantNum; i++) {
            int target = deque.indexOf(arr[i]);
            int half;
            if (deque.size() % 2 == 0) {
                half = deque.size() / 2 - 1;
            }else {
                half = deque.size() / 2;
            }

            if (target <= half) {
                for (int j = 0; j < target; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }else {
                for (int j = 0; j < deque.size() - target; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
