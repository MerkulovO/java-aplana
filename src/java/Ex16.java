package java;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex16 {

    public static void main(String[] args) {
        StringBuilder textValue = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/java/somefile.txt"));
            String line = reader.readLine();
            while( line != null){
                    textValue.append(line).append("\t");
                    line = reader.readLine();
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(textValue);
    }

}
