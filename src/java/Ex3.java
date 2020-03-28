package java;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = scanner.nextLine();
        int number = Integer.parseInt(bin, 2);
        System.out.println(number);
    }
}
