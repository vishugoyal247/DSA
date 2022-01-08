import java.util.Scanner;



class RemoveDuplicate
{
    private int[] arr=null;
    private  int res;

    public RemoveDuplicate(int[] arr,int size)
    {
        res = 1;
        this.arr = arr;
        for (int i = 0; i <size-1 ; i++)
        {
            if(arr[i] != arr[res-1])
            {
                arr[res] = arr[i];
                res ++;

            }
        }
    }

    public void printArray()
    {
        System.out.print("The final array is : ");
        for (int i = 0; i < res ; i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }

}



public class EfficientRemoveDuplicate
{
    static int[] arr = null;
    static int n;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        arr = new int[sc.nextInt()];

        System.out.print("Enter the size of the elements means number of the elements : ");
        n = sc.nextInt();

        new EfficientRemoveDuplicate();

        RemoveDuplicate rd = new RemoveDuplicate(arr, n);
        rd.printArray();
    }

    public EfficientRemoveDuplicate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array in sorted order : ");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
}
