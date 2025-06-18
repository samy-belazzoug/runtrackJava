package runtrackJava.jour02;

public class GestionVehicules {
    public static void main(String[]args) {
        Vehicule gtr = new Vehicule("Mercedes-AMG", "20/08/2020", 180000.567);  

        Voiture merc_gtr = new Voiture("Mercedes-Benz AMG", "20/08/2020", 180000.567, 3999, 3, 585, 13460);
        merc_gtr.affiche();

        Avion boeing_737 = new Avion("Boeing", "13/06/2016", 110000000, "Reaction", 1233555);
        boeing_737.affiche();
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

class Voiture extends Vehicule {
    int cylindree;
    int nombre_portes;
    int puissance;
    double kilometrage;
    public Voiture(String marque, String date_achat, double prix_achat, int cylindree, int nombre_portes, int puissance, int kilometrage) {
        super(marque, date_achat, prix_achat);
        this.marque = marque;
        this.date_achat = date_achat;
        this.prix_achat = prix_achat;
        this.cylindree = cylindree;
        this.nombre_portes = nombre_portes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    public void affiche() {
        System.out.println("Informations sur la voiture : ");
        System.out.println("Marque : " + this.marque);
        System.out.println("Acheté le : " + this.date_achat);
        System.out.println("Prix : " + this.prix_achat);
        System.out.println("Cylindrée : " + this.cylindree);
        System.out.println("Nombre de portes : " + this.nombre_portes);
        System.out.println("Puissance : " + this.puissance);
        System.out.println("Kilométrage actuel : " + this.kilometrage);
    }
}
class Avion extends Vehicule {
    String type_moteur;
    double heures_vol;
    public Avion(String marque, String date_achat, double prix_achat, String type_moteur, double heures_vol) {
        super(marque, date_achat, prix_achat);
        this.type_moteur = type_moteur;
        this.heures_vol = heures_vol;
    }
    public void affiche() {
        System.out.println("Informations sur l'avion : ");
        System.out.println("Marque : " + this.marque);
        System.out.println("Acheté le : " + this.date_achat);
        System.out.println("Prix : " + this.prix_achat);
        System.out.println("Type de moteur : " + this.type_moteur);
        System.out.println("Heures de vol effectuées : " + this.heures_vol);
    }
}
