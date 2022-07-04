package D20220518;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        //일반적인 for문
        for(int i = 0; i<listSize; i++){
            System.out.println("이름 : " + list.get((i)));
        }

        //foreach
        for (String name : list){
            System.out.println("이름 : "+name);
        }

        //람다식
        list.forEach(name -> System.out.println("name : "+name));

        //Iterator
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
