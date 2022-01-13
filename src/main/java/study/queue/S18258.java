package study.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    list.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer poll = list.poll();
                    if (poll == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(poll).append("\n");
                    }
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if (list.isEmpty()) {
                        sb.append(1).append("\n");
                    }else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    Integer peek = list.peek();
                    if (peek == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(peek).append("\n");
                    }
                    break;
                case "back":
                    Integer last = list.peekLast();
                    if (last == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(last).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
