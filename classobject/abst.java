package classobject;
// abstract no need to define the object  
abstract public class abst {
    abstract void launcher(); // method not having the body or implementation
    abstract void laun();
    
}
abstract class Andriodrunner extends abst {

    void launcher()
    {
        System.out.println("launcher");
    }

    public static void main(String args[])
    {

    }
// ABSTRACT CLASS can be there without abstract method also.

public interface interfaceP {

    void laun();
    int x =10;
    //x=11; not allowed as it is final (constant )
    
}

// inside interface only abstract method are allowed
//inside interface any variable is by default final
    
interface I2 extends interfaceP{

}

class Runner implements interfaceP{
    @Override
    public void laun()
    {
        System.out.println("hi");
    }
}
}
