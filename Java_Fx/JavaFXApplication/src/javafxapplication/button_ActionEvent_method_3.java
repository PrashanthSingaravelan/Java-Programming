package javafxapplication;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

import javafx.scene.control.Button; // to include a button
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane; // button with the flow pane
import javafx.scene.Scene;    // flow pane with scene

public class button_ActionEvent_method_3 extends Application {
         // In-order to access in all the methods [start() and handle() , declaring the button and label]
         Button b_obj;  
         Label l_obj;
         int count = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
         b_obj = new Button("Click Here");
         b_obj.setPrefSize(100, 30); // (width,height)
         l_obj = new Label("To see the incremented value");
         l_obj.setPrefSize(300, 30);
         
         // using lambda expression
         b_obj.setOnAction(e->{
             count++;
             l_obj.setText("     " + count); 
         } );
         
         FlowPane fl_obj = new FlowPane(b_obj,l_obj);  // include the button with the flow pane
         Scene scene_obj = new Scene(fl_obj,400,400);  // include the flow pane with the scene
         stage.setTitle("Increment_Value");  // Title bar
         stage.setScene(scene_obj);             // include scene with the stage
         stage.show();                                    // to make visisble in the screen

}
    
    public static void main(String[] args) { 
        launch(args);
    }
}

