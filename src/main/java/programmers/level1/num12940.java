package programmers.level1;

public class num12940 {
    public int[] solution(int n, int m) {

        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        int[] result = {gcd, lcm};
        return result;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}
