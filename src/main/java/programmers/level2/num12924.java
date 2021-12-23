package programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class num12924 {
    public int solution(int n) {
        int count = 1;
        int num = n;
        if (n % 2 == 1){
            num = n / 2 + 1;
        }else {
            num = n / 2;
        }
        for (int i = 1; i <= num; i++) {
            int startNum = 0;
            for (int j = i; j <= num; j++) {
                startNum += j;
                if (startNum == n) {
                    count++;
                    break;
                } else if (startNum > n) {
                    break;
                }
            }
        }
        return count;
    }

    @Test
    void 정답() {
        assertEquals(4, solution(15));
    }
}
