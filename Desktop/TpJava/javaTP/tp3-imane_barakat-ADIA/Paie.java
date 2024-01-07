import java.util.Scanner;
public class Paie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'un employé avec le constructeur ne prenant que matricule, nom et adresse
        Employe employe1 = new Employe("EMP1", "IMANE BARAKAT", "123 HEY SALAM");

        // Saisie du salaire pour cet employé
        System.out.print("Entrez le salaire pour " + employe1.getNom() + ": ");
        double salaireEmploye1 = scanner.nextDouble();
        employe1.setSalaire(salaireEmploye1);

        // Création d'un employé horaire avec le constructeur prenant tous les paramètres
        EmployeHoraire employe2 = new EmployeHoraire("EMP1", "IMANE BARAKAT", "456 ESEMARA", 20, 15.0);

        // Création d'un employé forfait avec le constructeur prenant tous les paramètres
        EmployeForfait employe3 = new EmployeForfait("EMP2", "NAOUAL ELHILLALI", "789 SAEADA", 1500.0);

        // Création de trois commerciaux avec le constructeur prenant tous les paramètres
        Commercial commercial1 = new Commercial("EMP3", "NORA LAHSUNI", "111 RBIYEB", 2000.0);
        Commercial commercial2 = new Commercial("EMP$", "NOUHAILA ELRHAZAOUI", "222 ELFARAH", 1800.0);
        Commercial commercial3 = new Commercial("EMP%", "FATIMAEZZAHRA SARMA", "333 ENNARJISS", 2500.0);

        // Ajout des employés à un tableau
        Employe[] tableauEmployes = { employe1, employe2, employe3, commercial1, commercial2, commercial3 };

        // Affichage du salaire hebdomadaire de chaque employé et la masse salariale hebdomadaire
        double masseSalarialeHebdomadaire = 0.0;

        for (Employe employe : tableauEmployes) {
            System.out.println("Salaire hebdomadaire de " + employe.getNom() + ": " + employe.getSalaire());
            masseSalarialeHebdomadaire += employe.getSalaire();
        }

        System.out.println("Masse salariale hebdomadaire: " + masseSalarialeHebdomadaire);

        scanner.close();
    }
}