import java.util.Scanner;

public class Ex7 {

    private static final int x = 5;
    private static final int y = 6;
    private static final int z = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number == x || number == y || number == z){
            System.out.println("Данное значение имеется в константах");
        }else {
            System.out.println("Такой константы нет!");
        }
    }
}
