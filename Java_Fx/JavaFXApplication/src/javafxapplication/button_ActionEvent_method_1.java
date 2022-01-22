package javafxapplication;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.control.Button; // to include a button
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane; // button with the flow pane
import javafx.scene.Scene;    // flow pane with scene

import javafx.event.EventHandler;  // handle a event
import javafx.event.ActionEvent;    // what type of event --> ActionEvent [abstract method --> handle() ]

public class button_ActionEvent_method_1 extends Application implements EventHandler<ActionEvent>{
                                                                                                   // handling the event<type of event>
    
    // In-order to access in all the methods [start() and handle() , declaring the button and label]
         Button b_obj;  
         Label l_obj;
    
          int count=0;   // user will increment this value

    @Override
    public void start(Stage stage) throws Exception {
        
         b_obj = new Button("Click Here");
         b_obj.setPrefSize(100, 30); // (width,height)
         
         // Important connection
         b_obj.setOnAction(this);  // connecting the button with the event
         
         l_obj = new Label("To see the incremented value");
         l_obj.setPrefSize(300, 30);
         
                                                        // 1) button   2) label
         FlowPane fl_obj = new FlowPane(b_obj,l_obj);  // include the button with the flow pane
         
         Scene scene_obj = new Scene(fl_obj,400,400);  // include the flow pane with the scene
         stage.setTitle("Increment_Value");  // Title bar
         stage.setScene(scene_obj);             // include scene with the stage
         stage.show();                                    // to make visisble in the screen
    }
    
    @Override  // to handle the event
    public void handle(ActionEvent event) {
                count+=1;    // incrementing the count
                l_obj.setText("                   " + count);   // displaying the count
    }
    
    public static void main(String[] args) {
         launch(args);
    }
                
}

