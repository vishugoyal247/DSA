import java.util.Scanner;

public class binarySearch
{
    // Head Recursion
//    public static int find(int arr[ ],int start, int end, int search_value)
//    {
//       if(start>end)
//           return -1;
//
//
//       int mid = (start + end) / 2;
//
//
//       if(search_value == arr[mid] )
//           return mid;
//       else if (search_value > arr[mid] )
//           return find(arr,mid+1,end,search_value);
//       else
//           return find(arr,start,mid-1,search_value);
//    }

    //Tail Recursion
    public static void find(int arr[ ],int start, int end, int search_value)
    {
        if(start>end)
            System.out.println("-1");

        int mid = (start + end) / 2;

        if(search_value == arr[mid] )
            System.out.println(mid);
        else if (search_value > arr[mid] )
            find(arr,mid+1,end,search_value);
        else
            find(arr,start,mid-1,search_value);
    }
}

class main5
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
        System.out.print("Enter the search element : ");
        int search_value = sc.nextInt();
//        System.out.println("The given element index is : "+binarySearch.find(arr,0,arr.length-1,search_value));  // Head Calling
        binarySearch.find(arr,0,arr.length-1,search_value);  // Tail Calling



    }
}
