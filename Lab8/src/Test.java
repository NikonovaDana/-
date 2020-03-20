public class Test {

    public static void main(String[] args) {
        People MyPeople1 = new People();
        People MyPeople2 = new People("nameMyPeople2","lastnameMyPeople2",20);
        Student MyStudent = new Student();
        Student MyStudentPar = new Student("NewNameStudent", "NewLastnameStudent", 22);
        Teacher MyTeacher = new Teacher();
        Teacher MyTeacherPar = new Teacher("NewNameTeacher", "NewLastnameTeacher", 32);

        System.out.println (" Методы и поля c непараметризованным конструктором People");
        MyPeople1.walk();
        MyPeople1.voice();
        MyPeople1.run();
        System.out.println(MyPeople1.name + " " + MyPeople1.lastname + " " + MyPeople1.age);
        System.out.println ();

        System.out.println (" Методы и поля c параметризованным конструктором People");
        MyPeople2.walk();
        MyPeople2.voice();
        MyPeople2.run();
        System.out.println(MyPeople2.name + " " + MyPeople2.lastname + " " + MyPeople2.age);
        System.out.println ();

        System.out.println (" Методы и поля c непараметризованным конструктором Student");
        MyStudent.walk();
        MyStudent.voice();
        MyStudent.run();
        MyStudent.learn ();
        System.out.println(MyStudent.name + " " + MyStudent.lastname + " " + MyStudent.age);
        System.out.println ();

        System.out.println (" Методы и поля c параметризованным конструктором Student");
        MyStudentPar.walk();
        MyStudentPar.voice();
        MyStudentPar.run();
        MyStudentPar.learn ();
        System.out.println(MyStudentPar.name + " " + MyStudentPar.lastname + " " + MyStudentPar.age);
        System.out.println ();

        System.out.println (" Методы и поля c непараметризованным конструктором Teacher");
        MyTeacher.walk();
        MyTeacher.voice();
        MyTeacher.run();
        MyTeacher.teach();
        System.out.println(MyTeacher.name + " " + MyTeacher.lastname + " " + MyTeacher.age);
        System.out.println ();

        System.out.println (" Методы и поля c параметризованным конструктором Teacher");
        MyTeacherPar.walk();
        MyTeacherPar.voice();
        MyTeacherPar.run();
        MyTeacherPar.teach();
        System.out.println(MyTeacherPar.name + " " + MyTeacherPar.lastname + " " + MyTeacherPar.age);
        System.out.println ();
    }
}
