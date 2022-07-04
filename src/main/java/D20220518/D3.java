package D20220518;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D3 {
    public static void main (String[] args){
        List<String> list = new ArrayList<>();

        list.add("김지태");
        list.add("김다운");
        list.add("김연");
        list.add("김성현");

        int listsize = list.size();

        //기존 for문
        for(int i = 0; i<listsize; i++){
            System.out.println("이름 : "+ list.get(i));
        }

        //foreach
        for(String name : list){
            System.out.println("이름 : " + name);
        }

        //람다식
        list.forEach(name -> System.out.println("name : "+name));

        //Iterator
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
