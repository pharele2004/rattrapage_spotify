package BDD;


import java.util.List;

/**
 * Représente un utilisateur de l'application.
 */
public class Utilisateur {
    private int id; // Identifiant unique de l'utilisateur
    private String nomUtilisateur; // Nom d'utilisateur
    private String email; // Adresse email de l'utilisateur
    private String motDePasse; // Mot de passe de l'utilisateur
    private List<Chanson> chansonsPreferees; // Liste des chansons préférées de l'utilisateur
    private List<Album> albumsPreferes; // Liste des albums préférés de l'utilisateur
    private List<Artiste> artistesPreferes; // Liste des artistes préférés de l'utilisateur
    private List<Avis> avis; // Liste des avis/commentaires laissés par l'utilisateur
    private List<Playlist> playlists; // Liste des playlists de l'utilisateur

    /**
     * Constructeur de la classe Utilisateur.
     *
     * @param id                 l'identifiant unique de l'utilisateur
     * @param nomUtilisateur     le nom d'utilisateur
     * @param email              l'adresse email de l'utilisateur
     * @param motDePasse         le mot de passe de l'utilisateur
     * @param chansonsPreferees  la liste des chansons préférées de l'utilisateur
     * @param albumsPreferes     la liste des albums préférés de l'utilisateur
     * @param artistesPreferes   la liste des artistes préférés de l'utilisateur
     * @param avis               la liste des avis/commentaires laissés par l'utilisateur
     * @param playlists          la liste des playlists de l'utilisateur
     */
    public Utilisateur(int id, String nomUtilisateur, String email, String motDePasse,
                       List<Chanson> chansonsPreferees, List<Album> albumsPreferes,
                       List<Artiste> artistesPreferes, List<Avis> avis, List<Playlist> playlists) {
        this.id = id;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
        this.chansonsPreferees = chansonsPreferees;
        this.albumsPreferes = albumsPreferes;
        this.artistesPreferes = artistesPreferes;
        this.avis = avis;
        this.playlists = playlists;
    }

    /**
     * Obtient l'identifiant unique de l'utilisateur.
     *
     * @return l'identifiant unique de l'utilisateur
     */
    public int getId() {
        return id;
    }

    /**
     * Définit l'identifiant unique de l'utilisateur.
     *
     * @param id l'identifiant unique de l'utilisateur
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtient le nom d'utilisateur.
     *
     * @return le nom d'utilisateur
     */
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    /**
     * Définit le nom d'utilisateur.
     *
     * @param nomUtilisateur le nom d'utilisateur
     */
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    /**
     * Obtient l'adresse email de l'utilisateur.
     *
     * @return l'adresse email de l'utilisateur
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit l'adresse email de l'utilisateur.
     *
     * @param email l'adresse email de l'utilisateur
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtient le mot de passe de l'utilisateur.
     *
     * @return le mot de passe de l'utilisateur
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * Définit le mot de passe de l'utilisateur.
     *
     * @param motDePasse le mot de passe de l'utilisateur
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    /**
     * Obtient la liste des chansons préférées de l'utilisateur.
     *
     * @return la liste des chansons préférées de l'utilisateur
     */
    public List<Chanson> getChansonsPreferees() {
        return chansonsPreferees;
    }

    /**
     * Définit la liste des chansons préférées de l'utilisateur.
     *
     * @param chansonsPreferees la liste des chansons préférées de l'utilisateur
     */
    public void setChansonsPreferees(List<Chanson> chansonsPreferees) {
        this.chansonsPreferees = chansonsPreferees;
    }

    /**
     * Obtient la liste des albums préférés de l'utilisateur.
     *
     * @return la liste des albums préférés de l'utilisateur
     */
    public List<Album> getAlbumsPreferes() {
        return albumsPreferes;
    }

    /**
     * Définit la liste des albums préférés de l'utilisateur.
     *
     * @param albumsPreferes la liste des albums préférés de l'utilisateur
     */
    public void setAlbumsPreferes(List<Album> albumsPreferes) {
        this.albumsPreferes = albumsPreferes;
    }

    /**
     * Obtient la liste des artistes préférés de l'utilisateur.
     *
     * @return la liste des artistes préférés de l'utilisateur
     */
    public List<Artiste> getArtistesPreferes() {
        return artistesPreferes;
    }

    /**
     * Définit la liste des artistes préférés de l'utilisateur.
     *
     * @param artistesPreferes la liste des artistes préférés de l'utilisateur
     */
    public void setArtistesPreferes(List<Artiste> artistesPreferes) {
        this.artistesPreferes = artistesPreferes;
    }

    /**
     * Obtient la liste des avis/commentaires laissés par l'utilisateur.
     *
     * @return la liste des avis/commentaires laissés par l'utilisateur
     */
    public List<Avis> getAvis() {
        return avis;
    }

    /**
     * Définit la liste des avis/commentaires laissés par l'utilisateur.
     *
     * @param avis la liste des avis/commentaires laissés par l'utilisateur
     */
    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    /**
     * Obtient la liste des playlists de l'utilisateur.
     *
     * @return la liste des playlists de l'utilisateur
     */
    public List<Playlist> getPlaylists() {
        return playlists;
    }

    /**
     * Définit la liste des playlists de l'utilisateur.
     *
     * @param playlists la liste des playlists de l'utilisateur
     */
    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    /**
     * Retourne une représentation textuelle de l'utilisateur.
     *
     * @return une chaîne de caractères représentant l'utilisateur
     */
    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nomUtilisateur='" + nomUtilisateur + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", chansonsPreferees=" + chansonsPreferees +
                ", albumsPreferes=" + albumsPreferes +
                ", artistesPreferes=" + artistesPreferes +
                ", avis=" + avis +
                ", playlists=" + playlists +
                '}';
    }
}
