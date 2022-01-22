package javafxapplication;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class registration_form  extends Application {
    @Override 
   public void start(Stage stage) {    
      Text nameLabel = new Text("Name");        //Label for name 
      TextField nameText = new TextField();        //Text field for name  
       
      Text dobLabel = new Text("Date of birth");    //Label for date of birth 
      DatePicker datePicker = new DatePicker();     //date picker to choose date 
       
      Text genderLabel = new Text("gender");   //Label for gender
      
      ToggleGroup groupGender = new ToggleGroup();  //Toggle group of radio buttons       
      
      RadioButton maleRadio    = new RadioButton("male"); 
      RadioButton femaleRadio = new RadioButton("female"); 
      maleRadio.setToggleGroup(groupGender); 
      femaleRadio.setToggleGroup(groupGender); 
       
      Text reservationLabel = new Text("Permanent / temporary employee ");  //Label for reservation
      
      ToggleButton Reservation = new ToggleButton();   //Toggle button for reservation 
      ToggleButton yes   = new ToggleButton("Yes"); 
      ToggleButton no    = new ToggleButton("No"); 
      ToggleGroup groupReservation = new ToggleGroup(); 
      yes.setToggleGroup(groupReservation);   
      no.setToggleGroup(groupReservation); 
       
      Text technologiesLabel = new Text("Technologies Known");   //Label for technologies known 
      
      CheckBox javaCheckBox = new CheckBox("Super-viser");   //check box for education 
      javaCheckBox.setIndeterminate(false); 
      CheckBox dotnetCheckBox = new CheckBox("Administration"); 
      javaCheckBox.setIndeterminate(false); 
       
      //Label for education 
      Text educationLabel = new Text("Educational qualification"); 
      
      //list View for educational qualification 
      ObservableList<String> names = FXCollections.observableArrayList( 
         "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd"); 
      ListView<String> educationListView = new ListView<String>(names); 
      
      //Label for location 
      Text locationLabel = new Text("location"); 
      
      //Choice box for location 
      ChoiceBox locationchoiceBox = new ChoiceBox(); 
      locationchoiceBox.getItems().addAll
         ("Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam"); 
       
      Button buttonRegister = new Button("Register");  
      
      GridPane gridPane = new GridPane();    
      
      gridPane.setMinSize(500, 500); 
      
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(nameLabel, 0, 0); 
      gridPane.add(nameText, 1, 0); 
       
      gridPane.add(dobLabel, 0, 1);       
      gridPane.add(datePicker, 1, 1); 
      
      gridPane.add(genderLabel, 0, 2); 
      gridPane.add(maleRadio, 1, 2);       
      gridPane.add(femaleRadio, 2, 2); 
      gridPane.add(reservationLabel, 0, 3); 
      gridPane.add(yes, 1, 3);       
      gridPane.add(no, 2, 3);  
       
      gridPane.add(technologiesLabel, 0, 4); 
      gridPane.add(javaCheckBox, 1, 4);       
      gridPane.add(dotnetCheckBox, 2, 4);  
       
      gridPane.add(educationLabel, 0, 5); 
      gridPane.add(educationListView, 1, 5);      
       
      gridPane.add(locationLabel, 0, 6); 
      gridPane.add(locationchoiceBox, 1, 6);    
       
      gridPane.add(buttonRegister, 2, 8);      
      
      //Styling nodes   
      buttonRegister.setStyle(
         "-fx-background-color: darkslateblue; -fx-textfill: white;"); 
       
      nameLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      dobLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      genderLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      educationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      locationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
       
      //Setting the back ground color 
      gridPane.setStyle("-fx-background-color: BEIGE;");       
       
      Scene scene = new Scene(gridPane); 
      stage.setTitle("Registration Form"); 
      stage.setScene(scene);  
      stage.show(); 
   }   
   
   public static void main(String args[]){ 
            launch(args); 
   } 
    
}
