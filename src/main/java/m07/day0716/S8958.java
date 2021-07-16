package m07.day0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        //String ox + ox.length() == br.readLine().getBytes()
        //즉 for(char ch : br.readLine().getBytes()) 간단하게 사용할수있다
        for (int i = 0; i < 1; i++) {
            String ox = br.readLine();
            int c = 0;
            int result = 0;
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j)=='O'){
                    c++;
                    result += c;
                }else{
                    c =0;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
