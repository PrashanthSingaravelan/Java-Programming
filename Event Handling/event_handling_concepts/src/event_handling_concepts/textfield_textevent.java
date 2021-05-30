package event_handling_concepts;

import java.awt.*;
import java.awt.event.*;

class text_frame extends Frame {
            Label l_obj1,l_obj2;
            TextField tf_obj1;
            
         public  text_frame(String frame_name_main) {
                   super(frame_name_main);
                   
                   l_obj1 = new Label("No text is entered yet");
                   l_obj2 = new Label("Press enter to see the effect");
                   tf_obj1 = new TextField(20);
                   
                   Handler h = new Handler();
                   // Both the actions are going to be performed in the text box only
                   tf_obj1.addTextListener(h);
                   tf_obj1.addActionListener(h);
                   
                   this.setLayout(new FlowLayout());
                   this.add(l_obj1);
                   this.add(tf_obj1);
                   this.add(l_obj2);
            }            
         
            class Handler implements TextListener, ActionListener {
            @Override
            public void textValueChanged(TextEvent te) {   // while typing it-self, the text appears
                        l_obj1.setText(tf_obj1.getText());
                 }

            @Override
            public void actionPerformed(ActionEvent ae) {  // After clicking enter, the text will get updated
                        l_obj2.setText(tf_obj1.getText());
                }
          }
}

public class textfield_textevent {
    public static void main(String[] args) {
            text_frame t_obj = new text_frame("Textfield_Textevent");
            t_obj.setSize(400,400);
            t_obj.setVisible(true);
    }
}
