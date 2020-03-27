package java;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstValue = scanner.next();
        String secondValue = scanner.next();

        if (firstValue.length() > secondValue.length()) {
            System.out.println("первая строка длиннее");
        } else if (secondValue.length() > firstValue.length()) {
            System.out.println("вторая строка длиннее");
        } else {
            System.out.println("строки равны по длине");
        }
    }
}
