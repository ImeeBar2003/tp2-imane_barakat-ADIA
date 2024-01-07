class EmployeHoraire extends Employe {
    private double heuresTravaillees;
    private double tarifHoraire;

    // Constructeur avec matricule, nom et adresse
    public EmployeHoraire(String matricule, String nom, String adresse) {
        super(matricule, nom, adresse);
    }

    // Constructeur avec matricule, nom, adresse, heures travaillées et tarif horaire
    public EmployeHoraire(String matricule, String nom, String adresse, double heuresTravaillees, double tarifHoraire) {
        super(matricule, nom, adresse);
        this.heuresTravaillees = heuresTravaillees;
        this.tarifHoraire = tarifHoraire;
        setSalaire(calculeSalaire());
    }

    // Redéfinition de la méthode setSalaire pour le type d'employé horaire
    @Override
    public void setSalaire(double salaire) {
        this.heuresTravaillees = salaire; // On utilise la variable heuresTravaillees pour stocker le salaire horaire
        super.setSalaire(calculeSalaire());
    }

    // Méthode pour calculer le salaire en fonction des heures travaillées et du tarif horaire
    private double calculeSalaire() {
        return heuresTravaillees * tarifHoraire;
    }
}