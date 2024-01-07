class EmployeForfait extends Employe {
    private double montantForfait;

    // Constructeur avec matricule, nom et adresse
    public EmployeForfait(String matricule, String nom, String adresse) {
        super(matricule, nom, adresse);
    }

    // Constructeur avec matricule, nom, adresse et montant forfaitaire
    public EmployeForfait(String matricule, String nom, String adresse, double montantForfait) {
        super(matricule, nom, adresse);
        this.montantForfait = montantForfait;
        setSalaire(montantForfait);
    }
}