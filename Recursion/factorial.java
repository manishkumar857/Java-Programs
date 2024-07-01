package Recursion;

public class factorial {

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int Nm1= fact(n-1);
        int N  = n * Nm1;
    
        return N;
    }
    public static void main(String args[])
    {
        int n=10;
        System.out.println(fact(n));
    }
}
