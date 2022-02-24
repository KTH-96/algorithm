package barkingdog.linked_list_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Num5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            List<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                switch(c) {
                    case '<' :
                        if(iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case '>' :
                        if(iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case '-' :
                        if(iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default :
                        iter.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(char s : list) {
                sb.append(s);
            }
            System.out.println(sb);
        }
    }
}
