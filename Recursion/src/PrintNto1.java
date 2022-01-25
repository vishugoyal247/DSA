import java.util.Scanner;

public class PrintNto1
{
    public static void printNto1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
    }
}

class main9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int num = sc.nextInt();

        PrintNto1.printNto1(num);

    }
}