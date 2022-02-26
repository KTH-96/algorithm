package barkingdog.stack_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<int[]> tower = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());
            while (!tower.isEmpty()) {
                // 이전 탑의 높이가 현재 높이보다 크면 여기에 수신하므로 이전 탑의 높이 출력
                if (tower.peek()[0] >= height) {
                    sb.append(tower.peek()[1]).append(" ");
                    break;
                }
                // 이전 탑의 높이가 현재 높이보다 작으면 필요 없으므로 pop
                tower.pop();
            }
            if (tower.isEmpty()) {
                sb.append("0 ");
            }
            tower.push(new int[]{height, i});
        }
        System.out.println(sb);
    }
}
