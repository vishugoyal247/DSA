import java.util.Scanner;

public class FrequencyOfElement
{
    //Head Recursion
//    public static int res(int arr[], int current_index, int search_value)
//    {
//        if(current_index == -1)
//            return 0;
//
//        if (arr[current_index]==search_value)
//            return 1+res(arr,current_index-1,search_value);
//        else
//            return res(arr,current_index-1,search_value);
//    }

    //Tail Recursion
    public static void res(int arr[], int current_index, int search_value,int freq)
    {
        if(current_index == -1)
        {
            System.out.println("The freq of the given element is : "+freq);
            return;
        }
        if (arr[current_index]==search_value)
            res(arr,current_index-1,search_value,freq+1);
        else
            res(arr,current_index-1,search_value,freq);
    }
}


class main6
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
//        System.out.println("The frequency of the given element is : "+FrequencyOfElement.res(arr,arr.length-1,search_value));  // Head Calling
        FrequencyOfElement.res(arr,arr.length-1,search_value,0);  // Tail Calling



    }
}