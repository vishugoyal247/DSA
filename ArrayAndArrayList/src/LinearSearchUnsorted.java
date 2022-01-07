import java.util.Scanner;


class Search
{
    int[] arr = null;

    public Search(int size)
    {
        arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

    }

    public int search(int ele)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (ele == arr[i])
            {
                return i;
            }
        }
        return -1;

    }
}


public class LinearSearchUnsorted
{

        public static void main(String[] args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();

            System.out.println("Enter the search element : ");
            int ele = sc.nextInt();

            Search S = new Search(size);
            System.out.println("The element index is " + S.search(ele));


        }
}


