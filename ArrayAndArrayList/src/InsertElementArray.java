import java.util.Scanner;

class Insert
{
    int[] arr = null;
    int n = 0;

    // for initialize an array
    public  Insert(int cap)
    {
        arr = new int[cap];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the elements in array : ");
        n = sc.nextInt();
        System.out.print("Enter the element of the array ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    // for insert a value inside an array
    public void insert(int ele, int pos, int cap)
    {
        if(cap == n)
        {
            System.out.println("The array have not any empty space ");
            return;
        }


        for (int i = n; i >pos-1 ; i--)
        {
                arr[i] = arr[i-1];
        }
        arr[pos-1] = ele;
        n = n+1;

    }

    // for printing the array
    public void printArray()
    {
        System.out.print("The whole new array is : ");
        for (int i = 0; i <n ; i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
}

public class InsertElementArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int cap = sc.nextInt();

        Insert t = new Insert(cap);

        System.out.print("Enter the element to be inserted : ");
        int ele = sc.nextInt();

        System.out.print("Enter the position of the inserted element : ");
        int pos = sc.nextInt();

        // calling to insert an element
        t.insert(ele,pos,cap);
        // for print the array
        t.printArray();

    }
}
