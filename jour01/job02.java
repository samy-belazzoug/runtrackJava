import java.util.Scanner;

class job02 {
    public static void main(String[]args) {
        Scanner prenom = new Scanner(System.in);
        System.out.print("Entrez un prénom : ");

        String prenomInput = prenom.nextLine();
        System.out.println("bonjour " + prenomInput);
        prenom.close();
    }
}