import java.util.Scanner;
public class Table extends furniture{
    private String nameTab;   //наименование стола
    private int numLegs;      //кол-во ножек стола
    private Boolean folding ; //cкладной или нет

    public Table(){// конструктор Truck без параметров
        super();// вызываем конструктор класса-родителя без параметров
        nameTab = "";   //наименование стола не указано
        numLegs = 4;    //кол-во ножек стола 4
        folding = false;//нескладной
    }

    public Table(String name, int w, int l, int h, String nameT, int n, Boolean f){// конструктор Truck с параметров
        super(name,w,l,h);// вызываем конструктор класса-родителя с параметрами
        nameTab = name;
        numLegs = n;
        folding = f;
    }

    public void setNameTab(String name){
        nameTab = name;
    }
    public String getNameTab(){
        return nameTab;
    }

    public void setNumLegs(int n){
        numLegs = n;
    }
    public int getNumLegs(){
        return numLegs;
    }

    public void setFolding(Boolean b){
        folding = b;
    }
    public Boolean isFolding(){
        return folding;
    }

    public void setAllInfo(){//ввод всей информации для Table

        Scanner in = new Scanner(System.in);

        System.out.print("Введите форму стола: ");
        String nazv=in.next(); //метод next() позволяет вводить строки, но без пробелов
        setFirma(nazv);

        System.out.print("Введите ширину стола: ");
        int w=in.nextInt(); //Ввод ширины стола
        setWidth(w);

        System.out.print("Введите длину стола: ");
        int l = in.nextInt(); //Ввод длины стола
        setLength(l);

        System.out.print("Введите высоту стола: ");
        int h = in.nextInt(); //Ввод высоты стола
        setHeight(h);

        System.out.print("Введите наименование стола:");
        nameTab = in.next();

        System.out.print("Введите кол-во ножек стола: ");
        numLegs = in.nextInt();

        System.out.print("Введите складной стол или нет (true/false): ");
        folding = in.nextBoolean();

        System.out.println();//пустая строка
    }

    public String toString(){
        return "\n\tСтол"+"\n\t"+"Фирма: "+getFirma()+"\n\t"+"Ширина: "
                +getWidth()+ "\n\t"+"Длина: "+getLength()+"\n\t"+"Высота: "+getHeight()+"\n\t"+"Наименование: "+nameTab+"\n\t"+"Кол-во ножек: "+numLegs+"\n\t"+"Встроенный: "
                +folding+"\n";
    }
}
