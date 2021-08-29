package m08.w05.day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());//카드 장수
        int M = Integer.parseInt(st.nextToken());//N장수의 합이 M보다 작거나 같아야 함

        int[] cardNum = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cardNum.length; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        //cardNum = {5, 6, 7, 8, 9} N=5 M=21
        //M에 최대한 가까운 3장의 합 구하기
        int result = bfs(cardNum, N, M);
        System.out.println(result);
    }

    private static int bfs(int[] cardNum, int n, int m) {
        int result = 0;
        for (int i = 0; i < n-2; i++) {
            if (cardNum[i] > m) continue;//이 부분은 블로그 발췌 백트랭킹에서 배운다고함
            for (int j = i + 1; j < n-1; j++) {
                if(cardNum[i] + cardNum[j] > m) continue;
                for (int k = j+1; k < n; k++) {
                    int sum = cardNum[i] + cardNum[j] + cardNum[k];
                    if (m == sum) {
                        return sum;
                    }
                    if (sum < m && result < sum) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
