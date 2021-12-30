package days.m10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4949 {
    static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while (true) {
            str = br.readLine();
            if (str.equals(".")) {
                break;
            }

            sb.append(find(str)).append('\n');
        }
        System.out.println(sb);
    }

    static String find(String str) {
        stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '['){
                stack.push(ch);
            } else if (ch == ')') {
                //비거나 안맞을경우
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }else {
                    stack.pop();
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()){
            return "yes";
        }else {
            return "no";
        }

    }
}
