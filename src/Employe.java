import java.util.Scanner;
public class Employe
{
    public static void main(String[] args){

        int arr[] = new int[7];
        Scanner in = new Scanner(System.in);

        for(int i=0;i<= arr.length-1;i+=1){
            System.out.println("enter the employ id "+i);
            arr[i] = in.nextInt();
        }
        for(int i=0;i<= arr.length-1;i+=1){
            System.out.print(arr[i]+" ");
        }

    }
}
