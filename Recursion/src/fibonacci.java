import java.util.Scanner;

public class fibonacci
{
    public static int fib(int n)
    {
        if(n==1  || n==0)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}

// 0  1  1  2  3  5

class main8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth fibonacci number you want : ");
        int num = sc.nextInt();
        System.out.println("The nth fibonnacci number is "+fibonacci.fib(num-1));
    }
}