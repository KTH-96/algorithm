package barkingdog.deque_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Num5430 {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            String command = br.readLine();
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            for (int j = 0; j < size; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            start(command, deque);
        }
        System.out.println(sb);
    }

    private static void start(String command, Deque<Integer> deque) {
        boolean isFrontOrBack = true;
        for (char ch : command.toCharArray()) {
            if (ch == 'R') {
                isFrontOrBack = !isFrontOrBack;
                continue;
            }

            if (deque.isEmpty()) {
                sb.append("error").append('\n');
                return;
            }
            if (isFrontOrBack) {
                deque.removeFirst();
            } else {
                deque.removeLast();
            }
        }

        sb.append("[");
        if (!deque.isEmpty()) {
            if (isFrontOrBack) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollLast());
                }
            }
        }
        sb.append("]").append("\n");
    }
}
