package Recursion;

public class printnatno {
    

    public static void natural(int n)
    {

        if(n==11 )
        {
            return;
        }

    
        System.out.println( n );

        natural(n+1);

    
    }

    public static void main(String args[])
    {

        natural(0);

    }
}
