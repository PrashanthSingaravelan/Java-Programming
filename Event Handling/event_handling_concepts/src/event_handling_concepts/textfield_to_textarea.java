package event_handling_concepts;

import java.awt.*;
import java.awt.event.*;

class text_field_append extends Frame {
            Label l_obj;
            TextArea ta_obj;
            TextField tf_obj;
            Button b_obj;
            
         public  text_field_append(String frame_name_main) {
            
                   super(frame_name_main);
                   l_obj = new Label("No text entered");
                   ta_obj = new TextArea(10,30);  // the entire space for typing the text
                   tf_obj = new TextField(20);      // small box to type the text
                   b_obj  = new Button("Click");
                   
                   setLayout(new FlowLayout());

                   add(l_obj);
                   add(ta_obj);
                   add(tf_obj);
                   add(b_obj);

                   Handler h = new Handler();
                   b_obj.addActionListener(h);
            }
            
            class Handler implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // 1) Type some specific text in the textfield
                // 2) Select the click
                // 3) Text in the text filed will be appended in the Text area
                
                   ta_obj.append(tf_obj.getText());
                }
          }
}

public class textfield_to_textarea {
    public static void main(String[] args) {
            text_field_append t_obj = new text_field_append(
                    "Appending the text to Text area");
            t_obj.setSize(400,400);
            t_obj.setVisible(true);
    }
}
