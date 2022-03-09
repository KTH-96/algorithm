package barkingdog.stack_use_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Character> s = new Stack<>();

        System.out.println(result(chars, s));
    }

    private static int result(char[] chars, Stack<Character> s) {
        int sum = 0;
        int num = 1;

        for (char ch : chars) {
            if (ch == '(') {
                num *= 2;
                s.push(ch);
            } else if (ch == '[') {
                num *= 3;
                s.push(ch);
            } else if (ch == ')') {
                if (s.isEmpty() || s.peek() != '(') {
                    return 0;
                }
                if (s.peek() == '(') {
                    sum += num;
                    s.pop();
                    num /= 2;
                }
            } else {
                if (s.isEmpty() || s.peek() != '[') {
                    return 0;
                }
                if (s.peek() == '[') {
                    sum += num;
                    s.pop();
                    num /= 3;
                }
            }
        }
        if (s.isEmpty()) {
            return sum;
        } else {
            return 0;
        }
    }
}
