
import java.util.*;
public class MarksArray {
    public static void main(String[]args){
       //manual();
       loop();

    }
    static void manual(){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the first marks");
        arr[0] = in.nextInt();
        System.out.println("enter the second marks");
        arr[1] = in.nextInt();
        System.out.println("enter the third marks");
        arr[2]=in.nextInt();
        System.out.println("enter the fourth marks");
        arr[3]=in.nextInt();
        System.out.println("enter the the 5th marks");

        System.out.println("{"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"}");
    }
    static void loop(){

        Scanner in = new Scanner(System.in);
        int arr[]= new int[5];

     for(int i=0;i<=4;i++) {
         System.out.println("enter the marks of student"+i);
            arr[i] = in.nextInt();

     }
        System.out.println("the contents opf an array");

     for(int i = 0;i<=4;i++){
         System.out.print(arr[i]+",");
     }


    }

}
