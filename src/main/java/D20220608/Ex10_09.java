package D20220608;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09 {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);//ecu-kr

        int ch;

        while ( (ch = fis.read()) != -1)
            System.out.println((char) ch);

        fis.close();
    }
}
