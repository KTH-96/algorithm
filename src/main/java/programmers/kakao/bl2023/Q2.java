package programmers.kakao.bl2023;

public class Q2 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        int d = 0;
        int p = 0;
        long answer = 0L;

        for (int i = n - 1; i >= 0; i--) {
            if (deliveries[i] != 0 || pickups[i] != 0) {
                int cnt = 0;
                while (d < deliveries[i] || p < pickups[i]) {
                    cnt++;
                    d += cap;
                    p += cap;
                }
                System.out.println(d + " " + p + " " + cnt);
                d -= deliveries[i];
                p -= pickups[i];
                answer += (i + 1) * cnt * 2;
            }
        }

        return answer;
    }
}
