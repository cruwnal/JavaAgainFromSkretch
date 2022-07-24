import java.util.Scanner;
public class CollegeRollNumber
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr [][]= new int[3][4];
        for(int i=0;i<= arr.length-1;i+=1){
            for(int j=0;j<=arr.length;j+=1){
                System.out.println("enetr the college"+i+" and number of students "+j);
                arr[i][j]= in.nextInt();
            }
        }
        for(int i=0;i<= arr.length-1;i+=1){
            for(int j=0;j<= arr.length;j+=1){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
