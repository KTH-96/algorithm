package programmers.level1;

public class num12934 {
    public long solution(long n) {
        long answer = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n == (i*i)){
                answer = (i + 1) * (i + 1);
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}
