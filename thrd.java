import java.util.Scanner;
public class thrd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the first dimension");

    int arr1[][] = new int[in.nextInt()][];
    int i, j;
    //we are removing the code redundancy here
    for (i = 0; i <= arr1.length - 1; i += 1) {
      System.out.println("enter the second dimension length " + i);
      arr1[i] = new int[in.nextInt()];
    }
    //we need to store the value
    for (i = 0; i <= arr1.length - 1; i += 1) {
      for (j = 0; j <= arr1[i].length - 1; j += 1) {
        System.out.println("enter the college " + i + " enter the student " + j);
        arr1[i][j] = in.nextInt();
      }
    }
    //for printing the values
    for (i = 0; i <= arr1.length - 1; i += 1) {
      for (j = 0; j <= arr1[i].length - 1; j += 1) {
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();


    }
  }
}