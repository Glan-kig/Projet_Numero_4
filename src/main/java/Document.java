public class Document {
    protected String titre;
    protected String auteur;
    protected int code;
    protected int annee_publication;
    protected int nombre_exemplaire;
    protected String disponibilite;

    public Document(String titre, String auteur, int code, int annee_publication, int nombre_exemplaire, String disponibilite){
        this.titre = titre;
        this.auteur = auteur;
        this.code = code;
        this.annee_publication = annee_publication;
        this.nombre_exemplaire = nombre_exemplaire;
        this.disponibilite = disponibilite;
    }
}
