import java.util.Scanner;
public class TwoDimensionalArrayPartTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd dimensional length of array");
        int arr[][] = new int[in.nextInt()][in.nextInt()];
        int i, j;
        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++){
                System.out.println("enter the marks of college "+i+" enter the student "+j);
                arr[i][j]= in.nextInt();
            }
        }
        System.out.println("enter the contents ");
        for(i=0;i<=arr.length-1;i++){
            for(j=0;j<=arr.length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}