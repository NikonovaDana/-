import java.util.Scanner;
public class Truck extends Auto{
    private String model; //модель машины
    private int power;//мощность
    private Boolean trailer; //c прицепом или без

    public Truck(){// конструктор Truck без параметров
        super();// вызываем конструктор класса-родителя без параметров
        model="";//модель не указана
        power=0;//мощность ноль
        trailer=false;//без прицепа
    }

    public Truck(String firma, int speed, String num, String name, int n, Boolean f){// конструктор Truck с параметров
        super(firma,speed,num);// вызываем конструктор класса-родителя с параметрами
        model=name;
        power=n;
        trailer=f;
    }

    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }

    public void setPower(int n){
        power=n;
    }
    public int getPower(){
        return power;
    }

    public void setTrailer(Boolean b){
        trailer=b;
    }
    public Boolean isTrailer(){
        return trailer;
    }

    public void setAllInfo(){//ввод всей информации для Truck

        Scanner in = new Scanner(System.in);

        System.out.print("Введите фирму-производитель грузового авто: ");
        String nazv=in.next(); //метод next() позволяет вводить строки, но без пробелов
        setFirm(nazv);

        System.out.print("Введите максимальную скорость грузового авто: ");
        int s=in.nextInt(); //Ввод MaxSpeed
        setMaxSpeed(s);


        System.out.print("Введите гос. номер грузового авто: ");
        String n=in.next(); //Ввод гос. номера
        setGosNum(n);

        System.out.print("Введите модель грузового авто: ");
        model=in.next();

        System.out.print("Введите мощность грузового авто: ");
        power=in.nextInt();

        System.out.print("Введите признак прицепа грузового авто (true/false): ");
        trailer=in.nextBoolean();

        System.out.println();//пустая строка
    }

    public String toString(){
        return "\n\tГрузовик"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Максимальная скорость: "
                +getMaxSpeed()+ "\n\t"+"Гос. номер: "+getGosNum()+"\n\t"+"Модель: "+model+"\n\t"+"Мощность: "+power+"\n\t"+"Признак прицепа: "
                +trailer+"\n";
    }
}
