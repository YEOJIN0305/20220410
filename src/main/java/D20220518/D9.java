package D20220518;

public class D9 {
    public static void main(String[] args) {
        String str = " 한글 ABCD efg ";

        System.out.println("원 문자열 ==> [" +str +"]");
        System.out.println("대문자로 ==> [" +str.toUpperCase() +"]");
        System.out.println("소문자로 ==> [" +str.toLowerCase() +"]");
        System.out.println("공백제거 ==> [" +str.trim() +"]");
        System.out.println("전체공백제거 ==> [" +str.replaceAll(" ", "") +"]");

    }
}
