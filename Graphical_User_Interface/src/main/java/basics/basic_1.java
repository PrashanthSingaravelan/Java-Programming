package basics;
import java.awt.*;

public class basic_1 {
    public static void main(String args[]) {
           Frame f_obj = new Frame("Prashanth Window");
           f_obj.setLayout(new FlowLayout());
           
           Button b_obj = new Button("Click");
           Label l_obj     = new Label("Enter your name : ");
           TextField t_obj      = new TextField(20);
           
           f_obj.add(b_obj);
           f_obj.add(l_obj);
           f_obj.add(t_obj);
           
           f_obj.setSize(300,300);
           f_obj.setVisible(true);
    }
}
