package Recursion;

public class nnaturalno {

    public static int natural(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int Nm1 = natural(n-1);
        int N = n + Nm1;
        return N;
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.print(natural(n));

    }
}
