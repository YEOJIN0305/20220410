package Codeup;

import java.util.Scanner;

public class C1081 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int i = 6;

        for(int a=1; a<=n; a++){
            for(int b=1; b<=m; b++){
                System.out.printf("%d %d\n", a, b);
            }
        }
    }
}
