package programmers.level1;

public class num12921 {
    public int solution(int n) {
        //1부터 n 까지 소수
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * i; j <= n; j += i) {
                arr[j] = true;
            }
        }
        int result = 0;
        arr[0] = true;
        arr[1] = true;
        for (boolean b : arr) {
            if (!b) {
                result++;
            }
        }
        return result;
    }
}
