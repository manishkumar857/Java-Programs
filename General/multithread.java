package General;
public class multithread extends Thread {
    

    public void run(){
     for(int i =0;i<8;i++)
     {
        System.out.println("Manish");
     }
    }
    public static void main(String args[])
    {
        multithread m = new multithread();
        m.start();
    }
}
class SoundControl extends Thread{
    public void run(){
        System.out.println("SOUND CONTROL");
    }
}
class VideoControl extends Thread{
    public void run(){
        System.out.println("Video Control");
    }
}
//create 2 diff threads and call it one is printing table 