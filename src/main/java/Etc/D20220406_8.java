package Etc;

import java.util.Scanner;

public class D20220406_8 {
    public static void main(String[] args) {//시작값이 끝보다 큰 수가 들어오면, "시작값이 끝수보다 큽니다." for문 출력 안되게

        Scanner s = new Scanner(System.in);
        int hap = 0;
        int i;
        int num1, num2, num3;

        System.out.printf("시작값 입력 : ");
        num1 = s.nextInt();
        System.out.printf("끝값 입력 : ");
        num2 = s.nextInt();
        System.out.printf("증가값 입력 : ");
        num3 = s.nextInt();

        if(num1>num2){
            System.out.printf("시작값이 끝수보다 큽니다.");
        } else {for(i = num1; i<= num2; i+=num3) {
            hap += i;
            System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합: %d \n", num1, num2, num3, hap);
            }
        }
    }
}
