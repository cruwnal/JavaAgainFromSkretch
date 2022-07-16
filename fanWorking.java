
public class fanWorking
{
    public static void main(String[] args){
        fan orient = new fan();
        fan bajaj = new fan();
        fan usha = new fan();
        usha.speed();
        usha.wings();
        usha.color();
        orient.speed();
        orient.color();
        orient.wings();
        bajaj.speed();
        bajaj.wings();
        bajaj.color();
    }
    static class fan{

         int speed;
         String color;
         int wings;

        void speed(){
            speed = 5;
            System.out.println(speed);
        }
        void color(){
            color="black";
            System.out.println(color);
        }
        void wings(){
            wings=3;
            System.out.println(wings);
        }



    }
}
