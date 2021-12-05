package programmers.level2;

import java.util.Arrays;
import java.util.Collections;


public class num12941 {
    public static void main(String[] args) {
        num12941 ma = new num12941();
        int[] a = {1, 2};
        int[] b = {1,2, 3, 4};
        ma.solution(a, b);
    }
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Integer[] b = new Integer[B.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = B[i];
        }
        Arrays.sort(b, Collections.reverseOrder());
        for (Integer integer : b) {
            System.out.println(integer);
        }
        int sum = 0;
        if (A.length % 2 == 0) {
            for (int i = 0; i < A.length; i++) {
                sum += (A[i] * b[i]);
                System.out.println(A[i] +" "+ b[i] + " = " + sum);
            }
            return sum;
        }else {
            for (int i = 0; i < A.length; i++) {
                sum += (A[i] * b[i]);
                System.out.println(A[i] +" "+ b[i] + " = " + sum);
            }
            return sum;
        }
    }
}
