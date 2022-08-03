public class SelectionShort
{
    public static void main(String []args){
      bubbleShort();
      selectionSort();
    }
    static void bubbleShort(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of array ");
        int arr[]= new int [in.nextInt()];

        System.out.println("enter the content of an array ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("enter the content for index "+i);
            arr[i]=in.nextInt();
        }
        System.out.println("content without sorting ");
        System.out.println(Arrays.toString(arr));

        System.out.println("now sorting algorithm");

        int temp = 0;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swapped
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of array ");
        int len = in.nextInt();
        int arr []= new int[len];

        for(int i=0;i<= arr.length-1;i++){
            System.out.println("enter the content of the array in index "+i);
            arr[i]=in.nextInt();
        }
        System.out.println(" Unsorted array "+Arrays.toString(arr));
        int temp =0;
        for(int i=0;i<= arr.length-1;i++){
            for(int j = len-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    //swapping the array
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("sorted array"+Arrays.toString(arr));
    }
}
