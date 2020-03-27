import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива : ");
        int arraySize = scanner.nextInt();
        int[] arrayNumbers = new int[arraySize];

        for (int i = 0 ; i < arrayNumbers.length; i++){
            System.out.println("Введите число :");
            arrayNumbers[i] = scanner.nextInt();
            System.out.println("Число добавлено в массив :" + (i+1) +"/" +arraySize);
        }
        System.out.println("Вывести массив на экран? да/нет");
        String response = scanner.next().toLowerCase().trim();
        if (response.equals("да")){
            for (int arrayNumber : arrayNumbers) {
                System.out.println(arrayNumber*2);
            }
        } else {
            System.out.println("Программа завершена");
        }


    }
}
