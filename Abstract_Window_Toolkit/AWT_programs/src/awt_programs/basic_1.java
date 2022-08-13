package awt_programs;

import java.awt.*;
public class basic_1 {
    public static void main(String[] args) {
        Frame f_obj = new Frame("Prashanth window");
        f_obj.setLayout(new FlowLayout());  // all the components will be placed in their corresponding position without occupying the entire screen
        
        Label l_obj    = new Label("Name : ");
        Button b_obj = new Button("Click here");
        TextField tx_obj = new TextField(20);
        
        //  Adding the components to the frame
        f_obj.add(l_obj);            f_obj.add(tx_obj);                 f_obj.add(b_obj);
        
        f_obj.setSize(300,300);
        f_obj.setVisible(true);
    }
}
