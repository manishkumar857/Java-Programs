package Recursion;

public class xpowern {
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x*xnm1;
        return xn;
    }

    public static int optimizedpower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int half = optimizedpower(x, n/2) ;
        int halfpower = half * half;
        int even = halfpower;
        if(n%2!=0)
        {
            int odd = x*halfpower;
            return odd;

        }
        return even;
    }
    public static void main(String args[])
    {
        System.out.println(power(2, 10));
        System.out.println(optimizedpower(2, 10));
    }
}
