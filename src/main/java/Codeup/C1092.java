package Codeup;

import java.util.Scanner;

public class C1092 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();


        int day=1;

        while(day>0){
            day++;

            if ((day%a==0)&&(day%b==0)&&(day%c==0)){
                System.out.printf("%d", day);
                break;
            }
        }
    }
}
