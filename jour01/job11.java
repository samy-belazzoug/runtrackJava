import java.util.Scanner;

class job10 {
    public static void main(String[]args) {
        Scanner nombre = new Scanner(System.in);
        System.out.print("Saisissez un entier : ");
        int facto = nombre.nextInt();
        int result = 1;
        for (int i = 1; i <= facto; i++) {
            result*=i;
        }
        System.out.println("F("+ facto + ") = " + result);
        nombre.close();
    }
}