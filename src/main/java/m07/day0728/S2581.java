import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static boolean arr[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        arr = new boolean[n + 1];	// 배열 생성
        arr[0] = true;
        arr[1] = true;

        for(int i = 2; i <= Math.sqrt(arr.length); i++) {
            if(arr[i]) continue;
            for(int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }



        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = M; i <= n; i++) {
            if(arr[i] == false) {
                sum += i;
                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

}