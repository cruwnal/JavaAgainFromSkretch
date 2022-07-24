import java.util.Scanner;
public class ThreeDimensionalArray
{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int arr [][][] = new int[3][2][4];
        int i,j,k;

        for(i=0;i<=arr.length-1;i+=1){
            for(j=0;j<=arr[i].length-1;j+=1){
                for(k=0;k<=arr[i][j].length-1;k+=1){
                    System.out.println(" enter the bank "+i+" enter the branch num "+j+" enter the customer number "+k);
                    arr[i][j][k]=in.nextInt();
                }
            }
        }

        for(i=0;i<= arr.length-1;i++){
            for(j=0;j<=arr[i].length-1;j++){
                for(k=0;k<=arr[i][j].length-1;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.print( " ");
            }
            System.out.println();
        }


    }
}
