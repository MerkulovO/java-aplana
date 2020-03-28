package java;

import java.util.Scanner;

public class FinalEx1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String str = scanner.nextLine();
        int sum = 0, a;
        int number;
        for (int i = 0; i < str.length(); i++) {
            number = str.charAt(str.length() - 1 - i);

            if(number == '1' || number == '0') {
                if (number == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a * Math.pow(2, i));
        }

        System.out.println(sum);
    }
}
