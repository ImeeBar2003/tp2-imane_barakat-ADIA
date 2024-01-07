class Commercial extends Employe {
    private double sommeFixe;

    // Constructeur avec matricule, nom et adresse
    public Commercial(String matricule, String nom, String adresse) {
        super(matricule, nom, adresse);
    }

    // Constructeur avec matricule, nom, adresse et somme fixe
    public Commercial(String matricule, String nom, String adresse, double sommeFixe) {
        super(matricule, nom, adresse);
        this.sommeFixe = sommeFixe;
        setSalaire(sommeFixe);
    }
}