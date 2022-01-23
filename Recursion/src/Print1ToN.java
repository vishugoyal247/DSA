import java.util.Scanner;

public class Print1ToN
{
    //Head Recursion
//    public static void printNumbers(int n)
//    {
//        if(n==0)
//        {
//            return;
//        }
//        printNumbers(n-1);
//        System.out.print(n+"  ");
//    }

    //Tail Recursion
    public static void printNumbers(int n,int x)
    {
        if(x==n)
        {
            System.out.print(x+"  ");
            return;
        }
        System.out.print(x+"  ");
        printNumbers(n,x+1);
    }
}

class main1
{
    public static void main(String[] args)
    {
        // Print number from 1 to N
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last range till the numbers printed : ");
        int n = sc.nextInt();
//        Print1ToN.printNumbers(n);   // Head calling
        Print1ToN.printNumbers(n,1); // Tail calling
    }
}
