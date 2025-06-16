import java.util.Scanner;

class job12 {
    public static void main(String[]args) {
        Scanner nombre = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier : ");
        int limite = nombre.nextInt();
        System.out.print("Tous les entiers pairs : ");
        for (int i = 1; i <= limite;i++) {
            if (i%2 == 0) {
                System.out.print(i + ", ");
            }
        }    
        nombre.close();
    }
}