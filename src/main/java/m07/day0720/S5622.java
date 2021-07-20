package m07.day0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class S5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "WA";
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            int init = 2;
            if(s.charAt(i) - 65 <= 2 && s.charAt(i) - 65 >= 0) sum += init + 1;
            if(s.charAt(i) - 65 <= 5 && s.charAt(i) - 65 > 2) sum += init + 2;
            if(s.charAt(i) - 65 <= 8 && s.charAt(i) - 65 > 5) sum += init + 3;
            if(s.charAt(i) - 65 <= 11 && s.charAt(i) - 65 > 8) sum += init + 4;
            if(s.charAt(i) - 65 <= 14 && s.charAt(i) - 65 > 11) sum += init + 5;
            if(s.charAt(i) - 65 <= 18 && s.charAt(i) - 65 > 14) sum += init + 6;
            if(s.charAt(i) - 65 <= 21 && s.charAt(i) - 65 > 18) sum += init + 7;
            if(s.charAt(i) - 65 <= 25 && s.charAt(i) - 65 > 21) sum += init + 8;

        }
        System.out.println(sum);

//        for(int i = 0 ; i < k ; i++) {
//
//			switch(s.charAt(i)) {
//			case 'A' : case 'B': case 'C' :
//				count += 3;
//				break;
//
//			case 'D' : case 'E': case 'F' :
//				count += 4;
//				break;
//
//			case 'G' : case 'H': case 'I' :
//				count += 5;
//				break;
//
//			case 'J' : case 'K': case 'L' :
//				count += 6;
//				break;
//
//			case 'M' : case 'N': case 'O' :
//				count += 7;
//				break;
//
//			case 'P' : case 'Q': case 'R' : case 'S' :
//				count += 8;
//				break;
//
//			case 'T' : case 'U': case 'V' :
//				count += 9;
//				break;
//
//			case 'W' : case 'X': case 'Y' : case 'Z' :
//				count += 10;
//				break;
//			}
//		}
    }
}
