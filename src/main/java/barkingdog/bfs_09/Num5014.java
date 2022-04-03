package barkingdog.bfs_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num5014 {
    //F, S, G, U, D
    //총 F층, 강호 S층, 스타트링크 G층, U 위층, D 아래층
    static int F, S, G, U, D;
    static int[] dist = new int[1000002];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Arrays.fill(dist, -1);
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        dist[S] = 0;
        q.offer(S);
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : new int[]{cur + U, cur - D}){
                if (next > F || next <= 0 || dist[next] != -1){
                    continue;
                }
                dist[next] = dist[cur] + 1;
                q.offer(next);
            }
        }
        if (dist[G] == -1){
            System.out.println("use the stairs");
        } else {
            System.out.println(dist[G]);
        }
    }
}
