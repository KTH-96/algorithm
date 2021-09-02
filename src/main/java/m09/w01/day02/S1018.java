package m09.w01.day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1018 {

    static boolean[][] arr;
    static int min = 64;//?

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
        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);

    }
    static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {

                // 올바른 색이 아닐경우 count 1 증가
                if (arr[i][j] != TF) {
                    count++;
                }

                TF = (!TF);
            }

            TF = !TF;
        }

        /*
         *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
         *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
         *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
         */
        count = Math.min(count, 64 - count);

        /*
         * 이전까지의 경우 중 최솟값보다 현재 count 값이
         * 더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, count);
    }
}
