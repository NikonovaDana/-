public class Cat extends Animal {
    Cat(String name){
        super(name,200,0,2);
    }
    @Override
    public boolean swim(double distance) {
        return false;
    }
}
