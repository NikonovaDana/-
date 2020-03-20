import java.util.ArrayList;//нужно для работы с классом ArrayList

public class GarageCar {
    private ArrayList<Auto> masCar=new ArrayList<Auto>();//массив с машинами

    public void addCar(Auto m){//метод для добавления машины в гараж
        masCar.add(m);//добавляет элемент m
    }

    public void removeCar(Auto m){//метод для удаления машины из гаража
        masCar.remove(m);//удаляет элемент m
    }

    public GarageCar (){ // конструктор или переменная
    }

    public Boolean findCar(Auto m){ //для выяснения – есть ли машина m в гараже
        return masCar.contains(m);
    }

    public GarageCar(ArrayList< Auto> n){//конструктор для внесения существующего списка машин в гараж
        masCar=n;
    }

    public void printGarage() { //для вывода на экран списка машин в гараже
        System.out.println("В гараже: ");
        for (Auto a:masCar){ //цикл для массива masCar
            System.out.println("\t"+a.toString());//вывод для текущего эл-та masCar
            if (a instanceof Car) {
                System.out.println("    Это легковая машина");
                System.out.println();
            }
            if (a instanceof Truck) {
                System.out.println("    Это грузовая машина");
                System.out.println();
            }
        }
    }
}