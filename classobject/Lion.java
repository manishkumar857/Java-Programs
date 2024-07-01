package classobject;

public class Lion extends Animal {

    @Override
    public void eat()
    {
        System.out.println("hello");
    }
    public static void main(String args[])
    {
        Lion obj = new Lion();
         obj.eat();
    
    }

    
}
