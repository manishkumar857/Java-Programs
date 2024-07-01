package Recursion;

public class Tilingprob {

    public static int tiling(int n) // n is the length of the tile breadth is already given 2
    {
        if(n==1 || n==0)
        {
            return 1;
        }

        //vertical choice 
        int fnm1 = tiling(n-1);

        //horizontal choice 
        int fnm2 = tiling(n-2);

        //total ways
        int totalways = fnm1+fnm2;
        return totalways;

    }
    public static void main(String args[])
    {
        System.out.print(tiling(4));

    }
}
