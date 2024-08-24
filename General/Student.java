package General;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    static int reg;
    static String name;
    static int att;
    static int[] sub = new int[5];

    public void get_detail(int i,String n,int s)
    {
        reg = i;
        name=n;
        att = s;
    }

    public static void display(){
        
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum = sum +sub[i];
        }

        System.out.println("registration number is "+reg+" name is "+name+" attendance is  "+att+" total marks is "+sum);

    }
    public static void attendance()
    {
        int am;
        if(att>90)
        {
            am = 5;
        }
        else if(att<90 && att>80)
        {
            am=4;
        }
        else if(att<80 && att>70)
        {
            am=3;
        }
        else if(att<70 && att>60)
        {
            am=2;
        }
        else if()

    }

    public static void main(String[] args) {

        System.out.println("enter the registration number");
        Student.reg=sc.nextInt();

        System.out.println("enter the name");
        Student.name=sc.next();

        System.out.println("enter the attendance");
        Student.att=sc.nextInt();

        System.out.println("enter the 5 subject marks");
        for(int i=0;i<5;i++)
        {
            sub[i]=sc.nextInt();
        }

        display();
        
        
    }

}

    

