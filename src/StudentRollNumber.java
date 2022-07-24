import java.util.Scanner;
public class StudentRollNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr [][] = new int[4][3];
        for(int i=1;i<= arr.length;i++){
            for(int j=1;j<=arr[i].length;j++){
                System.out.println("roll number of student  "+i+" is "+j);
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
