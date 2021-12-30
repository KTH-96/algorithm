package days.m10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1018 {
    //https://st-lab.tistory.com/101?category=855026 참고
    static boolean[][] arr;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }

        int n = N - 7; //체스판이 들어갈수 있는 숫자
        int m = M - 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                check(i, j);
            }
        }
        System.out.println(min);//가장 적게 봐꿔서 체스판을 만들수 있는 수
    }

    static void check(int i, int j) {
        int x = i + 8;
        int y = j + 8;
        int count = 0;

        boolean TF = arr[i][j];//첫번째 0,0 의 색 f = B : t = W

        for (int k = i; k < x; k++) {
            for (int l = j; l < y; l++) {
                if (arr[k][l] != TF) {
                    count++;
                }
                TF = !TF;//다음칸은 무조건 앞칸이랑 색이 달라야 함
            }
            TF = !TF;//바로 밑에 칸도 무조건 위칸이랑 색이 달라야함
        }
        count = Math.min(count, 64 - count);

        min = Math.min(min,count); //위에 for문 안에서 가장 작은수 고르기
    }
}
