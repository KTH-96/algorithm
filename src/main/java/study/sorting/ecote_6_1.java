package study.sorting;

import java.util.Random;

public class ecote_6_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        for (int i = 0; i < arr.length; i++) {
            int minNum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minNum] > arr[j]) {
                    minNum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minNum];
            arr[minNum] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
