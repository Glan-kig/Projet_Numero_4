void main() {
    Livre L1 = new Livre(
            "Life",
            "Gilkay",
            01,
            1985,
            10,
            "Disponible",
            450
    );
    Magazine M1 = new Magazine(
            "M1",
            "Glk",
            02,
            1990,
            15,
            "Rupture de stock",
            01
    );
    Journal J1 = new Journal(
            "J1",
            "JJ",
            03,
            2000,
            20,
            "Disponibilité",
            LocalDate.of(2000, 11, 22)
    );
    Cd_dvd Disque1 = new Cd_dvd(
            "D1",
            "DD",
            04,
            1980,
            15,
            "Disponibilité",
            24.30
    );
    L1.changer_disponibilite();
    System.out.println(" Nombre de page du Livre : " + L1.getNombre_page() + "\n");
    L1.setNombre_page(400);
    L1.information();

    M1.Changer_disponibilite();
    System.out.println(" Numéro d'édition du Magazine : " + M1.getNumero_edition() + "\n");
    M1.setNumero_edition(05);
    M1.information();

    J1.Changer_disponibilite();
    System.out.println(" Date de Parution du Journal : " + J1.getDate_parution() + "\n");
    J1.setDate_parution(LocalDate.of(2002, 03, 16));
    J1.information();

    Disque1.Changer_disponibilite();
    System.out.println(" Durée : " + Disque1.getDuree() + "\n");
    Disque1.setDuree(42.50);
    Disque1.information();
}