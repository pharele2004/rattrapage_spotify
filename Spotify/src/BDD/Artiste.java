package BDD;



import java.util.ArrayList;
import java.util.List;

/**
 * Représente un artiste ou un groupe musical.
 */
public class Artiste {
    private int id; // Identifiant unique de l'artiste
    private String nom; // Nom de l'artiste ou du groupe
    private String biographie; // Biographie de l'artiste
    private String genre; // Genre musical principal de l'artiste
    private List<Album> albums; // Liste des albums de l'artiste
    private List<Chanson> chansons; // Liste des chansons de l'artiste
    private String image; // Lien vers la photo de l'artiste

    /**
     * Constructeur de la classe Artiste.
     *
     * @param id           l'identifiant unique de l'artiste
     * @param nom          le nom de l'artiste ou du groupe
     * @param biographie   la biographie de l'artiste
     * @param genre        le genre musical principal de l'artiste
     * @param albums       la liste des albums de l'artiste
     * @param chansons     la liste des chansons de l'artiste
     * @param image        le lien vers la photo de l'artiste
     */
    public Artiste(int id, String nom, String biographie, String genre, List<Album> albums, List<Chanson> chansons, String image) {
        this.id = id;
        this.nom = nom;
        this.biographie = biographie;
        this.genre = genre;
        this.albums = albums;
        this.chansons = chansons;
        this.image = image;
    }

    public Artiste(String string, String string2, String string3, Object object, ArrayList<Album> arrayList,
            String string4) {
        //TODO Auto-generated constructor stub
    }

    /**
     * Obtient l'identifiant unique de l'artiste.
     *
     * @return l'identifiant unique de l'artiste
     */
    public int getId() {
        return id;
    }

    /**
     * Définit l'identifiant unique de l'artiste.
     *
     * @param id l'identifiant unique de l'artiste
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtient le nom de l'artiste ou du groupe.
     *
     * @return le nom de l'artiste ou du groupe
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'artiste ou du groupe.
     *
     * @param nom le nom de l'artiste ou du groupe
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient la biographie de l'artiste.
     *
     * @return la biographie de l'artiste
     */
    public String getBiographie() {
        return biographie;
    }

    /**
     * Définit la biographie de l'artiste.
     *
     * @param biographie la biographie de l'artiste
     */
    public void setBiographie(String biographie) {
        this.biographie = biographie;
    }

    /**
     * Obtient le genre musical principal de l'artiste.
     *
     * @return le genre musical principal de l'artiste
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Définit le genre musical principal de l'artiste.
     *
     * @param genre le genre musical principal de l'artiste
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Obtient la liste des albums de l'artiste.
     *
     * @return la liste des albums de l'artiste
     */
    public List<Album> getAlbums() {
        return albums;
    }

    /**
     * Définit la liste des albums de l'artiste.
     *
     * @param albums la liste des albums de l'artiste
     */
    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    /**
     * Obtient la liste des chansons de l'artiste.
     *
     * @return la liste des chansons de l'artiste
     */
    public List<Chanson> getChansons() {
        return chansons;
    }

    /**
     * Définit la liste des chansons de l'artiste.
     *
     * @param chansons la liste des chansons de l'artiste
     */
    public void setChansons(List<Chanson> chansons) {
        this.chansons = chansons;
    }

    /**
     * Obtient le lien vers la photo de l'artiste.
     *
     * @return le lien vers la photo de l'artiste
     */
    public String getImage() {
        return image;
    }

    /**
     * Définit le lien vers la photo de l'artiste.
     *
     * @param image le lien vers la photo de l'artiste
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Retourne une représentation textuelle de l'artiste.
     *
     * @return une chaîne de caractères représentant l'artiste
     */
    @Override
    public String toString() {
        return "Artiste{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", biographie='" + biographie + '\'' +
                ", genre='" + genre + '\'' +
                ", albums=" + albums +
                ", chansons=" + chansons +
                ", image='" + image + '\'' +
                '}';
    }
}
