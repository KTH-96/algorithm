package barkingdog.queue_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Num10845 {
    private static List<Integer> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] split = br.readLine().split(" ");
            if (split.length == 2) {
                list.add(Integer.parseInt(split[1]));
            } else {
                String str = split[0];
                switch (str) {
                    case "pop":
                        if (list.isEmpty()) {
                            sb.append(-1).append('\n');
                            break;
                        }
                        sb.append(list.get(0)).append('\n');
                        list.remove(0);
                        break;
                    case "size":
                        sb.append(list.size()).append('\n');
                        break;
                    case "empty":
                        if (list.isEmpty()) {
                            sb.append(1).append('\n');
                            break;
                        }
                        sb.append(0).append('\n');
                        break;
                    case "front":
                        if (list.isEmpty()) {
                            sb.append(-1).append('\n');
                            break;
                        }
                        sb.append(list.get(0)).append('\n');
                        break;
                    case "back":
                        if (list.isEmpty()) {
                            sb.append(-1).append('\n');
                            break;
                        }
                        sb.append(list.get(list.size() - 1)).append('\n');
                        break;
                }
            }
        }
        System.out.println(sb);
    }
}
