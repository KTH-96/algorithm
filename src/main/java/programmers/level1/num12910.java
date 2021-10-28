package programmers.level1;

import java.util.LinkedList;

public class num12910 {
    public int[] solution(int[] arr, int divisor) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(i -> i).sorted().toArray();
    }
}
