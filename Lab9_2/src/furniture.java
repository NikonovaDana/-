public class furniture {
    private String firma;  //создаем закрытый член нашего класса с фирму мебели
    private int width;       // закрытый член класса, содержащий ширину мебели
    private int length;       // закрытый член класса, содержащий длину мебели
    private int height;       // закрытый член класса, содержащий высоту мебели

    public void setFirma(String name){ //открытая функция (метод класса) для задания
        firma = name;                    //значения фирма  мебели
    }

    public void setWidth(int w){ //открытая функция (метод класса) для задания
        width = w;               //значения ширины мебели
    }

    public void setLength(int l){ //открытая функция (метод класса) для задания
        width = l;                //значения длины мебели
    }

    public void setHeight(int h){ //открытая функция (метод класса) для задания
        width = h;                //значения высоты мебели
    }

    public String getFirma(){ //открытая функция (метод класса) для вывода значения
        return firma;         //наименования мебели
    }

    public int getWidth(){ //открытая функция (метод класса) для вывода значения
        return width;      //ширины мебели
    }

    public int getLength(){ //открытая функция (метод класса) для вывода значения
        return length;      //длины мебели
    }

    public int getHeight(){ //открытая функция (метод класса) для вывода значения
        return height;      //высоты мебели
    }
    public furniture(){ // конструктор класса (без параметров)
        firma = "Без названия";
        width = 0;
        length = 0;
        height = 0;

    }

    public furniture(String name, int w, int l, int h ){ //конструктор класса (с параметрами)
        firma = name;
        width = w;
        length = l;
        height = h;
    }
}
