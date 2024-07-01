package General;
import java.util.*;
public class areacir {

    public static double area(int r)
    {
        double a = 3.14*r*r;
        return a;
    }
    public static double cir(int r)
    {
        double b = 2*3.14*r;
        return b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(area(r));
        System.out.println(cir(r));
        sc.close();

    }
}
