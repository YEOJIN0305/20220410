package Codeup;

import java.util.Scanner;

public class C1083 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int b=1; b<=a; b++){
            if(b%3==0){
                System.out.printf("X ");
            }
            else
                System.out.printf("%d ", b);
        }
    }
}
