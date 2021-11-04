package programmers.level2;

public class num12899 {
    public static void main(String[] args) {
        String solution = solution(10);
        System.out.println(solution);
    }
    public static String solution(int n) {
        String[] arr = {"4", "1", "2"};
        String answer = "";
        int namerge = 0;
        while (n > 0) {
            namerge = n % 3;
            n /= 3;
            if (namerge == 0) {
                n--;
            }
            answer = arr[namerge] + answer;
        }

        return answer;
    }
}
