import java.util.Scanner;
public class Assignment2
{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of 1st dimension");
        String arr[][][]= new String[in.nextInt()][][];
        int i,j,k;
        //for 2nd dimension
        for(i=0;i<= arr.length-1;i++){
            System.out.println("enter the second dimension of length "+i);
            arr[i]=new String[in.nextInt()][];
        }
        //3rd dimension
        System.out.println("enter the 3rd dimension length for each 1st dimension and 2nd dimension ");
        for(i=0;i<=arr.length-1;i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("enter the 3rd dimension length for " + i + " and " + j);
                arr[i][j] = new String[in.nextInt()];
            }
        }
            //now we have to add the name for every bank and branch
            System.out.println("enter the name for each bank and branch");
            for(i=0;i<= arr.length-1;i++){
                for(j=0;j<=arr[i].length-1;j++){
                    for(k=0;k<=arr[i][j].length-1;k++){
                        System.out.println("enter the name for "+ i+ " bank "+j+" branch" );
                        arr[i][j][k]=in.next();

                    }
                }
            }

            //we have to print the value

        for(i=0;i<=arr.length-1;i++){
            for(j=0;j<= arr[i].length-1;j++){
               for(k=0;k<=arr[i][j].length-1;k++){
                   System.out.print(arr[i][j][k]+" ");
               }
                System.out.println();
            }
        }
    }
}
