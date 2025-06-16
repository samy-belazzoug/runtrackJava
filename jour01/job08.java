import java.util.Scanner;

class job08 {
    public static void main(String[]args) {
        Scanner nombre = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre entier : ");
        long num = nombre.nextInt();
        int somme = 0;
        for (int i = 0; i <= num; i++) {
            somme += i*i*i;
        }
        System.out.println("La somme des n premiers cubes est de : " + somme);
        nombre.close();
    }
}