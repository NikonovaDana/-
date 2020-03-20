interface IAnimal {

    public abstract boolean run(double distance);

    public abstract boolean swim(double distance);

    public abstract boolean jump(double distance);
}

public abstract class Animal implements IAnimal {
    protected String name;
    protected double rvalue;
    protected double svalue;
    protected double jvalue;

    public boolean run(double distance) {
        return (this.rvalue >= distance);
    }

    public boolean swim(double distance) {
        return (this.svalue >= distance);
    }

    public boolean jump(double distance) {
        return (this.jvalue >= distance);
    }

    public Animal(String name, double rvalue, double svalue, double jvalue){
        this.name = name;
        this.rvalue = rvalue;
        this.svalue = svalue;
        this.jvalue = jvalue;
    }
}