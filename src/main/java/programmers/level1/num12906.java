package programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;


public class num12906 {
    public int[] solution(int []arr) {
        int pre = 10;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (pre == arr[i]) {
                continue;
            }
            pre = arr[i];
            list.add(arr[i]);
        }
        Integer[] intList = list.toArray(new Integer[list.size()]);
        int[] result = Arrays.stream(intList).mapToInt((i) -> i.intValue()).toArray();
        return result;
    }
    /**
     *         LinkedList<Integer> list = new LinkedList<Integer>();
     *         list.add(arr[0]);
     *         for(int i=1; i<arr.length;i++){
     *             if(arr[i]!=list.getLast()){
     *                 list.add(arr[i]);
     *             }
     *
     *         }
     *         Integer[] listing = list.toArray(new Integer[list.size()]);
     *         int []answer =Arrays.stream(listing).mapToInt(Integer::intValue).toArray();
     *         return answer;
     */
}
