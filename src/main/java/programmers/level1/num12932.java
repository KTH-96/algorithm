package programmers.level1;

public class num12932 {
    public int[] solution(long n) {
        String str = String.valueOf(n);

        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();

        String[] split = sb.toString().split("");

        int[] answer = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            answer[i] = Integer.parseInt(split[i]);
        }
        return answer;
    }
}
