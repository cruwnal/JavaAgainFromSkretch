

public class PatternProgrammingOne
{
    public static void main(String[] args){
       Pattern1 p1 = new Pattern1();
       Pattern1 p2 = new Pattern1();
       Pattern1 p3 = new Pattern1();

      p2.pattern2();
       p3.pattern3();
        p1.pattern1();





    }



}
   class Pattern1 {

       void pattern3(){
           for (int i = 1; i <= 5; i++) {
               for (int j = 1; j < i; j++) {
                   System.out.print("$");
               }
               System.out.println("$");


           }
       }

       void pattern1() {
          // for (int i = 1; i <= 5; i++)
               //System.out.println("$");
       }

       void pattern2() {
           for (int i = 1; i <= 5; i++) {
               for (int j = 1; j < i; j++) {
                   System.out.print("$");
               }
               System.out.println("$");


           }
       }
   }