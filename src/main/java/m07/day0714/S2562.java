package m07.day0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class S2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max){
                max = num;
                index = i+1;
            }
        }
        System.out.println(max+"\n"+index);

//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[9];
//        int sMax=0;
//        for (int i = 0; i < 9; i++) {
//            arr[i] = sc.nextInt();
//            int sNum = arr[i];
//            if (sMax < sNum) {
//                sMax = sNum;
//            }
//        }
//        int c =0;
//        for (int i = 0; i < 9; i++) {
//            c++;
//            if (arr[i] == sMax){
//                break;
//            }
//        }
//        System.out.println(sMax);
//        System.out.println(c);

//List<Integer> list = Arrays.asList(in.nextInt(), in.nextInt(), in.nextInt(),
//					in.nextInt(), in.nextInt(), in.nextInt(),
//					in.nextInt(), in.nextInt(), in.nextInt());
//
//		in.close();
//
//		int val = Collections.max(list); ->list 메소드인 Collections 사용
//		int idx = list.indexOf(val) + 1;
//
//		System.out.println(val);
//		System.out.println(idx);

    }
}
