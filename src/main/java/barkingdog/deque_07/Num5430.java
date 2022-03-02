package barkingdog.deque_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Num5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            String command = br.readLine();
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            for (int j = 0; j < size; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean ft = true;
            boolean error = false;
            for (char ch : command.toCharArray()) {
                if (ch == 'R') {
                    ft = !ft;
                    continue;
                }
                if (deque.isEmpty()) {
                    error = !error;
                    break;
                }
                if (ft) {
                    deque.removeFirst();
                }else {
                    deque.removeLast();
                }
            }
            if (!error) {
                if (ft) {
                    sb.append("[").append(deque.pollFirst());
                    while (!deque.isEmpty()) {
                        sb.append(",").append(deque.pollFirst());
                    }
                    sb.append("]").append('\n');
                }else {
                    sb.append("[").append(deque.pollLast());
                    while (!deque.isEmpty()) {
                        sb.append(",").append(deque.pollLast());
                    }
                    sb.append("]").append('\n');
                }
            }else {
                sb.append("error").append('\n');
            }
        }
        System.out.println(sb);
    }
}
