package D20220608;

public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];

        try {
            aa[2] = 100 / 0;
            aa[3] = 100;

        } catch (Exception e) {//Exception은 항상 캐치 마지막
            System.out.println("난 모든 에러를 다 잡아요");
            System.out.println("에러 메세지 : " + e);

        } finally {
            System.out.println("이 부분은 무조건 나와요");
        }
    }
}
