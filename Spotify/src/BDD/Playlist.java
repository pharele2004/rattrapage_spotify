package BDD;



import java.util.Date;
import java.util.List;

/**
 * Représente une playlist créée par un utilisateur.
 */
public class Playlist {
    private int id; 
    private String titre; 
    private Utilisateur utilisateur; 
    private List<Chanson> chansons; 
    private Date dateCreation; 

    /**
     * Constructeur de la classe Playlist.
     *
     * @param id            l'identifiant unique de la playlist
     * @param titre         le titre de la playlist
     * @param utilisateur   l'utilisateur qui a créé la playlist
     * @param chansons      la liste des chansons dans la playlist
     * @param dateCreation  la date de création de la playlist
     */
    public Playlist(int id, String titre, Utilisateur utilisateur, List<Chanson> chansons, Date dateCreation) {
        this.id = id;
        this.titre = titre;
        this.utilisateur = utilisateur;
        this.chansons = chansons;
        this.dateCreation = dateCreation;
    }

    /**
     * Obtient l'identifiant unique de la playlist.
     *
     * @return l'identifiant unique de la playlist
     */
    public int getId() {
        return id;
    }

    /**
     * Définit l'identifiant unique de la playlist.
     *
     * @param id l'identifiant unique de la playlist
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtient le titre de la playlist.
     *
     * @return le titre de la playlist
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit le titre de la playlist.
     *
     * @param titre le titre de la playlist
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Obtient l'utilisateur qui a créé la playlist.
     *
     * @return l'utilisateur qui a créé la playlist
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Définit l'utilisateur qui a créé la playlist.
     *
     * @param utilisateur l'utilisateur qui a créé la playlist
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    /**
     * Obtient la liste des chansons dans la playlist.
     *
     * @return la liste des chansons dans la playlist
     */
    public List<Chanson> getChansons() {
        return chansons;
    }

    /**
     * Définit la liste des chansons dans la playlist.
     *
     * @param chansons la liste des chansons dans la playlist
     */
    public void setChansons(List<Chanson> chansons) {
        this.chansons = chansons;
    }

    /**
     * Obtient la date de création de la playlist.
     *
     * @return la date de création de la playlist
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Définit la date de création de la playlist.
     *
     * @param dateCreation la date de création de la playlist
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Retourne une représentation textuelle de la playlist.
     *
     * @return une chaîne de caractères représentant la playlist
     */
    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", utilisateur=" + utilisateur +
                ", chansons=" + chansons +
                ", dateCreation=" + dateCreation +
                '}';
    }

    public void setTitre(List<Chanson> playlistChansons) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitre'");
    }
}
