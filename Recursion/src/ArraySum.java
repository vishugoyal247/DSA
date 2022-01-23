import java.util.Scanner;

public class ArraySum
{
    //Head Recursion
    public static int arraySum(int[] arr ,int length)
    {
        if(length==0)
        {
            return 0;
        }
        return arr[length-1]+arraySum(arr,length-1);
    }

    //Tail Recursion
//    public static void arraySum(int[] arr, int length , int ans )
//    {
//        if(length ==0)
//        {
//            System.out.println("The sum of the array is : " + ans);
//            return;
//        }
//        arraySum(arr,length-1,arr[length-1]+ans);
//    }

}

class main3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("The sum of the array is : "+ArraySum.arraySum(arr,arr.length));  // Head Calling
//        ArraySum.arraySum(arr,arr.length, 0);  // Tail Calling


    }
}
