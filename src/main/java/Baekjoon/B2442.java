package Baekjoon;

import java.util.Scanner;

public class B2442 {//별찍기 피라미드

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int star = 1;
        int none = a - 1;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < star + none; j++) {
                if (j < none) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            none--;
            star += 2;
        }

    }
}