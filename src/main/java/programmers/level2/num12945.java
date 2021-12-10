package programmers.level2;

public class num12945 {
    public static void main(String[] args) {
        num12945 main = new num12945();
        int solution = main.solution(5);
        System.out.println(solution);
    }
    public int solution(int n) {
        if (n < 2) return 1;
        int answer = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            answer = (a + b) % 1234567;
            a = b;
            b = answer;
        }
        return answer;
    }

}
