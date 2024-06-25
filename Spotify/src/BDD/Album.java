package BDD;


import java.util.Date;
import java.util.List;

/**
 * Représente un album musical.
 */
public class Album {
    private String titre; // Titre de l'album
    private Artiste artiste; // Artiste ou groupe qui a créé l'album
    private Date dateSortie; // Date de sortie de l'album
    private String genre; // Genre musical de l'album
    private List<Chanson> chansons; // Liste des chansons contenues dans l'album
    private double note; // Note moyenne attribuée par les utilisateurs
    private List<Avis> avis; // Liste des avis/commentaires des utilisateurs
    private String image; // Lien vers la pochette de l'album

    /**
     * Constructeur de la classe Album.
     *
     * @param titre       le titre de l'album
     * @param artiste     l'artiste ou groupe qui a créé l'album
     * @param dateSortie  la date de sortie de l'album
     * @param genre       le genre musical de l'album
     * @param chansons    la liste des chansons contenues dans l'album
     * @param note        la note moyenne attribuée par les utilisateurs
     * @param avis        la liste des avis/commentaires des utilisateurs
     * @param image       le lien vers la pochette de l'album
     */


     
    public Album(String titre, Artiste artiste, Date dateSortie, String genre, List<Chanson> chansons, double note, List<Avis> avis, String image) {
        this.titre = titre;
        this.artiste = artiste;
        this.dateSortie = dateSortie;
        this.genre = genre;
        this.chansons = chansons;
        this.note = note;
        this.avis = avis;
        this.image = image;
    }

    public Album() {
        //TODO Auto-generated constructor stub
    }

    /**
     * Obtient le titre de l'album.
     *
     * @return le titre de l'album
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit le titre de l'album.
     *
     * @param titre le nouveau titre de l'album
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Obtient l'artiste ou le groupe qui a créé l'album.
     *
     * @return l'artiste ou le groupe de l'album
     */
    public Artiste getArtiste() {
        return artiste;
    }

    /**
     * Définit l'artiste ou le groupe qui a créé l'album.
     *
     * @param artiste le nouvel artiste ou groupe de l'album
     */
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    /**
     * Obtient la date de sortie de l'album.
     *
     * @return la date de sortie de l'album
     */
    public Date getDateSortie() {
        return dateSortie;
    }

    /**
     * Définit la date de sortie de l'album.
     *
     * @param dateSortie la nouvelle date de sortie de l'album
     */
    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    /**
     * Obtient le genre musical de l'album.
     *
     * @return le genre musical de l'album
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Définit le genre musical de l'album.
     *
     * @param genre le nouveau genre musical de l'album
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Obtient la liste des chansons contenues dans l'album.
     *
     * @return la liste des chansons de l'album
     */
    public List<Chanson> getChansons() {
        return chansons;
    }

    /**
     * Définit la liste des chansons contenues dans l'album.
     *
     * @param chansons la nouvelle liste des chansons de l'album
     */
    public void setChansons(List<Chanson> chansons) {
        this.chansons = chansons;
    }

    /**
     * Obtient la note moyenne attribuée par les utilisateurs.
     *
     * @return la note moyenne de l'album
     */
    public double getNote() {
        return note;
    }

    /**
     * Définit la note moyenne attribuée par les utilisateurs.
     *
     * @param note la nouvelle note moyenne de l'album
     */
    public void setNote(double note) {
        this.note = note;
    }

    /**
     * Obtient la liste des avis/commentaires des utilisateurs.
     *
     * @return la liste des avis de l'album
     */
    public List<Avis> getAvis() {
        return avis;
    }

    /**
     * Définit la liste des avis/commentaires des utilisateurs.
     *
     * @param avis la nouvelle liste des avis de l'album
     */
    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    /**
     * Obtient le lien vers la pochette de l'album.
     *
     * @return le lien vers la pochette de l'album
     */
    public String getImage() {
        return image;
    }

    /**
     * Définit le lien vers la pochette de l'album.
     *
     * @param image le nouveau lien vers la pochette de l'album
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Retourne une représentation textuelle de l'album.
     *
     * @return une chaîne de caractères représentant l'album
     */
    @Override
    public String toString() {
        return "Album{" +
                "titre='" + titre + '\'' +
                ", artiste=" + artiste +
                ", dateSortie=" + dateSortie +
                ", genre='" + genre + '\'' +
                ", chansons=" + chansons +
                ", note=" + note +
                ", avis=" + avis +
                ", image='" + image + '\'' +
                '}';
    }
}
