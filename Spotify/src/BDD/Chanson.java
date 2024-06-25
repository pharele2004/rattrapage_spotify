package BDD;



import java.util.Date;
import java.util.List;

/**
 * Représente une chanson ou une piste musicale.
 */
public class Chanson {
    private String titre;
    private String artiste;
    private String album;
    private List<String> genres;
    private Date dateSortie;
    private int duree;
    private String spotifyUrl;

    // Constructeur
    public Chanson(String titre, String artiste, String album, List<String> genres, Date dateSortie, int duree, String spotifyUrl) {
        this.titre = titre;
        this.artiste = artiste;
        this.album = album;
        this.genres = genres;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.spotifyUrl = spotifyUrl;
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSpotifyUrl() {
        return spotifyUrl;
    }

    public void setSpotifyUrl(String spotifyUrl) {
        this.spotifyUrl = spotifyUrl;
    }


    @Override
public String toString() {
    return "Chanson{" +
            "titre='" + titre + '\'' +
            ", artiste='" + artiste + '\'' +
            ", album='" + album + '\'' +
            ", genres=" + genres +
            ", dateSortie=" + dateSortie +
            ", duree=" + duree +
            ", spotifyUrl='" + spotifyUrl + '\'' +
            '}';
}

}
