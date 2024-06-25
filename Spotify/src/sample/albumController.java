package sample;

import BDD.Album;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class albumController {
    @FXML
    private ImageView img;

    @FXML
    private Label albumName;

    @FXML
    private Label artist;

    public void setData(Album album) {
        // Chargez l'image en utilisant un chemin relatif
        //Image image = new Image(album.getImage());
        
        Image image = new Image("file:Spotify/src/img/" + album.getImage());
        img.setImage(image);

        albumName.setText(album.getTitre());
        artist.setText(album.getArtiste().getNom());
    }
}
