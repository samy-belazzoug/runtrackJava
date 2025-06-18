package runtrackJava.jour02;

public class GestionVehicules {
    public static void main(String[]args) {
        Vehicule gtr = new Vehicule("Mercedes-AMG", "20/08/2020", 180000.567);
        gtr.affiche();  
    }
}

class Vehicule {
    String marque;
    String date_achat;
    double prix_achat;
    double prix_courant;
    public Vehicule(String marque,String date_achat,double prix_achat) {
        this.marque = marque;
        this.date_achat = date_achat;
        this.prix_achat = prix_achat;
    }

    public void affiche() {
        System.out.println("Informations sur le vehicule : ");
        System.out.println("Marque : " + this.marque);
        System.out.println("Acheté le : " + this.date_achat);
        System.out.println("Prix : " + this.prix_achat);
    } 
}

