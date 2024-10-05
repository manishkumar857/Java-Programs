package General;

class student {
    String name = "Manish";
    int reg=12212570;
    int sub1=20;
    int sub2=30;
    int sub3=98;
}

class result extends student{

    void marks(){
    int result1=(sub1+sub2+sub3)/3;
    System.out.println("Name : "+name);
    System.out.println("registration no. : "+reg);
    System.out.println("average marks : "+result1);
    }


}

public class studinh {
    public static void main(String[] args) {
        result r = new result();
        r.marks();
    } 
}
