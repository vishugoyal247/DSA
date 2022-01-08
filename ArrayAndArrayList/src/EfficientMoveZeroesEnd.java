import java.util.Scanner;

class MoveToEnd
{
    private int[] arr = null;
    private int n;

    //constructor of the program
    public MoveToEnd(int cap, int n)
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
    public void moveEnd()
    {
        int count = 0;
        for (int i = 0; i <n ; i++)
        {
            if( arr[i]!=0 )
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count ++;
            }

        }

    }



    // method for print an array
    public void printArray()
    {
        for (int i = 0; i <n ; i++)
        {
            System.out.print(arr[i]+"  ");

        }
    }

}

public class EfficientMoveZeroesEnd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capcity of the array : ");
        int cap = sc.nextInt();

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        MoveToEnd mv = new MoveToEnd(cap , size);
        mv.moveEnd();
        mv.printArray();


    }
}
