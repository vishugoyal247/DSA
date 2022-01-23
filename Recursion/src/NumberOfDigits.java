import java.util.Scanner;

public class NumberOfDigits
{
    // Head Recursion
//    public static int numberDigits(int n)
//    {
//        if(n==0)
//        {
//            return 0;
//        }
//        return 1+numberDigits(n/10);
//    }

    // Tail Recursion
    public static void numberDigits(int n,int ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

        numberDigits(n/10,ans+1);
    }
}

class main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
//        System.out.println(NumberOfDigits.numberDigits(num));   // Head Recursion calling
        NumberOfDigits.numberDigits(num,0);   // Tail Recursion calling
    }
}
