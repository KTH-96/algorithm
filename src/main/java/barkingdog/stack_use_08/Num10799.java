package barkingdog.stack_use_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> stack = new Stack<>();
        String[] split = br.readLine().split("");

        int count = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")) {
                stack.push(split[i]);
            }else {
                if (split[i - 1].equals("(")) {
                    stack.pop();
                    count += stack.size();
                }else {
                    stack.pop();
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
