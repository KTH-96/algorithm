package leetcode;

public class Lc167 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int[] answer = new int[2];
        while (index1 < index2) {
            if (numbers[index1] + numbers[index2] > target) {
                index2--;
            } else if (numbers[index1] + numbers[index2] < target) {
                index1++;
            } else if (numbers[index1] + numbers[index2] == target) {
                answer[0] = index1 + 1;
                answer[1] = index2 + 1;
                return answer;
            }
        }
        return answer;
    }
}
