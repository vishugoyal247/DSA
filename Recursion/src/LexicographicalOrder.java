public class LexicographicalOrder
{
    public static void lexi(int inital, int end)
    {
        if(inital > end)
            return;
        System.out.print(inital+" ");
        int i=0;
        if(inital == 0)
            i=1;
        while ((i  <  10 ))
        {
            lexi(inital*10+i, end);
            i++;
        }
    }
}


class  main12
{
    public static void main(String[] args)
    {
        LexicographicalOrder.lexi(0,1000);

    }
}