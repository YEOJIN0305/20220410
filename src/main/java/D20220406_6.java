public class D20220406_6 {
    public static void main(String[] args) {//5팩토리얼 계산
        int a = 1;

        for(int b=5; b>0; b--){
            a*=b;
            System.out.println("중간 계산 값 : "+ a);
        }

        System.out.println("5! 값은 "+ a);
    }
}
