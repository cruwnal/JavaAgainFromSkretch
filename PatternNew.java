//wrong method

public class PatternNew
{
    public static void main(String[] args){

        pattern1();
        pattern1();
        pattern1();
        pattern1();
        pattern1();
    }

     static void  pattern1(){
        for(int i=1;i<=5;i++){
            System.out.print(" ");
        }
        for(int i=1;i<=5;i++){
            System.out.print("*");
        }
    }
}
