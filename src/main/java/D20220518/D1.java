package D20220518;

import java.util.HashMap;
import java.util.Map;

public class D1 {
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();

        map.put("name", "최여진");
        map.put("email", "2220110026@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        System.out.println("name : "+ map.get("name"));
    }
}
