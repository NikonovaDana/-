public class Cupboard extends furniture {
    private String nameCup; //наименование шкафа
    private int numDoors; //кол-во дверей
    private Boolean embedded; //встроеный или нет

    public Cupboard() {//конструктор Cupboard без параметров
        super();  // вызываем конструктор класса-родителя без параметров
        nameCup = "noname"; // добавляем инициализацию новых членов // наименование шкафа noname
        numDoors = 2;      // кол-во дверей 2
        embedded = false;  // встроенный false
    }

    public Cupboard(String name, int w, int l, int h, String nameC, int n, Boolean f) {//конструктор Car с параметрами
        super(name, w, l, h);// вызываем конструктор класса-родителя с параметрами
        this.nameCup =  nameC;  // добавляем инициализацию новых членов
        this.numDoors = n;
        this.embedded = f;
    }

    public void setNameCup(String name) {
        this.nameCup = name;
    }

    public String getNameCup() {
        return nameCup;
    }

    public void setNumDoors(int n) {
        numDoors = n;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setEmbedded(Boolean b) {
        this.embedded = b;
    }

    public Boolean isFullTime() {
        return embedded;
    }

    public String toString() {
        return getFirma() + " " + getWidth() + " " + getLength() + " " + nameCup + " " + numDoors + " " + embedded;
    }
}
