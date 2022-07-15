

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
       s1.name="kunal nagwanshi";
       s2.name="ram";
       s3.name="raju0";
       s1.age=14;
       s2.age=15;
       s3.age=16;
       s1.usn=1213;
       s2.usn=1231;
       s3.usn=3233;
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.usn);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.usn);
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.usn);

    }
}