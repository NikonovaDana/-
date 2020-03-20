public class Auto {
    private String firm;  //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    private String GosNum;   // закрытый член класса, содержащий гос. номер

    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma;                    //значения фирмы автомобиля
    }

    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed;                 //значения максимальной скорости автомобиля
    }

    public void setGosNum(String Num){ //открытая функция (метод класса) для задания
        GosNum = Num;               //значения гос. номера автомобиля
    }

    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed;      //максимальной скорости
    }

    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm;         //заданной фирмы
    }

    public String getGosNum(){ //открытая функция (метод класса) для вывода значения
        return GosNum;      //гос. номера автомобиля
    }


    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
    }

    public Auto(String firma, int speed, String num){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
        GosNum = num;
    }
}
