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
            "Disponibilité",
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
    System.out.println(" Titre du Livre : " + L1.titre);
    System.out.println(" Disponibilité : " + L1.disponibilite);
    L1.changer_disponibilite();
    L1.information();
    M1.information();
    J1.information();
    Disque1.information();
}