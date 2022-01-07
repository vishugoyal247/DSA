import java.util.Scanner;


class SecondLargest
{
    public int[] arr = null;
    public int n;
    public int largest;

    // constructor for initialize a value
    public SecondLargest(int cap, int n)
    {
        arr = new int[cap];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        this.n = n;
        for (int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    // logic for the main purpose.
    public int secondLargest()
    {
        int res = Integer.MIN_VALUE;
        largest = 0;


        for (int i = 1; i < n; i++)
        {
            if(arr[i] > arr[largest])
            {
                res = largest;
                largest = i;
            }
            else if(arr[i] < arr[largest])
            {
                if(res == Integer.MIN_VALUE || arr[i] > arr[res])
                {
                    res = i;
                }
            }
        }

        return res;
    }
}

public class EfficientSecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int cap = sc.nextInt();

        System.out.print("Enter the number of the array : ");
        int n = sc.nextInt();

        // calling of the method and print the second largest value
        SecondLargest sl = new SecondLargest(cap, n);
        System.out.println("The second largest element in the array is : "+ sl.arr[sl.secondLargest()]);

        System.out.println("The largest element in the array is : "+ sl.arr[sl.largest]);

    }
}
