package barkingdog.stack_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long count = 0;
        int temp;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            while(!stack.isEmpty() && stack.peek() <= temp) {
                stack.pop();
            }
            stack.push(temp);
            count += stack.size() - 1;
        }
        System.out.println(count);
    }
}
