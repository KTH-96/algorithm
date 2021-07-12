package day0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if(min >= 45){
            System.out.println(hour+" "+(min-45));
        }else if(min < 45){
            if (hour == 0){
                System.out.println(23+" "+(60-(45-min)));
            }else {
                System.out.println((hour - 1) + " " + (60 - (45 - min)));
            }
        }
    // 수식으로 풀고 결과는 최대한 가독성 좋게
    //        if(M < 45) {
    //			H--;
    //			M = 60 - (45 - M);
    //			if(H < 0) {
    //				H = 23;
    //			}
    //			System.out.println(H + " " + M);
    //		}
    //		else {
    //			System.out.println(H + " " + (M - 45));
    //		}

    }
}
