package m07.day0730;


import java.util.Scanner;

public class S3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x1 = {sc.nextInt(), sc.nextInt()};
        int[] x2 = {sc.nextInt(), sc.nextInt()};
        int[] x3 = {sc.nextInt(), sc.nextInt()};
        int x;
        int y;
        if (x1[0] == x2[0]) {
            x = x3[0];
        } else if (x1[0] == x3[0]){
            x = x2[0];
        } else {
            x = x1[0];
        }

        if (x1[1] == x2[1]) {
            y = x3[1];
        } else if (x1[1] == x3[1]){
            y = x2[1];
        } else {
            y = x1[1];
        }

        System.out.println(x+" "+y);
    }
}
