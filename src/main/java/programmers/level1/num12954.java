package programmers.level1;

public class num12954 {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        long star = x;
        for (int i = 0; i < n; i++) {
            arr[i] = star * (i+1);
        }
        return arr;
    }
}
