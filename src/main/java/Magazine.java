public class Magazine extends Document {
    public int numero_edition;

    public Magazine(String titre, String auteur, int code, int annee_publication, int nombre_exemplaire, String disponibilite, int numero_edition){
        super(titre, auteur, code, annee_publication, nombre_exemplaire, disponibilite);
        this.numero_edition = numero_edition;
    }

    public void Changer_disponibilite(){
        if (disponibilite == "Rupture de stock"){
            disponibilite = "Disponible";
        }else {
            disponibilite = "Rupture de stock";
        }
    }

    public void information(){
        System.out.println(" Titre du Magzine : " + titre + "\n Auteur : " + auteur + "\n Code : " + code +
                "\n Année de Publication : " + annee_publication + "\n Nombre d'exemplaire : " + nombre_exemplaire +
                "\n Disponibilité : " + disponibilite + "\n Numéro d'édition : " + numero_edition + "\n");
    }
}
