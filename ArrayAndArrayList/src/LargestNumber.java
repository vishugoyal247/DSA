import java.util.Scanner;


class Largest
{
    int[] arr = null;
    int i;

    // constructor to initialize the array
    public Largest(int cap, int n)
    {
        arr = new int[cap];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for (i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    // to find and return the max value.
    public int larger()
    {
        int max = Integer.MIN_VALUE;
        for (int ele : arr)
        {
            if(ele > max )
            {
                max = ele;
            }
        }
        return max;
    }

}


public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int cap = sc.nextInt();

        System.out.print("Enter the no. of the elements in the array : ");
        int n = sc.nextInt();

        Largest l = new Largest(cap, n);
        System.out.println("The Largest element of the array is " + l.larger() );
    }
}
