public class OctalNum {
    public static void main(String[] args) {
        int a = 45;
        int b = 045;
        int c = 0x45;
        int d = 0b00110010;
        System.out.println(a + "\n" + "\n" + b + "\n" + c + "\n" + d);
        assignment();
        pattern(5);
    }

    static void assignment() {

        for (int i = 0; i < 3 ; i++)
        {
            System.out.print("Kodnest");
            System.out.print("Technologies");
        }

    }
    static void pattern(int n){
        for(int i=0;i<=n;i++){
            for( int j=1;j<=i;j++){

                System.out.print(j+" ");


            }
            System.out.println();
        }
    }
}
