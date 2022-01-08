import java.util.Scanner;

class Reverse
{

    private int[] arr = null;
    private int n;
    public Reverse(int cap, int n)
    {
        arr= new int[cap];
        this.n = n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public void reverse()
    {
        int low=0,high=n-1;
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low ++;
            high --;
        }
        printArray();
    }

    private void printArray()
    {
        for (int i = 0; i <n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}

public class EfficientReverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capcity of the array : ");
        int cap = sc.nextInt();

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        Reverse r = new Reverse(cap, size);
        r.reverse();

    }
}
