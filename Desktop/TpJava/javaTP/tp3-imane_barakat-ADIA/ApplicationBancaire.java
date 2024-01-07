         /*Applicationbancaire*/


public class ApplicationBancaire {
 public final static int NB_CLIENTS = 4;
 public static void main(String[] args){
 /*(a) Création de l'agence */
 Agence lAgence = new Agence("N 5, Rue banafsej, Hay salam, Agadir");

 /*(b) Création des clients et de leurs comptes*/
 Client[] lesClients = new Client[NB_CLIENTS];
    String nom, prenom, adresse;
     for(int i=0; i<NB_CLIENTS; i++){
         nom = "NOM_"+(i+1);
         prenom = "Prenom_"+(i+1);
         adresse = "Rue N "+(i+1)+", saada "+(i+1);
         lesClients[i] = new Client(lAgence,nom,prenom,adresse);
  }
    for(int i=0; i<lesClients.length; i++)
       lesClients[i].toString();

 /* Client 1 */
  lesClients[0].addCompte (new CompteEpargne(1200, lesClients[0], lAgence, 5.0));
 /* Client 2 */
  lesClients[1].addCompte(new ComptePayant(3500,lesClients[1],lAgence));
 /* Client 3 */
  lesClients[2].addCompte(new ComptePayant(lesClients[2],lAgence));
  lesClients[2].addCompte(new ComptePayant(5000,lesClients[2],lAgence));
 /* Client 4 */
  lesClients[3].addCompte(new CompteEpargne(2000,lesClients[3],lAgence,3.0));
  lesClients[3].addCompte(new ComptePayant(lesClients[3],lAgence));
 /*(c) Déposer de l'argent */
 if(lesClients[0].getCompte(0) != null)
  lesClients[0].getCompte(0).deposer(100);
 else System.out.println("Ce compte n'existe pas !");

 /*(d) Retirer de l'argent */
 if(lesClients[2].getCompte(1) != null)
   lesClients[2].getCompte(1).retirer(200);
 else System.out.println("Ce compte n'existe pas !");
 /*(e) Ajout des clients et de leurs comptes à l'agence */
 for(int i=0; i<NB_CLIENTS; i++){
   lAgence.addClient(lesClients[i]);
 for(int j=0; j<lesClients[i].getNbComptes(); j++){
  lAgence.addCompte(lesClients[i].getCompte(j));
 }
 }
 /*(f) Appliquation de la méthode CalculIntérêt sur tous les comptes
d’épargne */
 for(int i=0; i<Agence.getNbComptes(); i++)
 if(lAgence.getCompte(i) instanceof CompteEpargne)
    ((CompteEpargne)lAgence.getCompte(i)).calculerInteret();

 /*** Affichage ***/
 // Liste des différents clients avec leurs différents comptes
 System.out.println("--- Liste des differents clients avec leursdifferents comptes ---");
   Client client;
 for(int i=0; i<Agence.getNbClients(); i++){
   client = lAgence.getClient(i);
   System.out.println(client.toString());
  for(int j=0; j<client.getNbComptes(); j++)
   System.out.println(client.getCompte(j).toString());
 }

 // Liste des comptes d’épargne de l’agence
  System.out.println("\n--- Liste des comptes d epargne de l agence ---");
  for(int i=0; i<Agence.getNbComptes(); i++)
   if(lAgence.getCompte(i) instanceof CompteEpargne)
      System.out.println(lAgence.getCompte(i).toString());

 // Liste des comptes payants de l’agence
   System.out.println("\n--- Liste des comptes payants de l agence ---");
   for(int i=0; i<Agence.getNbComptes(); i++)
    if(lAgence.getCompte(i) instanceof ComptePayant)
      System.out.println(lAgence.getCompte(i).toString());
  }

}

