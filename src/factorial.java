public class factorial
{
    //head
//    public static long fact(long n)
//    {
//        if(n==0|| n==1)
//            return 1;
//        return n*fact(n-1);
//    }



    //head
//    public static long fact(long n,long ans)
//    {
//        if(n==1 || n==0)
//            return ans;
//        return fact(n-1,ans*n);
//
//    }



    //tail
    public static void fact(long n,long ans)
    {
        if(n==1 || n==0)
            System.out.println(ans);
        fact(n-1,ans*n);

    }


    public static void main(String[] args)
    {
//        System.out.println(fact(90));
//        System.out.println(fact(5,1));
          fact(5,1);
    }
}
