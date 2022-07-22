import java.util.Scanner;
public class MarksArrayaone {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i <= arr.length-1; i += 1) {
            System.out.println("enter the marks of student " + i);
            arr[i] = in.nextInt();
        }
        for(int i=0;i<= arr.length-1;i +=1){
            System.out.print(arr[i]+",");
        }

    }
}
