import java.util.Scanner;

class job09 {
    public static void main(String[]args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Votre age ? : ");
        int age_inp = age.nextInt();
        
        if (age_inp < 18) {
            System.out.println("Vous êtes mineur. Minot ah");
        }
        else {
            System.out.println("Vous êtes majeur. Tié grand maintenant toi.");
        }
        age.close();
    }
}