package programmers.level1;

import java.util.Arrays;

public class num12912 {
    public long solution(int a, int b) {
        if(a == b) return a;
        long sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        }else{
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
