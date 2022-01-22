package javafxapplication;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

// physical buttons on the screen
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.ToggleGroup;  // functionalities to the radio-button
import javafx.scene.layout.HBox;  // all the physical buttons are connected to their separate horizontal boxes
import javafx.geometry.Insets;  // For padding the contents
import javafx.scene.layout.VBox;  // these separate horizontal-boxes are added into the huge vertical-box

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.paint.Paint;    //  adding the color to the text
import javafx.scene.text.Font;   // to make the font modifications
import javafx.scene.text.FontPosture;  // Regular (or) Italic to the text
import javafx.scene.text.FontWeight;   // Normal (or) Bold to the text

public class checkbox_radiobutton_choicebox extends Application 
                                            implements EventHandler<ActionEvent>{
        
            Text t_1;
            RadioButton radio_1,radio_2,radio_3;
            CheckBox check_1,check_2,check_3;
            ChoiceBox<Integer> choice_1;
    
            @Override
            public void start(Stage stage) throws Exception {
                
                t_1 = new Text("Check box, Radio button and Choice Box using Java FX");
                // Adding the radio button to horizontal Box feature
               HBox h_text = new HBox();
               h_text.getChildren().addAll(t_1);
               
               // Just Simple Radio Button creation 
               radio_1 = new RadioButton("RED");
               radio_2 = new RadioButton("BLUE");
               radio_3 = new RadioButton("GREEN");
               
               // Adding the real radio button features
               ToggleGroup tg = new ToggleGroup();
               radio_1.setToggleGroup(tg);
               radio_2.setToggleGroup(tg);
               radio_3.setToggleGroup(tg);
               
               // Adding the radio button to horizontal Box feature
               HBox h_radio = new HBox();
               h_radio.getChildren().addAll(radio_1,radio_2,radio_3);
               h_radio.setSpacing(15);  // each check boxes will be separated by 15 units
               h_radio.setPadding(new Insets(10,10,10,10)); // from all the 4 directions, the spaces will be 10 units
               
               check_1 = new CheckBox("NORMAL");
               check_2 = new CheckBox("BOLD");
               check_3 = new CheckBox("ITALIC");
               
               // Adding the radio button to horizontal Box feature
               HBox h_check = new HBox();
               h_check.getChildren().addAll(check_1,check_2,check_3);
               h_check.setSpacing(15);  // each check boxes will be separated by 15 units
               h_check.setPadding(new Insets(10,10,10,10)); // from all the 4 directions, the spaces will be 10 units
               
               choice_1 = new ChoiceBox<>();
               choice_1.getItems().addAll(10,20,30,40);
               
               // Adding all the horizontal-box features into the vertical-box
               VBox vb = new VBox();
               vb.setSpacing(15);  // each check boxes will be separated by 15 units
               vb.setPadding(new Insets(10,10,10,10)); // from all the 4 directions, the spaces will be 10 units
               vb.getChildren().addAll(h_text,h_radio,h_check,choice_1);
               
               // Connecting all the objects on the screen with the ActionListener
               radio_1.setOnAction(this);     radio_2.setOnAction(this);       radio_3.setOnAction(this);
               check_1.setOnAction(this);    check_2.setOnAction(this);      check_3.setOnAction(this);
               choice_1.setOnAction(this);
               
               Scene sc = new Scene(vb,500,500);
               stage.setTitle("Text Properties");
               stage.setScene(sc);
               stage.show();
          }
            
          @Override  // event handling
          public void handle(ActionEvent event) {
                
                // if the radio_buttons are selected, the required color is applied.
                if (radio_1.isSelected()) {     t_1.setFill(Paint.valueOf("RED"));           }
                if (radio_2.isSelected()) {     t_1.setFill(Paint.valueOf("BLUE"));         }
                if (radio_3.isSelected()) {     t_1.setFill(Paint.valueOf("GREEN"));      }
                
                // if the check boxes are selected, the required font is applied.
                FontWeight fw  = FontWeight.NORMAL;    // Normal (or) Bold to the text
                FontPosture fp = FontPosture.REGULAR;   // Regular (or) Italic to the text
                
                // if (check_1.isSelected())   { fw = FontWeight.NORMAL; }  -->  Normal is the deafault one
                if (check_2.isSelected())   { fw = FontWeight.BOLD; } 
                if (check_3.isSelected())   { fp = FontPosture.ITALIC; } 
                
                // applying the check_box selected and the choice_box value to the text
                t_1.setFont(Font.font("Calibri", fw,fp,choice_1.getValue()  ) );
         }
    
            public static void main(String[] args) {
                     launch(args);
        }
}
