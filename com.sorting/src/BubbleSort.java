import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting
{
    public static void main(String [] args){
        int arr[]={2,3,4,9,5,8};
       // bubbleSorting1(arr);
        //System.out.println(Arrays.toString(arr));
//=================================================================================

        //bubbleShirt2();
          bubbleSort3();




    }
    static void bubbleSorting1(int arr[]){
        //boolean swapped;
        //run te steps N-1 times
        int temp =0;
        for(int i=0;i<= arr.length-1;i++){
            //for each item, max item will come at the last indexes.
               // swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                     temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    //swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array
          //if(!swapped){
              //break;

        }


    }
    static void bubbleShirt2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int len = in.nextInt();
        int arr []= new int[len];

        System.out.println("enter the content of the array ");
        for(int i= 0; i<= arr.length-1;i++){
            System.out.println("enter the content of the array "+i);
            arr[i]=in.nextInt();
        }

        System.out.println("content without sorting");
        for(int i=0;i<= arr.length-1;i++){

            System.out.println(arr[i]+" ");
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("now content with Binary sorting");
        int temp=0;
        for(int i=0;i<= arr.length-1;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;


                }
            }
        }
        for(int i=0;i<= arr.length-1;i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println(Arrays.toString(arr));


    }
    static void bubbleSort3(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int arr [] = new int[in.nextInt()];
        System.out.println("enter the content here ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("enter the content "+i);
            arr[i]= in.nextInt();
        }

        System.out.println("here is the unsorted array "+Arrays.toString(arr));
        int temp=0;
        for(int i=0;i<= arr.length-1;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                   temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                }
            }
        }
        System.out.println("sorted array "+ Arrays.toString(arr));

        int low =0;
        int mid;
        int high = arr.length-1;
        System.out.println("enter the key ");
        int key = in.nextInt();
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.println("key found at "+mid);
                System.exit(0);
            }
            else if(key>arr[mid]){
                low=mid+1;
                high = high;

            }
            else{
                high = mid-1;
                low=low;
            }

        }
        System.out.println("key not found");
    }

}

