import java.util.Scanner;

class ShiftedZeroes
{

    private int[] arr = null;
    private int n;

    // constructor
    public ShiftedZeroes(int cap, int n)
    {
        Scanner sc = new Scanner(System.in);
        arr= new int[cap];
        this.n = n;
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    // Method for shifted all zeroes to the end
    public void shiftedEnd()
    {
        for (int i = 0; i <n ; i++)
        {
            if(arr[i]==0)
            {
                for (int j = i+1; j <n ; j++)
                {
                    if(arr[j]!=0)
                    {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }

                }
            }
        }
    }


    // Method for printing the whole array
    public void printArray()
    {
        for (int i = 0; i <n ; i++)
        {
            System.out.print(arr[i] +"  ");
        }
    }

}

public class NaiveMoveZeroesEnd
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int cap = sc.nextInt();

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        ShiftedZeroes sz = new ShiftedZeroes(cap, n);
        sz.shiftedEnd();
        sz.printArray();



    }
}
