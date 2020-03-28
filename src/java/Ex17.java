package java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/java/writefile.txt"));
        System.out.println("Программа записи начата, для остановки программы введите слово  'stop' ");
        while (true) {
            String value = scanner.next();
            if (value.equals("stop")) {
                writer.flush();
                writer.close();
                System.out.println("программа завершена");
                break;
            } else {
                writer.write(value + "\n");
            }

        }

    }
}
