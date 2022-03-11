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
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                num *= 2;
                s.push(chars[i]);
            } else if (chars[i] == '[') {
                num *= 3;
                s.push(chars[i]);
            } else if (chars[i] == ')') {
                if (s.isEmpty() || s.peek() != '(') {
                    return 0;
                }
                if (chars[i - 1] == '(') {
                    sum += num;
                }
                s.pop();
                num /= 2;
            } else {
                if (s.isEmpty() || s.peek() != '[') {
                    return 0;
                }
                if (chars[i - 1] == '[') {
                    sum += num;
                }
                s.pop();
                num /= 3;
            }
        }
        if (s.isEmpty()) {
            return sum;
        } else {
            return 0;
        }
    }
}
