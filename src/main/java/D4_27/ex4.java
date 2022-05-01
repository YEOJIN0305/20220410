package D4_27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("최여진");
        list.add("고길동");
        list.add("입꺽정");
        list.add("고길동");

        int listSize = list.size();

        for(int i =0; i< listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }

        for (String name : list) {
            System.out.println("이름 : " + name);

            Iterator<String> it = list.iterator();

            while (it.hasNext()) {
                String name = it.next();
                System.out.println("이름 : " + name);
            }
        }
    }
}
