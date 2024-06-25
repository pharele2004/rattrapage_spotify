package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import BDD.Album;
import BDD.Convert_Album;

public class Controller implements Initializable {

    @FXML
    private HBox recentlyPlayedContainer;

    @FXML
    private HBox favoriteContainer;

    private final Convert_Album convertAlbum;

    public Controller(Convert_Album convertAlbum) {
        this.convertAlbum = convertAlbum;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Ensure convertAlbum is not null
        if (convertAlbum != null) {
            List<Album> recentlyPlayed = convertAlbum.loadAlbums();
            List<Album> favorites = getFavorites();

            try {
                for (Album album : recentlyPlayed) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("song.fxml"));

                    VBox vBox = fxmlLoader.load();
                    albumController albumController = fxmlLoader.getController();
                    albumController.setData(album);

                    recentlyPlayedContainer.getChildren().add(vBox);
                }

                for (Album album : favorites) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("song.fxml"));

                    VBox vBox = fxmlLoader.load();
                    albumController albumController = fxmlLoader.getController();
                    albumController.setData(album);

                    favoriteContainer.getChildren().add(vBox);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Convert_Album instance is null");
        }
    }

    private List<Album> getFavorites() {
        // Placeholder for favorites - you can load actual favorite albums here
        return List.of();
    }
}
