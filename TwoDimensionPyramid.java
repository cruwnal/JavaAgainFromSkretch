public class TwoDimensionPyramid
{
    public static void main(String[] args){
        for(int i=1;i<=10;i++) {
            pyramid1();
            pyramid2();
            pyramid3();
            pyramid4();
        }
    }
    static void pyramid1(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");

            }
          for(int k=1;k<=2*i-1;k++){


              System.out.print("*");
          }

            System.out.println();
        }




    }
    static void pyramid2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=9;k>=2*i-1;k--)
                System.out.print("*");


            System.out.println();
        }
    }
    static void pyramid3(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid4(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=9;k>=2*i-1;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
