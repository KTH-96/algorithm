package baekjoon.greedy;

import java.util.Scanner;

public class S5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payBackMoney = 1000 - sc.nextInt();
        int count = 0;
        int[] arr = {500, 100, 50, 10, 5, 1};
        for (int i = 0; i < 6; i++) {
            int coinType = arr[i];
            count += payBackMoney / coinType;
            payBackMoney %= coinType;
        }
        System.out.println(count);
    }
}
