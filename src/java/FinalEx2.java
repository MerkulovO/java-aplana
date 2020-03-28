package java;

import java.util.Arrays;
import java.util.Scanner;

public class FinalEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        for (int i = 0;i < arraySize; i++){
            System.out.println("Введите число: ");
            arr[i] = scanner.nextInt();
            System.out.println("Число добавлено в массив");
        }
        for (int j = 1; j < arraySize; j++) {
            int newElement = arr[j];
            int number = j - 1;
            while (number >= 0 && arr[number] > newElement) {
                arr[number + 1] = arr[number];
                number--;
            }
            arr[number + 1] = newElement;
        }
        System.out.println("Результат отсортированного массива :\n"+ Arrays.toString(arr));
    }
}

