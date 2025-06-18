package runtrackJava.jour02;

public class GestionVehicules {
    public static void main(String[]args) {
        Vehicule gtr = new Vehicule("Mercedes-AMG", "20/08/2020", 180000.567);  
        //gtr.calculePrix(2024);
        //gtr.affiche();

        Voiture merc_gtr = new Voiture("Mercedes-benz AMG", "20/08/2020", 180000.567, 3999, 3, 585, 13460);
        //merc_gtr.affiche();
        //merc_gtr.calculePrix(2025);
        Avion boeing_737 = new Avion("Boeing", "13/06/2016", 500000, "Helices", 1100);
        //boeing_737.affiche();
        boeing_737.calculePrix();
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
        System.out.println("Prix neuf : " + this.prix_achat);
        if (this.prix_courant > 0) {
            System.out.println("Cote actuelle : " + this.prix_courant);
        }
        else {
            System.out.println("Veuillez utiliser calculePrix() pour accéder à la cote actuelle du véhicule.");
        }
        
    } 

    public double calculePrix(int anneeActuelle) {
        int anneeVehicule = 0;
        String anneeVehicule_temp = "";
        for (int i = 6; i<= 9;i++) {
            anneeVehicule_temp += this.date_achat.charAt(i);
        }
        anneeVehicule = Integer.valueOf(anneeVehicule_temp);
        double cote = anneeActuelle - anneeVehicule;
        
        double prix = this.prix_achat * (100-cote)/100;
        System.out.println(prix);
        this.prix_courant = prix; 
        return this.prix_courant;
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

    public double calculePrix(int anneeActuelle) {
        int anneeVehicule = 0;
        String anneeVehicule_temp = "";
        for (int i = 6; i<= 9;i++) {
            anneeVehicule_temp += this.date_achat.charAt(i);
        }
        anneeVehicule = Integer.valueOf(anneeVehicule_temp);
        double cote = (anneeActuelle - anneeVehicule)*2;
        double coteAnnuelle = (100-cote)/100;
        double coteKilometrage = ((100-(this.kilometrage/10000))/100); //Pour être honnête je préfère une côte EXACTE du vehicule..
        double coteMarque = 0;
        

        System.out.println(coteAnnuelle);
        System.out.println(coteKilometrage);
        System.out.println(coteMarque);
        
        double cote_totale = 1-(1-coteAnnuelle)-(1-coteKilometrage);
        if (this.marque == "Renault" || this.marque == "Fiat") {
            cote_totale -= 0.1;
        }
        if (this.marque == "Ferrari" || this.marque == "Porsche") {
            cote_totale += 0.20;
        }
        System.out.println("Cote totale estimée : "+ cote_totale);
        double prix = this.prix_achat*cote_totale;

        System.out.println(prix);
        this.prix_courant = prix; 
        return this.prix_courant;
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

    public double calculePrix() {
        double coteHeures = 0;
        if (this.type_moteur == "Helices") {
            coteHeures = 1-(((this.heures_vol/100)*10)/100);
        }
        else {
            coteHeures = 1-(((this.heures_vol/1000)*10)/100);
        }
        System.out.println(coteHeures);
        double prix = prix_achat*coteHeures;
        if (prix < 0) {
            prix = 0;
        }
        System.out.println(prix);
        this.prix_courant = prix; 
        return this.prix_courant;
    }
}