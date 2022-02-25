package barkingdog.arrangement_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNums = br.readLine();

        int[] arr = new int[10];

        String[] roomNum = roomNums.split("");
        for (int i = 0; i < roomNum.length; i++) {
            arr[Integer.parseInt(roomNum[i])]++;
        }

        int sixOrNine = (arr[6] + arr[9]);
        if (sixOrNine % 2 == 0) {
            sixOrNine /= 2;
        } else {
            sixOrNine = sixOrNine / 2 + 1;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 6 || i == 9) {
                continue;
            } else {
                max = Math.max(max, arr[i]);
            }
        }
        max = Math.max(max, sixOrNine);
        System.out.println(max);
    }
}
