package programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class num12909 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.charAt(0) == ')'){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else {
                try {
                    stack.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    @Test
    void 정답() {
        String s = "()()";
        String s1 = ")()(";
        Assertions.assertEquals(true, solution(s));
        Assertions.assertEquals(false, solution(s1));
    }
}
