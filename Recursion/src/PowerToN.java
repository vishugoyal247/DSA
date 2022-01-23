import java.util.Scanner;

public class PowerToN
{
    //head recursion
//    public int powerToN(int n,int x)
//    {
//        if(n==0)
//        {
//            return 1;
//        }
//        return x*powerToN(n-1,x);
//    }

    //tail recursion
    public void powerToN(int n,int x, int ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        powerToN(n-1,x,ans*x);
    }
}


class main
{
    public static void main(String[] args)
    {
        PowerToN obj = new PowerToN();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the power : ");
        int pow = sc.nextInt();
//        System.out.println(obj.powerToN(pow,num));   // Head recursion call
        obj.powerToN(pow,num,1);                   // Tail recursion call

    }
}
