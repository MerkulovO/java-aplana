package java;

import java.io.*;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lineCounter = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/java/ex18.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                lineCounter++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/java/ex18.txt"));
        System.out.println("Введите значение");
        int i = 0;
        while (i < lineCounter) {
            String value = scanner.next();
            writer.write(value + "\n");
            System.out.println("значение записано");
        }
        writer.flush();
        writer.close();
        System.out.println("программа завершена");
    }
}
