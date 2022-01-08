

import java.util.Scanner;

class Sorted
{
    private int[] arr = null;
    private int n;
    private int flag =1;

    //constructor of the program
    public Sorted(int cap, int n)
    {
        arr= new int[cap];
        this.n = n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }



    // Main logic of the program
    private void increasingSorted()
    {
        for (int i = 0; i <n-1 ; i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag =0;
                break;
            }
        }
        if(flag == 1 )
            System.out.println("The array is increasing order");
        else
            System.out.println("The array is not a sorted order");
    }

    private void decreasingSorted()
    {
        for (int i = 0; i <n-1 ; i++)
        {
            if(arr[i]<arr[i+1])
            {
                flag =0;
                break;
            }
        }
        if(flag == 1 )
            System.out.println("The array is decreasing order");
        else
            System.out.println("The array is not a sorted order");
    }

    public void sorted()
    {
        if(arr[0]<arr[n-1])
        {
            increasingSorted();
        }
        else
        {
            decreasingSorted();
        }
    }




}

public class EfficientSorted
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capcity of the array : ");
        int cap = sc.nextInt();

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        Sorted s  = new Sorted(cap, size);
        s.sorted();



    }
}


