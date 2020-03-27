import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int averageInt = (x+y+z)/3;
        int expectedInt = averageInt/2;

        if(expectedInt > 3){
            System.out.println("Программа выполнена корректно" );
        } else {
            System.out.println("результат меньше 3");
        }
    }
}
