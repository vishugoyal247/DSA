import java.util.Scanner;

public class TraillingZeroesFactorial
{
    public static void main(String[] args)
    {

        // Time complexity -->  O(n)

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the element to be find the factorial : ");
//        int n = sc.nextInt();
//
//        long fact = 1;
//        while(n-- > 1)
//        {
//            fact *= n;
//        }
//
//        int trailZero = 0;
//        while(fact!=0)
//        {
//            long d= fact%10;
//            if(d==0)
//            {
//                trailZero++;
//            }
//            fact/=10;
//        }
//
//        System.out.println("The number of trailing zeroes is : "+trailZero);




        // Time complexity -->  O(log n)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be find the factorial : ");
        int n = sc.nextInt();
        int  trailZero=0;
        while (n>4)
        {
            trailZero+=n/5;
            n/=5;
        }

        System.out.println("The number of trailing zeroes is : "+trailZero);








    }

}































