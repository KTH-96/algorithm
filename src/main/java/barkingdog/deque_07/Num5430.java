package barkingdog.deque_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Num5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String[] commands = br.readLine().split("");
            int size = Integer.parseInt(br.readLine());
            String numbers = br.readLine();
            String substring = numbers.substring(1, numbers.length() - 1);
            String[] split = substring.split(",");
            for (int j = 0; j < size; j++) {
                deque.addLast(Integer.parseInt(split[j]));
            }

            for (int j = 0; j < commands.length; j++) {
            }
        }
    }
}
