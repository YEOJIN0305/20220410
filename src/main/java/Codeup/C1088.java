package Codeup;

import java.util.Scanner;

public class C1088 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int b=1; b<=a; b++){
            if(b%3==0) {
                System.out.print("");
            } else{
                System.out.printf("%d ", b);
            }
        }
    }
}
