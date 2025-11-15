public class Document {
    public String titre;
    public String auteur;
    public int code;
    public int annee_publication;
    public int nombre_exemplaire;
    public String disponibilite;

    public Document(String titre, String auteur, int code, int annee_publication, int nombre_exemplaire, String disponibilite){
        this.titre = titre;
        this.auteur = auteur;
        this.code = code;
        this.annee_publication = annee_publication;
        this.nombre_exemplaire = nombre_exemplaire;
        this.disponibilite = disponibilite;
    }
}
