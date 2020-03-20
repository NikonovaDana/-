public class Student extends People {
    public Student() {
        this.name = "name_student";
        this.lastname = "lastname_student";
        this.age = 18;    }
    public Student(String name, String lastname, int age){
        super(name,lastname,age);
    }
    @Override
    public void walk() {
        System.out.println("walk_student");
    }

    @Override
    public void voice() {
        System.out.println("voice_student");
    }

    @Override
    public void run() {
        System.out.println("run_student");
    }

    public void learn(){
        System.out.println("Learn");
    }
}
