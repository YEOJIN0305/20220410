package Codeup;

import java.util.Scanner;

public class C1084 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        int k = s.nextInt();

        int r, g, b;
        int c = 0;

        for(r=0; r<i; r++){
            for(g=0; g<j; g++){
                for(b=0; b<k; b++){
                    System.out.printf("%d %d %d\n", r, g, b);
                    c++;
                }
            }
        }
        System.out.printf("%d", c);
    }
}
