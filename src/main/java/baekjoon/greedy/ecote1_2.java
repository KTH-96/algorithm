package baekjoon.greedy;

public class ecote1_2 {
    public static void main(String[] args) {
        int solution = solution("02984");
        System.out.println(solution);
    }

    public static int solution(String s) {
        int firstNum = s.charAt(0) - '0';

        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num <= 1 || firstNum <= 1) {
                firstNum += num;
            }else {
                firstNum *= num;
            }
        }
        return firstNum;
    }
}
