package programmers.level1;

public class num77884 {
    public static void main(String[] args) {
        int solution = solution(1, 5);
        System.out.println(solution);
    }
    public static int solution(int left, int right) {
        /** 다른사람의 풀이 접근 방식은 동일 했으나 훨씬 좋은 코드
         * int answer = 0;
         *
         *         for (int i=left;i<=right;i++) {
         *             //제곱수인 경우 약수의 개수가 홀수
         *             if (i % Math.sqrt(i) == 0) {
         *                 answer -= i;
         *             }
         *             //제곱수가 아닌 경우 약수의 개수가 짝수
         *             else {
         *                 answer += i;
         *             }
         *         }
         *
         *         return answer;
         */
        //어떤수의 1보다크고 제곱수보다 작은수 중에 나누어서 0이되는 수가 있다면 짝수
        //제곱수와 가장 가까운 자연수와 나눈값이 정확히 1이면 홀수 -> 이것만
        int length = right - left + 1;
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left;
            left++;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            double sqrt = Math.sqrt(nums[i]);
            result += nums[i];
//            System.out.println(result);
            if (sqrt == 1) {
                result -= 2;
            }else {
                for (int j = 1; j <= sqrt; j++) {
                    if (j / sqrt == 1) {
                        result -= (nums[i] * 2);
                    }
                }
            }

        }
        return result;
    }
}
