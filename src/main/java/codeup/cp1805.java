package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class cp1805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseNum = Integer.parseInt(br.readLine());
        Map<Integer, String> map = new HashMap<>();
        StringTokenizer st;
        for (int i = 0; i < testCaseNum; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        for (int i = 1; i <= 100; i++) {
            if (map.get(i) == null) continue;
            System.out.println(i + " " + map.get(i));
        }
    }
}
