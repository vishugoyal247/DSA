import java.util.Scanner;

class Delete
{
    int[] arr = null;
    int n,cap;

    //constructor to initialize the values
    public Delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the array : ");
        cap = sc.nextInt();
        arr = new int[cap];

        System.out.print("Enter the no of the elements in the array : ");
        n = sc.nextInt();

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i <n ; i++)
        {
                arr[i] = sc.nextInt();
        }
    }
    // funciton for delete an element
    public void delete(int ele)
    {
        int i=0;
        for ( ; i < n; i++)
        {
            if(arr[i] == ele )
            {
                break;
            }
        }
        if(i!=n)
        {
            for (int j = i; j <n ; j++)
            {
                arr[j] = arr[j+1];
            }
            n = n-1;
        }
    }
    // function for print array
    public void printArray()
    {
        System.out.print("The elements of the array is : ");
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }


}


public class EfficientDeleteElementArray
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // creating a object of the Delete class for accessing the method outside the class.
        Delete d = new Delete();

        System.out.print("Enter the element you want to delete : ");
        int ele = sc.nextInt();

        // function calling
        d.delete(ele);
        d.printArray();

    }
}
