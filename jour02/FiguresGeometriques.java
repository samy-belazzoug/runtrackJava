package runtrackJava.jour02;

public class FiguresGeometriques {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.5, 3.0);
        
        System.out.println("Longueur : " + r.getLongueur());
        System.out.println("Largeur : " + r.getLargeur());
        System.out.println("Surface : " + r.surface());

        r.setLongueur(6.0);
        r.setLargeur(2.0);

        System.out.println("\nAprès modification :");
        System.out.println("Longueur : " + r.getLongueur());
        System.out.println("Largeur : " + r.getLargeur());
        System.out.println("Surface : " + r.surface());
        
    }
}

class Rectangle {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur,double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    public double surface() {
     return largeur*longueur;   
    }
    public double getLongueur(){
        return longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLongueur(double newLongueur) {
        longueur = newLongueur;
    }
    public void setLargeur(double newLargeur) {
        largeur = newLargeur;
    }

}
