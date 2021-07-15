package m07.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] arr = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double M =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            if (arr[i] > M) M = arr[i];
        }

        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (arr[i]/M) *100;
        }
        System.out.println(result/3);
//배열없이
//for (int i = 0; i < N; i++) {
//			int value = Integer.parseInt(st.nextToken());
//
//			if(value > max) {
//				max = value;
//			}
//
//			sum+=value;
//		}
// System.out.println( ((sum/max)*100.0)/N );


    }
}
