public class Employe {
    private String matricule;
    private String nom;
    private String adresse;
    private double salaire;

    // Constructeur avec matricule, nom et adresse
    public Employe(String matricule, String nom, String adresse) {
        this.matricule = matricule;
        this.nom = nom;
        this.adresse = adresse;
    }

    // Constructeur avec matricule, nom, adresse et salaire
    public Employe(String matricule, String nom, String adresse, double salaire) {
        this(matricule, nom, adresse);
        this.salaire = salaire;
    }

    // Méthodes d'accès
    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getSalaire() {
        return salaire;
    }

    // Méthode pour définir le salaire
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}