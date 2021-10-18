package programmers.level1;

public class num77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0){
                zero++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }
        int max = count + zero;
        int min = count;

        int[] result = {Math.min(7-max,6),Math.min(7-min,6)};
        return result;
    }
}
