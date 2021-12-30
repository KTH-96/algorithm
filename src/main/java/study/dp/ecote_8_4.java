package study.dp;

public class ecote_8_4 {
    public static void main(String[] args) {
        //bottomUp 방식
        long[] arr = new long[100];

        arr[1] = 1;
        arr[2] = 1;

        int n = 50; //50번째 피보나치
        long startTime = System.currentTimeMillis();
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        long endTime = System.currentTimeMillis();
        System.out.println(arr[n]);
        System.out.println(endTime - startTime+"ms");
    }
}
