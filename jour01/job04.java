import java.util.Scanner;

class job04 {
    public static void main(String[]args) {
        Scanner carre = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");

        int nombre = carre.nextInt();
        System.out.println(nombre + "² = " + nombre*nombre);
    }
}