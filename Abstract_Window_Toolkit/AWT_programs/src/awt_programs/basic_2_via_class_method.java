package awt_programs;

import java.awt.*;

class my_frame extends Frame {
        Label l_obj;
        Button b_obj;
        TextField tx_obj;
        
        public my_frame(String frame_name_main) {
            super(frame_name_main);
            setLayout(new FlowLayout());
            
            l_obj = new Label("Name");    
            b_obj = new Button("Click Here");       
            tx_obj = new TextField(20);
            
            this.add(l_obj);       this.add(tx_obj);     this.add(b_obj);        
        }
}

public class basic_2_via_class_method {
    public static void main(String args[]) {
            my_frame f1_obj = new my_frame("Prashanth window");     f1_obj.setSize(300,300);      f1_obj.setVisible(true);
            my_frame f2_obj = new my_frame("David window");            f2_obj.setSize(300,300);       f2_obj.setVisible(true);
    }
}
