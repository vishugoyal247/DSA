import java.util.Arrays;
import java.util.Scanner;

public class FreqArray
{
    //Head Recursion
    public static int[] res(int arr[], int current_index, int search_value, int[] a, int count)
    {
        if(current_index == arr.length)
            return a;

        if (arr[current_index]==search_value)
        {
            a[count]=current_index;
            count++;

        }

        return res(arr,current_index+1,search_value,a,count);
    }


}


class main7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] occur = new int[n];
        Arrays.fill(occur,-1);
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the search element : ");
        int search_value = sc.nextInt();

        occur = FreqArray.res(arr,0,search_value,occur,0);  // Head Calling

        for (int ele : occur)
        {

            if(ele != -1)
                System.out.print(ele+" ");
        }



    }
}