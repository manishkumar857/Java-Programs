package Recursion;
import java.util.*;
public class areacir {

    public static double area(float r)
    {
        double a = 3.14*r*r;   
        return a;
    }
    public static double cir(float r)
    {
        double b = 2*3.14*r;
        return b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(area(r));
        System.out.println(cir(r));
        sc.close();

    }
}
