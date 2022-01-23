import java.util.Scanner;

public class LinearSearch
{
    // Head Recursion
//    public static int find(int arr[ ], int currentIndex, int search_value)
//    {
//       if(currentIndex == -1)
//           return -1;
//       else if(arr[currentIndex] == search_value)
//           return currentIndex;
//
//       return find(arr,currentIndex-1,search_value);
//    }

    //Tail Recursion
    public static void find(int arr[ ], int currentIndex, int search_value)
    {
        if(currentIndex == -1)
        {
            System.out.println("The search element index is : -1");
            return;
        }
        else if(arr[currentIndex] == search_value)
        {
            System.out.println("The search element index is :" + currentIndex);
            return;
        }
        find(arr,currentIndex-1,search_value);
    }
}

class main4
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
//        System.out.println("The given element index is : "+LinearSearch.find(arr,arr.length-1,search_value));  // Head Calling
        LinearSearch.find(arr,arr.length-1,search_value);  // Tail Calling



    }
}