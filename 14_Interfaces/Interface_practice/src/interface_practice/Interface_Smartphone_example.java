package interface_practice;

interface ICamera       {
    final static int X=10;
    public abstract void click();
    public abstract void record();
    public static void capture()    { System.out.println("Capture a photo"); }
}

interface IMusicPlayer {
    void play();
    void stop();
}

class Phone {
    public void call()        { System.out.println("Phone call");     }
    public void message()    { System.out.println("Phone message");  }
}

class Smartphone extends Phone implements ICamera,IMusicPlayer  {
            // smart-phone features
    public void video_call()   {  System.out.println("Video-call in smart phone");     }

    // iCamera's interface
    @Override
    public void click()      {  System.out.println("Photo click in smartphone");     }
    @Override
    public void record()     {  System.out.println("Video record in smartphone"); }

    // iMusicPlayer's interface
    @Override
    public void play()       {  System.out.println("Music play in smartphone");      }
    @Override
    public void stop()       {  System.out.println("Music stop in smartphone");      }
}

public class Interface_Smartphone_example {
    public static void main(String args[]) {
        Smartphone obj1 = new Smartphone();
        obj1.call(); // phone's method

// Now i am using my Phone just as a normal phone
        Phone obj2 = new Smartphone();
        obj2.message();   // phone's method

// Now i am using my Phone for Music purpose
        IMusicPlayer obj3 = new Smartphone();
        obj3.play(); // iMusicPlayer's method

// Now i am using my Phone for Camera purpose
        ICamera obj4 = new Smartphone();
        obj4.click();   // iCamera's method   
    }
}
