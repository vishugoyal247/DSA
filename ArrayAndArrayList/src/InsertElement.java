import java.util.Scanner;



public class InsertElement
{
    static int[] arr ;
    public static void insert(int pos, int ele)
    {
        try
        {
            if(arr[pos] == 0)
            {
                arr[pos - 1] = ele;
            }
            else
            {
                System.out.println("Already filled");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.print("Enter the No of the elements of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        System.out.print("Enter the insert value : ");
        int ele = sc.nextInt();
        insert(pos, ele);

    }
}
