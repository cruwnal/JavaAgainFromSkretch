import java.util.Scanner;
public class BinarySearch
{
  public static void main(String [] args){

      //binarySearch1();
      binarySearch();
  }
  static void binarySearch1(){
      Scanner in = new Scanner(System.in);
      System.out.println("enter the length of the array");
      int i,len,key;
      len = in.nextInt();
      int [] arr  = new int[len];

      System.out.println("enter the content ");
      for(i=0;i<= arr.length-1;i++){
          System.out.println("enter the content at "+i);
          arr[i]= in.nextInt();
      }
      System.out.println("enter the key to search");
      key = in.nextInt();
      int low=0;
      int mid;
      int high = arr.length-1;
      //low can't be greater than high.
      while(low<=high){
          mid=(low+high)/2;
          if(key==arr[mid]){
              System.out.println("key found at index "+mid);
              System.exit(0);
          }
          else if(key>arr[mid]){
              low = mid+1;
              high = high;
          }
          else{
              high = mid-1;
              low = low;
          }
      }
      System.out.println("key not found ");

  }
  static void binarySearch(){
      Scanner in = new Scanner(System.in);
      int i,len,key,mid,low,high;
      System.out.println("enter the length of the array");
      len = in.nextInt();
      int [] arr= new int[len];
      System.out.println("enter the content of the array");
      for(i=0;i<= arr.length-1;i++){
          System.out.println("enter the content of index "+i);
          arr[i]= in.nextInt();
      }

      System.out.println("enter the key for search ");
      key = in.nextInt();
      low=0;
      high = arr.length-1;
      while(low<=high){
          mid = (low+high)/2;
          if(key==arr[mid]){
              System.out.println("key is found in "+mid);
              System.exit(0);
          }
          else if(key>arr[mid]){
              low = mid+1;
              high = high;
          }
          else {
              high = mid-1;
              low = low;
          }
      }
      System.out.println("key not found ");


  }
}
