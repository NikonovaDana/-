

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double xa, double xb, double xc){
        a = xa;
        b = xb;
        c = xc;
    }

    public String toStringLength() {
            return "a: " + a + "\nb: " +  b + "\nc: " + c;
    }

    public String toStringS() {
        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    double p = (a + b + c) / 2;
                    return "S: " + Math.sqrt (p * (p - a) * (p - b) * (p - c));
                }
                else {
                    return "S:" + c + " + " + a + " <= " + b + " Такой треугольник не существует";
                }
            }
            else {
                return "S:" + b + " + " + c + " <= " + a  + " Такой треугольник не существует" ;
            }
        }
        else {
            return "S:" + a + " + " + b + " <= " + c + " Такой треугольник не существует";
        }
    }

    public String toStringP() {
        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    return "P: " + (a+b+c);
                }
                else {
                    return "P:" + c + " + " + a + " <= " + b + " Такой треугольник не существует";
                }
            }
            else {
                return "P:" + b + " + " + c + " <= " + a  + " Такой треугольник не существует" ;
            }
        }
        else {
            return "P:" + a + " + " + b + " <= " + c + " Такой треугольник не существует";
        }

    }

}
