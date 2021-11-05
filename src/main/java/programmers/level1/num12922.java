package programmers.level1;

public class num12922 {
    public String solution(int n) {
        int repeat = n/2;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= repeat; i++) {
            sb.append("수박");
        }
        if (n % 2 == 1) {
            sb.append("수");
        }
        return sb.toString();
    }
}
