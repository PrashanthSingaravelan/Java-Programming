package event_handling_concepts;

import java.awt.*;
import java.awt.event.*;

class select_frame extends Frame {
            Label l_obj;
            TextArea ta_obj;
            TextField tf_obj;
            Button b_obj;
            
            public select_frame(String window_name_main) {
                   super(window_name_main);
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
                // 1) Select specific text from the text area 
                // 2) Select click --> ta_obj.getSelectedText()
                // 3) The selected text will appear in the text field --> tf_obj.setText(ta_obj.getSelectedText());
                
                   tf_obj.setText(ta_obj.getSelectedText());
                }
            }
}

public class selecting_text {
    public static void main(String[] args) {
            select_frame s_obj = new select_frame("Textfield_Textevent");
            s_obj.setSize(400,400);
            s_obj.setVisible(true);
    }
}
