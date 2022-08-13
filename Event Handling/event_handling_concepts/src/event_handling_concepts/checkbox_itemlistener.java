package event_handling_concepts;

import java.awt.*;
import java.awt.event.*;

class your_frame extends Frame implements ItemListener  {
         Label l_obj;
         Checkbox c1_obj,c2_obj,c3_obj;
         
         public your_frame(String window_name_main)       {
                    super(window_name_main);
                    this.l_obj    = new Label("None of the check boxes are selected");
                    this.c1_obj = new Checkbox("Java");
                    this.c2_obj = new Checkbox("Python");
                    this.c3_obj = new Checkbox("Matlab");
                    
                    c1_obj.addItemListener(this);
                    c2_obj.addItemListener(this);
                    c3_obj.addItemListener(this);

                    setLayout(new FlowLayout());
                    this.add(l_obj);
                    this.add(c1_obj);
                    this.add(c2_obj);
                    this.add(c3_obj); 
         }    

    @Override
    public void itemStateChanged(ItemEvent e) {
         String str1 = " ";
         if (c1_obj.getState())     {  str1 = str1 + " " + c1_obj.getLabel();      }
         if (c2_obj.getState())     {  str1 = str1 + " " + c2_obj.getLabel();      }
         if (c3_obj.getState())     {  str1 = str1 + " " + c3_obj.getLabel();      }
         
         l_obj.setText(str1);
    }
}

public class checkbox_itemlistener  {
        public static void main(String args[])      {
                   your_frame fr = new your_frame("Checkbox window");
                   fr.setSize(400,400);
                   fr.setVisible(true);
        }
}
