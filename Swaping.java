import java.util.Scanner;
public class Swaping
{
    public static void main(String [] args){
        normalSwapping();
        arraySwapping();
        copyArray();
        reverseTheCopyArray();

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
     static void copyArray(){
        Scanner in = new Scanner(System.in);
         System.out.println("enter the length of the array");
         int len = in.nextInt();
         int arr[]=new int [len];
         System.out.println("enter the contents");
         for(int i=0;i<=arr.length-1;i++){
             System.out.println("enter the element "+i);
             arr[i]=in.nextInt();
         }
         int arr2[]=new int[arr.length];
         for(int i=0;i<= arr.length-1 ;i++){
             arr2[i]=arr[i];
         }
         System.out.println("contents of the array 1 is");
         for(int i=0;i<= arr.length-1;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
         System.out.println("contents of the 2nd array is ");
         for(int i=0;i<=arr.length-1;i++){
             System.out.print(arr2[i]+" ");
         }


     }
     static void reverseTheCopyArray(){

        Scanner in = new Scanner(System.in);
         System.out.println("Enter the length of the array");
        int len= in.nextInt();
        int arr1[]=new int[len];
         System.out.println("enter the content odf the array ");
        for(int i=0;i<= arr1.length-1;i+=1){
            System.out.println("enter the content for element "+i);
            arr1[i]= in.nextInt();
        }
         System.out.println("printing the array 1 content ");
        for(int i=0;i<= arr1.length-1;i++){
            System.out.print(arr1[i]+" ");
        }
         System.out.println();

        //arr2
         int arr2 []=new int[arr1.length];
         int j = arr2.length-1;
         for(int i=0;i<= arr1.length-1;i++){
             arr2[j]=arr1[i];
             j--;
         }
         System.out.println("printing the array 2 in reverse form");
         for(int i=0;i<= arr2.length-1;i++){
             System.out.print(arr2[i]);
         }



     }
}
