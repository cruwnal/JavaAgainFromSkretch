import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args){
        //linearSearch1();
        linearSearch2();

    }
    static void linearSearch1(){
        System.out.println("enter the length of the array ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<= arr.length-1;i++){
            System.out.println("enter the content for index "+i);
            arr[i]=in.nextInt();
        }
        // for searching the content

        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]==50){
                System.out.println("content is present in index "+ i);
            }
            else{
                System.out.println("endex is not found at index "+i);
            }
        }




    }
    static void linearSearch2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int len,i,key;
        len = in.nextInt();
        int arr[]=new int[len];
        for(i=0;i<=arr.length-1;i++){
            System.out.println("enter the content in "+i);
            arr[i]=in.nextInt();
        }
        System.out.println("enter the key for searching ");
        key = in.nextInt();
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                System.out.println(key +" is present in the index "+i);
                System.exit(0);
            }

        }
        System.out.println("key is not found ");

    }
}
