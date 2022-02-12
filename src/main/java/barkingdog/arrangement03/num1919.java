package barkingdog.arrangement03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr1[(str1.charAt(i) - 97)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[(str2.charAt(i) - 97)]++;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0 && arr2[i] != 0) {
                sum += (Math.min(arr1[i], arr2[i]) * 2);
            }
        }
        int total = str1.length() + str2.length() - sum;
        System.out.println(total);
    }
}
