public class Teacher extends People {
        public Teacher(String name, String lastname, int age){
            super(name,lastname,age);
        }
        public Teacher() {
            this.name = "name_teacher";
            this.lastname = "lastname_teacher" ;
            this.age = 30;
        }
        @Override
        public void walk() {
            System.out.println("walk_teacher");
        }

        @Override
        public void voice() {
            System.out.println("voice_teacher");
        }

        @Override
        public void run() {
            System.out.println("run_teacher");
        }

        public void teach(){
            System.out.println("Teach");
        }
    }
