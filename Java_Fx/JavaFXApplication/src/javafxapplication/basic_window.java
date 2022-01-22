package javafxapplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class basic_window extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
            stage.setTitle("Title bar");
            stage.show();
        }

    public static void main(String[] args) {
            launch(args);
    }
    
}
