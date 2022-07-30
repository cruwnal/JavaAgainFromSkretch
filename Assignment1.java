import java.util.Scanner;
public class Assignment1
{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the one dimension length");
        float arr[][]=new float[in.nextInt()][];
        int i,j;
        for( i=0;i<= arr.length-1;i++){
            System.out.println("enter the two dimension length "+i);
            arr[i]=new float[in.nextInt()];

        }
        //now we need to store the value.
        for(i=0;i<=arr.length-1;i++){
            for(j=0;j<=arr[i].length-1;j++){
                System.out.println("enter the "+i+" player "+j+ "  height in feet");
                arr[i][j]=in.nextFloat();
            }
        }
        //now we have to print the height

        for(i=0;i<=arr.length-1;i++){
            for(j=0;j<= arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}

