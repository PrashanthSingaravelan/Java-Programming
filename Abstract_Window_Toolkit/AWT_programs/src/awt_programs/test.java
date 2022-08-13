package awt_programs;

import java.awt.*;
import java.awt.event.*;

class my_frame extends Frame    {
         Label l_obj;
         Checkbox c1_obj,c2_obj,c3_obj;
         
         public my_frame(String window_name_main)       {
                    super(window_name_main);
                    this.l_obj    = new Label("None of the check boxes are selected");
                    this.c1_obj = new Checkbox("Java");
                    this.c2_obj = new Checkbox("Python");
                    this.c3_obj = new Checkbox("Matlab");

                    setLayout(new FlowLayout());
                    this.add(l_obj);
                    this.add(c1_obj);
                    this.add(c2_obj);
                    this.add(c3_obj); 
         }    
}

public class test  {
        public static void main(String args[])      {
                   my_frame fr = new my_frame("Checkbox window");
                   fr.setSize(400,400);
                   fr.setVisible(true);
        }
}
