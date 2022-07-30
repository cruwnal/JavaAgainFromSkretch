import java.util.Scanner;
public class Swaping
{
    public static void main(String [] args){
       // normalSwapping();
        arraySwapping();

    }
    static void normalSwapping(){
        Scanner in = new Scanner(System.in);
        int a,b,help;
        System.out.println("enter 2 numbers");
        a= in.nextInt();
        b= in.nextInt();
        System.out.println("Number before swapping ");
        System.out.println(a+"  "+b);

        help=a;
        a=b;
        b=help;
        System.out.println("numbers after swapping");
        System.out.println(a+" "+b);

    }
    //write a program to swap the contents of 2 index of an array.
    static void arraySwapping(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int sizeOfAnArray = in.nextInt();
        int arr [] = new int[sizeOfAnArray];

        for(int i = 0;i<=arr.length-1;i+=1){
            System.out.println("enter the "+i);
            arr[i]=in.nextInt();


        }
        System.out.println("printing the array without swapping  ");



        for(int i=0;i<= arr.length-1;i+=1){
            System.out.println(arr[i]);
        }


        System.out.println("Enter the swapping indexes which should not be greater than " + arr.length);

        int ind1=in.nextInt();
        int ind2=in.nextInt();
        int help;

        if(sizeOfAnArray>=ind1&&sizeOfAnArray>=ind2&&ind1>=0&&ind2>=0 ) {

            help = arr[ind1];
            arr[ind1] = arr[ind2];
            arr[ind2] = help;
            System.out.println("printing the array with swapping ");
            for (int i = 0; i <= arr.length - 1; i += 1) {
                System.out.print(arr[i] + " ");
            }
        }
        else{
            System.out.println("enter the right index");
        }


    }
}
