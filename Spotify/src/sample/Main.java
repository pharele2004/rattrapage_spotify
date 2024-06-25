package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import BDD.Convert_Album;
import Factory.ControllerFactory;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize the Convert_Album instance
        Convert_Album convertAlbum = new Convert_Album("Spotify/src/BDD/test.json");

        // Load the FXML file and set the controller factory
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setControllerFactory(new ControllerFactory(convertAlbum));
        Parent root = loader.load();
        
        primaryStage.setTitle("app music java");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
