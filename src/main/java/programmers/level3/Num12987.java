package programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num12987 {
    public static void main(String[] args) {
        Num12987 aa = new Num12987();
        System.out.println(aa.solution(new int[]{1,2,2,2}, new int[]{1,1,1,1}));
    }
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;
        int aP = A.length - 1;
        int bP = B.length - 1;
        while (aP >= 0) {
            System.out.println("aP = " + aP + ", A[aP] = " + A[aP]);
            System.out.println("bP = " + bP + ", B[aP] = " + B[bP]);
            if (A[aP] < B[bP]) {
                result++;
                aP--;
                bP--;
            } else {
                aP--;
            }
        }

        return result;
    }
}
