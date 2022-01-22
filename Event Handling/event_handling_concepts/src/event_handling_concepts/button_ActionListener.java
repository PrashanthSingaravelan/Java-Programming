package event_handling_concepts;

import java.awt.*;
import java.awt.event.*;

class my_frame extends Frame implements ActionListener{    
    int cnt=0;
    Button b_obj;
    Label l_obj;

my_frame(String frame_name_main) {
          super(frame_name_main);
          l_obj   = new Label("                 " + cnt);
          b_obj  = new Button("Click");
          
          // event must be registered with the listener
          b_obj.addActionListener(this);    
          // button(component) is now registered with the frame object (which itself act as a listener )
          // since Frame class implements the ActionListener interface.
          // so button clicking (event) is now registered with the ActionListener interface.
        
          setLayout(new FlowLayout());
          this.add(l_obj);
          this.add(b_obj);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
         // what to do when the button is clicked ?????
         cnt+=1;                                             // increment the button
         l_obj.setText("                 "+ cnt);    // and then display the incremented value
    }
}

public class button_ActionListener {
    public static void main(String args[]) {
            my_frame fr = new my_frame("Increment window");
            fr.setSize(400,400);
            fr.setVisible(true);
    }
}
