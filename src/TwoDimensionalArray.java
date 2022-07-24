import java.util.Scanner;
public class TwoDimensionalArray
{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int arr [][]=new int[4][3];
        for(int i=0;i<=arr.length-1;i+=1){
            for(int j=0;j<=arr[i].length-1;j+=1){
                System.out.print("enter the salary of company "+i+" enter the employ "+j+" ");
                arr[i][j]=in.nextInt();
            }

        }


        for(int i=0;i<=arr.length-1;i+=1){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ; ");
            }
            System.out.println();
        }
    }
}
