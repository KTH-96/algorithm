package programmers.level4;

public class Num49995 {
    public static void main(String[] args) {
        Num49995 aa = new Num49995();
        System.out.println(aa.solution(new int[]{3, 7, 2, 4, 5}));
    }
    public int solution(int[] cookie) {
        int answer = 0;
        for (int i = 0; i < cookie.length - 1; i++) {
            int left = i;
            int right = i + 1;
            int leftSum = cookie[i];
            int rightSum = cookie[i + 1];
            while (true) {
                try {
                    if (leftSum == rightSum) {
                        answer = Math.max(answer, rightSum);
                        leftSum += cookie[--left];
                        rightSum += cookie[++right];
                    } else if (leftSum > rightSum) {
                        rightSum += cookie[++right];
                    } else {
                        leftSum += cookie[--left];
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        return answer;
    }
}
