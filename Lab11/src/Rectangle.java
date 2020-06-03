public class Rectangle {
    public double a;
    public double b;
    public double c;

    public Rectangle(double xa, double xb){
        a = xa;
        b = xb;
    }

    public String toStringLength() {
        return "a: " + a + "\nb: " +  b;
    }

    public String toStringS() {
        if((a>0) && (b>0)){
                return "S: " + a*b;
            }
            else return "S: Длина прямоугольника не может быть меньше или равна 0";
    }

    public String toStringP() {
        if((a>0) && (b>0)){
            return "P: " + 2*(a+b);
        }
        else return "P: Длина прямоугольника не может быть меньше или равна 0";
    }
}
