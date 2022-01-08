package programmers.level2;

public class num43165 {
    static int count;

    public static void main(String[] args) {
        num43165 main = new num43165();
        int[] numbers = {1, 1, 1, 1, 1};
        main.solution(numbers, 3);

    }
    public int solution(int[] numbers, int target) {
        if (numbers.length == 0) return 0;
        if (numbers.length == 1) return 1;
        dfs(numbers, 0, 0, target);
        return count;
    }

    private void dfs(int[] numbers, int dept, int sum, int target) {
        if (dept == numbers.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        sum += numbers[dept];
        dfs(numbers, dept + 1, sum, target);
        sum -= numbers[dept];
        sum += (-1 * numbers[dept]);
        dfs(numbers, dept + 1, sum, target);
    }
}
