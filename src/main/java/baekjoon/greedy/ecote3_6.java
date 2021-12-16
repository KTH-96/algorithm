package baekjoon.greedy;

public class ecote3_6 {
    public static void main(String[] args) {
        int i = endOne(25, 5);
        System.out.println(i);
    }

    private static int endOne(int n, int k) {
        int count = 0;
        while (true) {
            if (n % k == 0) {
                n /= k;
                count++;
            } else {
                n -= 1;
                count++;
            }
            if (n == 1) {
                break;
            }
        }
        return count;

    }
}
