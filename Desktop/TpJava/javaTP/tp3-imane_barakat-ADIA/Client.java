          /*Client.java*/
public class Client {
 public final static int NB_MAX_COMPTES = 4;
 private int nbComptes = 0;
 private static int nbClients = 0;
 private String code;
 private String nom;
 private String prenom;
 private String adresse;
 private Agence monAgence;
 private Compte[] mesComptes;

 public Client(Agence agence){
    code = this.getClass().getName()+":"+ ++nbClients;
    monAgence = agence;
    mesComptes = new Compte[NB_MAX_COMPTES];
 }
 public Client(Agence agence, String nom, String prenom, String adresse){
    code = this.getClass().getName()+":"+ ++nbClients;
    monAgence = agence;
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    mesComptes = new Compte[NB_MAX_COMPTES];
 }
 public void addCompte(Compte newCompte){
    if(nbComptes < NB_MAX_COMPTES)
       mesComptes[nbComptes++] = newCompte;
 else 
      System.out.println("Erreur");
 }
 public boolean deposer(int numCompte, double som){
     if(numCompte>=0 && numCompte<nbComptes){
           mesComptes[numCompte].deposer(som);
             return true;
    }
     return false;
 }
 public boolean retirer(int numCompte, double som){
 if(numCompte>=0 && numCompte<nbComptes){
       mesComptes[numCompte].retirer(som);
         return true;
    }
     return false;
 }
 public Compte getCompte(int numCompte){
    if(numCompte>=0 && numCompte<nbComptes){
          return mesComptes[numCompte];
  }
    return null;
 }
 public int getNbComptes(){
       return nbComptes;
    }
 public String getCode(){
      return code;
      }
 public String toString() {
 String s = "\n" + "-------------------------------------------------------------------------------\n" +"| "+getCode()+" | "+nom+" | "+prenom+" | @: "+adresse + " |" + "\n-------------------------------------------------------------------------------" ;
   return s;
  }
}