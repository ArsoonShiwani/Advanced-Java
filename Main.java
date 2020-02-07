//Arsoon Shiwani
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Employee Manager 2000");
        primaryStage.setScene(new Scene(root, 800, 600)); // root is the backdrop of the scene
        primaryStage.show(); //without this nothing will display
    }


    public static void main(String[] args) {
        launch(args);
    }
}
