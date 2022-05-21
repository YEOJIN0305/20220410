package Baekjoon;

import java.util.Scanner;

public class B2443 {//피라미드 반대

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int none = 0;
        int star = 2 * a - 1;

        for (int i = 0; i < a; i++) {
            for (int j = star+none; j > 0; j--) {
                if (j <= star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            none++;
            star -= 2;
            System.out.println();
        }
    }
}