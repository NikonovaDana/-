import java.util.Scanner; //подключаем класс для ввода данных с клавиатуры в консоли
public class test {
    public static void main(String[] args) {
        Auto myAuto1=new Auto(); //создаем объект типа нашего класса

        Scanner in = new Scanner(System.in); //создаем сканер для ввода данных из консоли

        System.out.print("Введите фирму: ");
        String nazv=in.next(); //считываем название из консоли !!!только 1 слово
                               //т.к. in.next() считывает только символы до пробела, остальные символы отправляет
                               //следующему оператору, связанному с консольным вводом
        myAuto1.setFirm(nazv); //задаем значение для параметра нашего класса

        System.out.print("Введите максимальную скорость: ");
        int s=in.nextInt();//вводим максимальную скорость
        myAuto1.setMaxSpeed(s);

        System.out.print("Введите госю номер: ");
        String n=in.next();//вводим максимальную скорость
        myAuto1.setGosNum(n);

        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed());// вывод инфо для Auto


        Car myCar1=new Car("Ford", 200, "A111AA","Mustang",2,false);

        Car myCar2=new Car();

        System.out.print("Введите фирму-производитель легкового авто: ");
        nazv=in.next();
        myCar2.setFirm(nazv);

        System.out.print("Введите максимальную скорость легкового авто: ");
        s=in.nextInt();
        myCar2.setMaxSpeed(s);

        System.out.print("Введите гос. номер легкового авто: ");
        n=in.next();
        myCar2.setGosNum(n);

        System.out.print("Введите модель легкового авто: ");
        nazv=in.next();
        myCar2.setModel(nazv);

        System.out.print("Введите кол-во дверей легкового авто: ");
        s=in.nextInt();
        myCar2.setNumDoors(s);


        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean f=in.nextBoolean();
        myCar2.setFullTime(f);
        System.out.println();

        System.out.println("Первый легковой автомобиль: "+myCar1.toString());
        System.out.println("Второй легковой автомобиль: "+myCar2.toString());

        Truck myTruck=new Truck();

        myTruck.setAllInfo();

        System.out.println(myTruck.toString());
    }
}