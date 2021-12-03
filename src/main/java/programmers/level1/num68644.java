package programmers.level1;

import java.util.*;

public class num68644 {
    public static void main(String[] args) {
        num68644 main = new num68644();
        int[] arr = {2,1,3,4,1};
        int[] solution = main.solution(arr);
        for (int i : solution) {
            System.out.println(i);
        }
    }
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int a = numbers[i] + numbers[j];
                if (list.indexOf(a) < 0) {
                    list.add(a);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
