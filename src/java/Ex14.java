package java;

import java.util.Scanner;

public class Ex14 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringValue = scanner.next();
        int x = Integer.parseInt(stringValue);
        double y = x;

        System.out.println(stringValue);
        System.out.println(x);
        System.out.println(y);

    }
}
