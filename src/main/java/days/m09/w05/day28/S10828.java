package days.m09.w05.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class S10828 {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }

        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;// size칸에 item을 넣고 size를 1증가
        size++;
    }

    public static int pop() {
        // 데이터가 한 개도 없을 경우 -1
        if(size == 0) {
            return -1;
        }
        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;// 요소 개수를 반환
    }

    public static int empty() {
        // 스택이 비어있으면 1 반환
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top() {
        // 데이터가 한 개도 없을 경우 -1
        if(size == 0) {
            return -1;
        }
        // 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
        else {
            return stack[size - 1];
        }
    }

}