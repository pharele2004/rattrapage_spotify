package BDD;


import java.util.Date;

/**
 * Représente un avis ou commentaire d'un utilisateur sur une chanson ou un album.
 */
public class Avis {
    private Utilisateur utilisateur; // Utilisateur qui laisse l'avis
    private Chanson chanson; // Chanson concernée par l'avis
    private Album album; // Album concerné par l'avis
    private int note; // Note attribuée par l'utilisateur
    private String commentaire; // Commentaire laissé par l'utilisateur
    private Date date; // Date de l'avis

    /**
     * Constructeur de la classe Avis.
     *
     * @param utilisateur l'utilisateur qui laisse l'avis
     * @param chanson     la chanson concernée par l'avis
     * @param album       l'album concerné par l'avis
     * @param note        la note attribuée
     * @param commentaire le commentaire laissé par l'utilisateur
     * @param date        la date de l'avis
     */
    public Avis(Utilisateur utilisateur, Chanson chanson, Album album, int note, String commentaire, Date date) {
        this.utilisateur = utilisateur;
        this.chanson = chanson;
        this.album = album;
        this.note = note;
        this.commentaire = commentaire;
        this.date = date;
    }

    /**
     * Obtient l'utilisateur qui laisse l'avis.
     *
     * @return l'utilisateur qui laisse l'avis
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Définit l'utilisateur qui laisse l'avis.
     *
     * @param utilisateur l'utilisateur qui laisse l'avis
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    /**
     * Obtient la chanson concernée par l'avis.
     *
     * @return la chanson concernée par l'avis
     */
    public Chanson getChanson() {
        return chanson;
    }

    /**
     * Définit la chanson concernée par l'avis.
     *
     * @param chanson la chanson concernée par l'avis
     */
    public void setChanson(Chanson chanson) {
        this.chanson = chanson;
    }

    /**
     * Obtient l'album concerné par l'avis.
     *
     * @return l'album concerné par l'avis
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Définit l'album concerné par l'avis.
     *
     * @param album l'album concerné par l'avis
     */
    public void setAlbum(Album album) {
        this.album = album;
    }

    /**
     * Obtient la note attribuée par l'utilisateur.
     *
     * @return la note attribuée par l'utilisateur
     */
    public int getNote() {
        return note;
    }

    /**
     * Définit la note attribuée par l'utilisateur.
     *
     * @param note la note attribuée par l'utilisateur
     */
    public void setNote(int note) {
        this.note = note;
    }

    /**
     * Obtient le commentaire laissé par l'utilisateur.
     *
     * @return le commentaire laissé par l'utilisateur
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Définit le commentaire laissé par l'utilisateur.
     *
     * @param commentaire le commentaire laissé par l'utilisateur
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * Obtient la date de l'avis.
     *
     * @return la date de l'avis
     */
    public Date getDate() {
        return date;
    }

    /**
     * Définit la date de l'avis.
     *
     * @param date la date de l'avis
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Retourne une représentation textuelle de l'avis.
     *
     * @return une chaîne de caractères représentant l'avis
     */
    @Override
    public String toString() {
        return "Avis{" +
                "utilisateur=" + utilisateur +
                ", chanson=" + chanson +
                ", album=" + album +
                ", note=" + note +
                ", commentaire='" + commentaire + '\'' +
                ", date=" + date +
                '}';
    }
}
