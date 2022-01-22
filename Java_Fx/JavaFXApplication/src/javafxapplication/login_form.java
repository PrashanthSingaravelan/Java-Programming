package javafxapplication;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class login_form extends Application {

     @Override 
     public void start(Stage stage) {      
         
      Text text1 = new Text("Email");        //creating label email CHILD NODES
      TextField textField1 = new TextField();         //Creating Text Filed for email  
      
      Text text2 = new Text("Password");     //creating label password 
      PasswordField textField2 = new PasswordField();   //Creating Text Filed for password    
       
      //Creating Buttons 
      Button button1 = new Button("Submit"); 
      Button button2 = new Button("Clear");  
      
      //Creating a Grid Pane ROOT
      GridPane gridPane = new GridPane();    
      
      gridPane.setMinSize(400, 200); //Setting size for the pane 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid connecting child to root
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(button1, 0, 2); 
      gridPane.add(button2, 1, 2); 
       
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
      text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
      gridPane.setStyle("-fx-background-color: BEIGE;"); 
       
      final Text actiontarget = new Text();
      gridPane.add(actiontarget, 1, 6);
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
                   @Override
	public void handle(ActionEvent e) {
                            actiontarget.setFill(Color.FIREBRICK);
                            actiontarget.setText("Sign in button pressed");
	}
                }           
        );
        
      Scene scene = new Scene(gridPane); 
      stage.setTitle("CSS Example"); 
      stage.setScene(scene);
      stage.show(); 
}      
     
public static void main(String args[]){ 
      launch(args); 
   } 
    
}
