package awt_programs;

import java.awt.*;

public class basic_3_via_main_method extends Frame{
    public static void main(String args[]) {
            Button b_obj      = new Button("Click here");
            TextField tx_obj = new TextField(20);
            Label l_obj         = new Label("Name");
            
            Frame fr_obj = new Frame("Prashant Window");
            fr_obj.setLayout(new FlowLayout());
            
            fr_obj.add(l_obj);       fr_obj.add(tx_obj);     fr_obj.add(b_obj);
            
            fr_obj.setSize(400,400);
            fr_obj.setVisible(true);
    }
}

