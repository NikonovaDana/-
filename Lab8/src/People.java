public class People {
    protected String name;
    protected String lastname;
    protected int age;

    public People(){
        this.name = "default_name";
        this.lastname = "default_lastname";
        this.age = 10;
    }

    public People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void walk() {
        System.out.println("default_walk");
    }

    public void voice() {
        System.out.println("default_voice");
    }

    public void run() {
        System.out.println("default_run");
    }




}

