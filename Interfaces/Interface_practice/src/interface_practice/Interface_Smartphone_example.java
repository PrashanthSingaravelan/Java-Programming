package interface_practice;

class Phone {
    public void call()              { System.out.println("Phone call"); }
    public void message()    { System.out.println("Phone message");}
}

interface ICamera
{
    final static int X=10;
    public abstract void click();
    public abstract void record();
    public static void capture() {
            System.out.println("Capture a photo");
    }
}

interface IMusicPlayer 
{
    void play();
    void stop();
}

class Smartphone extends Phone implements ICamera,IMusicPlayer 
        {
    public void video_call()     {  System.out.println("Video-call in smart phone");     }
    public void click()                {  System.out.println("Photo click in smartphone");     }
    public void record()            {  System.out.println("Video record in smartphone"); }
    public void play()                {  System.out.println("Music play in smartphone");      }
    public void stop()                {  System.out.println("Music stop in smartphone");      }
        }

public class Interface_Smartphone_example {
public static void main(String args[]) {
           Smartphone obj1 = new Smartphone();
           obj1.call();
           
           Phone obj2 = new Smartphone();
           obj2.message();
                   
           ICamera obj3 = new Smartphone();
           obj3.

    }
}
