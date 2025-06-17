package runtrackJava.jour02;

class Individu {
    public String nom;
    public String prenom;
    protected String date_de_naissance;
    protected String lieu_de_naissance;
    private String adresse;
    private int telephone;

    public static void main(String[]args) {
        Individu personne = new Individu();
        System.out.println(personne);
    }
}