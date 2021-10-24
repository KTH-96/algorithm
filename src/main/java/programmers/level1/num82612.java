package programmers.level1;

public class num82612 {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (price * i);
        }
        if (money > sum) {
            return 0;
        }
        return sum - money;
    }
}
