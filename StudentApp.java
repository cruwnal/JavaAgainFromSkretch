

    class Student {
        String name;
        int age;
        String gender;
        int usn;

         void eat() {
            String eat = "student is eating";
            System.out.println(eat);


        }

        void sleep() {
            String sleep = "student is sleeping";
            System.out.println(sleep);


        }

        void running() {
            String running = "student is running";
            System.out.println(running);



        }

        void study() {
            String study = "student is studying";

        }
    }




class StudentApp {


    public void main(String[] args) {



        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

       s1.eat();
       s2.sleep();
       s3.running();
       s1.study();

    }
}