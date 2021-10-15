package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class num42840 {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {25, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (arr1[i%5] == answers[i]) count[0]++;
            if (arr1[i%8] == answers[i]) count[1]++;
            if (arr1[i%10] == answers[i]) count[2]++;
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if(count[i] == max){
                results.add(i);
            }
        }
        answers = new int[results.size()];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = results.get(i);
        }

        return answers;
    }
}
