package classobject; 
public class Rectangle extends shape
        {
            int length;
            int breadth;
            public Rectangle (int length , int breadth)
            {
                this.length = length;
                this.breadth = breadth;   
                
            }

            @Override
            public int getArea()
            {
                return length*breadth;
            }

            public static void main(String args[])
           {
             Rectangle obj =new Rectangle(4,6);
             int area = obj.getArea();
             System.out.println(area);
           }


        }

    
    
