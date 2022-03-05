package barkingdog.stack_use_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < num; i++) {
            Stack<String> stack = new Stack<>();
            String[] split = br.readLine().split("");
            stack.push(split[0]);
            for (int j = 1; j < split.length; j++) {
                if (stack.isEmpty()){
                    stack.push(split[j]);
                }else {
                    if (stack.peek().equals(split[j])) {
                        stack.pop();
                        continue;
                    } else {
                        stack.push(split[j]);
                    }
                }
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
