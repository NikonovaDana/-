public class Car extends Auto {
    private String model; //модель машины
    private int numDoors; //кол-во дверей
    private Boolean fullTime; //полный привод

    public Car() {//конструктор Car без параметров
        super();  // вызываем конструктор класса-родителя без параметров
        model = "";        // добавляем инициализацию новых членов // модель пустая
        numDoors = 4;      // кол-во дверей 4
        fullTime = false;  //полный привод false
    }

    public Car(String firma, int speed, String num, String name, int n, Boolean f) {//конструктор Car с параметрами
        super(firma, speed, num);// вызываем конструктор класса-родителя с параметрами
        this.model = name;  // добавляем инициализацию новых членов
        this.numDoors = n;
        this.fullTime = f;
    }

    public void setModel(String name) {
        this.model = name;
    }

    public String getModel() {
        return model;
    }

    public void setNumDoors(int n) {
        numDoors = n;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setFullTime(Boolean b) {
        this.fullTime = b;
    }

    public Boolean isFullTime() {
        return fullTime;
    }

    public String toString() {
        return getFirm() + " " + getMaxSpeed() + " " + getGosNum() + " " + model + " " + numDoors + " " + fullTime;
    }
}
