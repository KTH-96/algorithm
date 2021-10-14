package programmers.level1;

public class num12977 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(result(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    static boolean result(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
