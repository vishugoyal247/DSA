import java.util.Scanner;

class RemoveDuplicates
{

    private int[] arr= null;
    private int n;
    private int res;
    public RemoveDuplicates(int cap, int n)
    {
        arr= new int[cap];
        this.n = n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter all the elements of the array in sorted ways : ");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }


    public void removeDuplicate()
    {
        int[] temp = new int[n];
        temp[0] = arr[0];
        res = 1;
        for (int i = 1; i <n; i++)
        {
            if(temp[res-1]!=arr[i])
            {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i <res ; i++)
        {
            arr[i] = temp[i];
        }


        printArray();

    }

    private void printArray()
    {

        System.out.print("The final array is : ");
        for (int i = 0; i <res ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }


}


public class NaiveRemoveDuplicates
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int cap = sc.nextInt();
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        RemoveDuplicates rd = new RemoveDuplicates(cap,size);
        rd.removeDuplicate();




    }
}
