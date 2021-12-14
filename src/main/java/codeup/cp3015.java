package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cp3015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int studentNum = Integer.parseInt(st.nextToken());
        int nameScore = Integer.parseInt(st.nextToken());

        Pair[] pair = new Pair[studentNum];

        for (int i = 0; i < studentNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            Pair status = new Pair();
            status.name = st.nextToken();
            status.score = Integer.parseInt(st.nextToken());

            pair[i] = status;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = pair.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (pair[j].score < pair[j + 1].score) {
                    Pair pre = pair[j];
                    pair[j] = pair[j + 1];
                    pair[j + 1] = pre;
                }
            }
        }
        for (int i = 0; i < nameScore; i++) {
            sb.append(pair[i].name).append("\n");
        }

        System.out.println(sb);
    }

    private static class Pair {
        private String name;
        private int score;
    }
}
