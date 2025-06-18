package runtrackJava.jour02;

public class FiguresGeometriques {
    public static void main(String[] args) {
        Cercle c = new Cercle(4.5, 3.0,5);
        
        c.affiche();
        System.out.println(c.surface());
        
        c.setX(5.0);
        c.setY(4.0);
        c.setRayon(8);
        
        System.out.println("\nAprès modification :");
        
        c.affiche();
        System.out.println(c.surface());
        System.out.println(c.estInterieur(3, 5));
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

class Cercle {
    private double x;
    private double y;
    private double rayon;

    public Cercle(double x,double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }
    
    public void affiche() {
        System.out.println("Coordonnées du Cercle : " + "(" + x + "," + y + ")");
        System.out.println("Rayon du Cercle : " + rayon);
    }

    public double surface() {
     return rayon*Math.PI;
    }

    public boolean estInterieur(double xPoint, double yPoint) {
        return Math.sqrt(Math.pow(xPoint-x,2) + Math.pow(yPoint-y,2)) < rayon; 
    }

    //GETTERS
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRayon() {
        return rayon;
    }

    //SETTERS
    public void setCentre(double newX, double newY) {
        x = newX;
        y = newY;
    }
    public void setX(double newX) {
        x = newX;
    }
    public void setY(double newY) {
        y = newY;
    }
    public void setRayon(double newRayon) {
        rayon = newRayon;
    }

}