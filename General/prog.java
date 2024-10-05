package General;
import General.package1.*;

public class prog {

    public static void main(String[] args) {
        circle ob = new circle();
        int x=ob.calculate(3);
        ob.display(x);
        System.out.println();

        rectangle obj = new rectangle();
        int y = obj.calculate(3, 4);
        obj.display(y);
    }
    
}
