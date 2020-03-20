import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in, "cp1251");

        System.out.print("Введите первое число: ");
        int a = sc.nextInt ( );
        sc.nextLine ( );

        System.out.print("Введите второе число: ");
        int b = sc.nextInt ( );
        sc.nextLine ( );

        boolean c = false;

        if ( (a + b >= 10) && (a + b <= 20)) {
            c = true;
        }

        System.out.println(" 10 <= a + b <= 20: " + c);
    }
}
