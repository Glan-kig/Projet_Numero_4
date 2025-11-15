import java.time.LocalDate;

public class Journal extends Document {
    public LocalDate date_parution;

    public Journal(String titre, String auteur, int code, int annee_publication, int nombre_exemplaire, String disponibilite, LocalDate date_parution){
        super(titre, auteur, code, annee_publication, nombre_exemplaire, disponibilite);
        this.date_parution = date_parution;
    }

    public void Changer_disponibilite(){
        if (disponibilite == "Rupture de stock"){
            disponibilite = "Disponible";
        }else {
            disponibilite = "Rupture de stock";
        }
    }

    public void information(){
        System.out.println(" Titre du Journal : " + titre + "\n Auteur : " + auteur + "\n Code : " + code +
                "\n Année de Publication : " + annee_publication + "\n Nombre d'exemplaire : " + nombre_exemplaire +
                "\n Disponibilité : " + disponibilite + "\n Date de Parution : " + date_parution + "\n");
    }
}
