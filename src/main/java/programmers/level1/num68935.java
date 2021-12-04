package programmers.level1;

public class num68935 {
    public static void main(String[] args) {
        num68935 ma = new num68935();
        int solution = ma.solution(45);
        System.out.println(solution);
    }
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(n % 3);
            n /= 3;
            if (n == 0) {
                break;
            }
        }
        String threeReverseNum = String.valueOf(sb);
        return Integer.parseInt(threeReverseNum, 3);
    }
}
