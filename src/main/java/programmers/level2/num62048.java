package programmers.level2;

import java.math.BigInteger;

public class num62048 {
    public static void main(String[] args) {
        num62048 main = new num62048();
        long solution = main.solution(8, 11);
        System.out.println(solution);
    }
    public long solution(int w, int h) {
        if (w == h) {
            return (long)((w * h) - w);
        }
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        long W = (long) w;
        long H = (long) h;
        long GCD = (long) gcd;
        return (W * H) - ((W / GCD + H / GCD) - 1) * GCD;
    }
}
