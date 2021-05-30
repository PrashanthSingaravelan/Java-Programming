package event_handling_concepts;

import java.awt.*;
import java.awt.event.*;

   class radio_frame extends Frame implements ItemListener {
                   Label l_obj;
                   Checkbox c1_obj,c2_obj,c3_obj;
                   CheckboxGroup grp_obj;
                   
                   public radio_frame(String frame_name) {
                            super(frame_name);
                            l_obj       = new Label("Nothing is Selected");
                            grp_obj  = new CheckboxGroup();

                            c1_obj = new Checkbox("Java" , false , grp_obj);
                            c2_obj = new Checkbox("Python" , false , grp_obj);
                            c3_obj = new Checkbox("Matlab" , false , grp_obj);

                            c1_obj.addItemListener(this);
                            c2_obj.addItemListener(this);
                            c3_obj.addItemListener(this);

                            this.setLayout(new FlowLayout());

                             this.add(l_obj);
                             this.add(c1_obj);
                             this.add(c2_obj);
                             this.add(c3_obj);
                   }

         @Override
         public void itemStateChanged(ItemEvent e) {
                   if (c1_obj.getState()) { l_obj.setText(c1_obj.getLabel()); }
                   if (c2_obj.getState()) { l_obj.setText(c2_obj.getLabel()); }
                   if (c3_obj.getState()) { l_obj.setText(c3_obj.getLabel()); }
            }
   }

public class radiobutton_ItemListener {
    public static void main(String[] args) {
            radio_frame frame_obj = new radio_frame("Radio-Button selection");
            frame_obj.setSize(400,400);
            frame_obj.setVisible(true);
    }  
}
