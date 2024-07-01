package Recursion;

public class Fibonacci {

    public static int fib(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        int Nm1 = fib(n-1);
        int Nm2 = fib(n-2);

        int N = Nm1 + Nm2;
        return N;

    }
    public static void main(String args[])
    {
        
        int n =10;
        System.out.println(fib(n));
    }
    
}
