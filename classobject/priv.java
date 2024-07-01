package classobject;
public class priv {

   /*  private int getAre() //not accessible outside class
    {
        return 0;
    }*/
    final int getArea() // constant cannot be changed or overridden but accessable in sub class
    {
        return 0;
    }


    public static void main(String args[])
    {
        final float pi =3.14f;
       // pi = 3.4f; cannot be reassigned as its a constant
       System.out.println(pi);
       

    }
    
}
