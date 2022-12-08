package programmers.level2;

public class Num42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = yellow + brown;
        for (int i = 3; i <= sum; i++) {
            int j = sum / i;
            if (j < 3 && sum % i != 0) {
                continue;
            }
            int l = Math.max(i, j);
            int h = Math.min(i, j);
            if ((l - 2) * (h - 2) == yellow) {
                answer[0] = l;
                answer[1] = h;
                return answer;
            }
        }
        return answer;
    }
}
