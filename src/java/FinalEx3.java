package java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalEx3 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double dollarCourse = scanner.nextDouble();
        System.out.println("Введите сумму рублей для обмена: ");
        double rubSumm = scanner.nextDouble();
        double finalCountMoney = rubSumm / dollarCourse;
        System.out.println(df.format(finalCountMoney));

    }
}
