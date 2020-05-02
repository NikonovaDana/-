import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println ("Треугольник 1:");
        Triangle T1 = new Triangle(1,2,1) ;
        System.out.println (T1.toStringLength());
        System.out.println (T1.toStringS());
        System.out.println (T1.toStringP());

        System.out.println ("Треугольник 2:");
        Triangle T2 = new Triangle(3,2,4) ;
        System.out.println (T2.toStringLength());
        System.out.println (T2.toStringS());
        System.out.println (T2.toStringP());

        System.out.println ("Прямоугольник 1:");
        Rectangle R1 = new Rectangle (1,-2) ;
        System.out.println (R1.toStringLength());
        System.out.println (R1.toStringS());
        System.out.println (R1.toStringP());

        System.out.println ("Прямоугольник 2:");
        Rectangle R2 = new Rectangle(3,2) ;
        System.out.println (R2.toStringLength());
        System.out.println (R2.toStringS());
        System.out.println (R2.toStringP());

        System.out.println ("Ввод массива");
        Array A1 = new Array (4);
        A1.InputArr();
        A1.ShowArr ();
        A1.SortArr ();
        A1.ShowArr ();
    }
}
