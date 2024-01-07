      /*CompteEpargne.java*/


public class CompteEpargne extends Compte {
    private double taux;
     public static int nbComptes = 0; 

    public CompteEpargne(Client leProprietaire, Agence agence, double taux){
        super(leProprietaire, agence);
        this.taux = taux;
        String code = this.getClass().getName() + ":" + (++nbComptes);
        setCode(code);
    }

    public CompteEpargne(double leSolde, Client leProprietaire, Agence agence, double taux){
        super(leSolde, leProprietaire, agence);
        this.taux = taux;
        String code = this.getClass().getName() + ":" + (++nbComptes);
        setCode(code);
    }

    public double getTaux(){
        return taux;
    }

    public void setTaux(double taux){
        this.taux = taux;
    }

    public void calculerInteret(){
        double interet = solde * taux / 100;
         solde += interet;
    }
     public String toString(){
       String s = "\t| "+getCode()+" | Solde: "+solde+" DH | Montant de l'operation:"+taux + " |" +"\n\t-------------------------------------------";
      return s;
 }
}
