package programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;

public class num12916 {
    public static void main(String[] args) {
        boolean tf = solution("asdfweqresafd");
        System.out.println(tf);
    }
    static boolean solution(String s) {
        s = s.toLowerCase();
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        int count = 0;
        for (char c : arr) {
            if (c == 'p') count++;
            if (c == 'y') count--;
            System.out.println(count);
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}
