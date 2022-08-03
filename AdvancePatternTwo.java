public class AdvancePatternTwo {
    public static void main(String[] args){
        pattern2();
        pattern1();

    }
    static void pattern2(){
        for(int i=1;i<=5;i++){
            {
                for(int j=5;j>=i;j--){
                    System.out.print("-");
                }
                for(int k=5;k>=i;k--){
                    System.out.print(">");
                }
            }
            System.out.println();
        }

    }
    static void pattern1(){
        for(int i=1;i<=5;i++){
            {
                for(int j=1;j<=i;j++)
                    System.out.print("-");
            }
            {
                for(int k=1;k<=i;k++)
                    System.out.print(">");


            }
            System.out.println();
        }
    }
}
