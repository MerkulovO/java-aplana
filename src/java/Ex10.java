import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы : ");
        int matrixSize = scanner.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(10);
            }
        }
        System.out.println(Arrays.toString(matrix[0]));
        for (int k = 0; k < matrix[0].length; k++) {
            matrix[0][k] = matrix[0][k] * 3;

        }
        System.out.println(Arrays.toString(matrix[0]));

    }
}
