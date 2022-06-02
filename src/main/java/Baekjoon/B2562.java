package Baekjoon;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int max = 0;
        int[] arr = new int[9];
        int len = 0;


        for (int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();

            if (max<arr[i]){
                max = arr[i];
                len = i;
            }

        }
        System.out.println(max);
        System.out.println(len+1);

    }
}
