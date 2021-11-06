package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num12935 {
    public static void main(String[] args) {
        num12935 a = new num12935();
        int[] result = {4, 3, 2, 1};
        int[] solution = a.solution(result);


    }
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int min = clone[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
