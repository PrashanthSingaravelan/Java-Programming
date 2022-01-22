package javafxapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.TextArea;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class textarea_slider extends Application 
                                     implements EventHandler<ActionEvent>{
        
         TextArea ta = new TextArea();
         Slider sl = new Slider(10,50,10);   // minimum value,maximum value,initial value
        
         @Override
         public void start(Stage stage) throws Exception {
             ta.setPrefColumnCount(100);
             ta.setPrefRowCount(20);

             sl.setMajorTickUnit(5);         // entire slider is divided into 5 segments
             sl.setShowTickMarks(true); // setting the slider to the window
             
             sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));
             // getting the value from the slider --> sl.getValue()
             // Setting the required font --> ta.setFont(Font.font())
             // addListener
             
             VBox vb = new VBox();
             vb.getChildren().addAll(ta,sl);
             
             Scene sc = new Scene(vb,500,500);
             stage.setTitle("Font Slider");
             stage.setScene(sc);
             stage.show();
         }
    
    public static void main(String[] args) {
                     launch(args);
        }

    @Override
    public void handle(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

