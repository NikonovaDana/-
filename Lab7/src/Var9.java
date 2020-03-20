import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Var9 {
    public static void main(String[] args) throws IOException {
        File f1 = new File ("Singers.txt");
        if (f1.exists ( )) f1.delete ( );
        f1.createNewFile ( );
        RandomAccessFile rf = new RandomAccessFile (f1, "rw");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Введите количество певцов");
        int k = sc.nextInt ( );
        sc.nextLine ( );
        String name;
        int rate, kolv;
        rf.seek (0);
        for (int i = 0; i < k; i++) {
            System.out.println ("Enter name");
            name = sc.next ( );
            rf.writeUTF (name);
            for (int j = 0; j < 20 - name.length ( ); j++)
                rf.writeByte (1);
            System.out.println ("Enter rating");
            rate = sc.nextInt ( );
            rf.writeInt (rate);
            System.out.println ("Enter kol");
            kolv = sc.nextInt ( );
            rf.writeInt (kolv);
        }
        System.out.println (rf.length ( ));
        rf.seek (0);
        System.out.println ("Информация о певцах");
        System.out.println ("Имя \t\t Рейтинг \t\t Кол-во выпущенных альбомов");
        for (int i = 0; i < k; i++) {
            name = rf.readUTF ( );
            for (int j = 0; j < 20 - name.length ( ); j++)
                rf.readByte ( );
            rate = rf.readInt ( );
            kolv = rf.readInt ( );
            System.out.println (name + " " + rate + " " + kolv);
        }
        File f2 = new File ("SingersOut.txt");
        if (f2.exists ( )) f2.delete ( );
        f2.createNewFile ( );
        RandomAccessFile rf2 = new RandomAccessFile (f2, "rw");
        rf.seek (0);
        rf2.seek (0);
        String namew;
        int ratew, kolvw;

        int kk = 0;
        for (int i = 0; i < k; i++) {
            namew = rf.readUTF ( );
            for (int j = 0; j < 20 - namew.length ( ); j++)
                rf.readByte ( );
            ratew = rf.readInt ( );
            kolvw = rf.readInt ( );
            if (kolvw > 10) {
                kk++;
                rf2.writeUTF (namew);
                for (int j = 0; j < 20 - namew.length ( ); j++)
                    rf2.writeByte (1);
                rf2.writeInt (ratew);
                rf2.writeInt (kolvw);

            }
        }
        rf.close ( );
        System.out.println ("Певцы с количеством выпущенных альбомов больше 10");
        rf2.seek (0);
        for (int i = 0; i < kk; i++) {
            namew = rf2.readUTF ( );
            for (int j = 0; j < 20 - namew.length ( ); j++)
                rf2.readByte ( );
            ratew = rf2.readInt ( );
            kolvw = rf2.readInt ( );
            System.out.println (namew + " " + ratew + " " + kolvw);
        }
        rf2.close ( );
    }
}
