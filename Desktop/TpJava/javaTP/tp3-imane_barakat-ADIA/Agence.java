             /*Agence.java*/
public class Agence {
 public final static int NB_MAX_COMPTES = 80;
 public final static int NB_MAX_CLIENTS = 20;
 private static int nbAgences = 0;
 private static int nbClients = 0;
 private static int nbComptes = 0;
 private String numero;
 private String adresse;
 private Client[] lesClients;
 private Compte[] lesComptes;
 public Agence(String adresse){
     numero = this.getClass().getName()+":"+ ++nbAgences;
     this.adresse = adresse;
     lesClients = new Client[NB_MAX_CLIENTS];
     lesComptes = new Compte[NB_MAX_COMPTES];
 }
 public Compte getCompte(int numCompte) {
     if(numCompte>=0 && numCompte<nbComptes){
         return lesComptes[numCompte];
   }
      return null;
 }
 public void addCompte(Compte newCompte){
    if(nbComptes<NB_MAX_COMPTES) 
        lesComptes[nbComptes++] = newCompte;
  }
 public Client getClient(int numClient) {
   if(numClient>=0 && numClient<nbClients){
       return lesClients[numClient];
 }
     return null;
}

 public void addClient(Client newClient){
 if(nbClients<NB_MAX_CLIENTS) 
     lesClients[nbClients++] = newClient;

 }
 public static int getNbComptes() {

       return nbComptes;
}
 public static int getNbClients() {
     return nbClients;
}

}