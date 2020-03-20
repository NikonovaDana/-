import java.io.*;
import java.util.Scanner;

class Singer implements Serializable {
    String name;
    int rate, kolv;
}

public class Var9Ser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner (System.in, "cp1251");

        File f = new File ("E:\\MyFileVar9Ser.txt");
        f.createNewFile ( );

        FileOutputStream fos = new FileOutputStream (f);
        ObjectOutputStream oos = new ObjectOutputStream (fos);

        System.out.println ("Введите количество певцов");
        int k = sc.nextInt ( );
        sc.nextLine ( );


        System.out.println ("Введите информацию о певце: ");
        for (int i = 0; i < k; i++) {

            Singer sing = new Singer ( );

            System.out.print ("Введите имя певца => ");
            sing.name = sc.nextLine ( );

            System.out.print ("Введите рейтинг => ");
            sing.rate = sc.nextInt ( );

            System.out.print ("Введите кол-во выпущенных альбомов => ");
            sing.kolv = sc.nextInt ( );
            oos.writeObject (sing);
            sc.nextLine ( );

        }

        oos.flush ( );
        oos.close ( );
        fos.close ( );
        sc.close ( );

        FileInputStream fis = new FileInputStream (f);
        ObjectInputStream oin = new ObjectInputStream (fis);
        Singer singer;
        for (int i = 0; i < k; i++) {
            singer = (Singer) oin.readObject ( );
            System.out.println (" Имя певца " + singer.name);
            System.out.println (" Рейтинг " + singer.rate);
            System.out.println (" Кол-во выпущенных альбомов " + singer.kolv);
        }
        oin.close ( );
        fis.close ( );

        File f2 = new File ("E:\\MyFileVar9SerOut.txt");
        if (f2.exists ( )) f2.delete ( );
        f2.createNewFile ( );

        FileOutputStream fos2 = new FileOutputStream (f2);
        ObjectOutputStream oos2 = new ObjectOutputStream (fos2);
        FileInputStream fis2 = new FileInputStream (f);
        ObjectInputStream oin2 = new ObjectInputStream (fis2);
        System.out.println ("Певцы с количеством выпущенных альбомов больше 10");
        for (int i = 0; i < k; i++) {
            singer = (Singer) oin2.readObject ( );
            if (singer.kolv > 10) {
                oos2.writeObject (singer);
                System.out.println (" Имя певца " + singer.name);
                System.out.println (" Рейтинг " + singer.rate);
                System.out.println (" Кол-во выпущенных альбомов " + singer.kolv);
            }

        }

        oin2.close ( );
        fis2.close ();
        oos2.flush ();
        oos2.close ( );
        fos2.close ();


    }
}
