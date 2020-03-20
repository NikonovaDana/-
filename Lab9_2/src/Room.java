import java.util.ArrayList;//нужно для работы с классом ArrayList

public class Room {
    private ArrayList<furniture> masFur = new ArrayList<furniture>();//массив с мебелью

    public void addFur(furniture m){//метод для добавления мебели в комнату
        masFur.add(m);              //добавляет элемент m
    }

    public void removeFur(furniture m){//метод для удаления мебели из комнаты
        masFur.remove(m);              //удаляет элемент m
    }

    public Room(){ // конструктор
    }

    public Boolean findFur(furniture m){ //для выяснения – есть ли мебель m в комнате
        return masFur.contains(m);
    }

    public Room(ArrayList< furniture> n){//конструктор для внесения существующего списка мебели в комнату
        masFur=n;
    }

    public void printRoom() { //для вывода на экран списка мебели в комнате
        System.out.println("В комнате: ");
        for (furniture a:masFur){                 //цикл для массива masFur
            System.out.println("\t"+a.toString());//вывод для текущего эл-та masFur
            if (a instanceof Cupboard) {
                System.out.println("    Это шкаф");
                System.out.println();
            }
            if (a instanceof Table) {
                System.out.println("    Это стол");
                System.out.println();
            }
        }
    }
}