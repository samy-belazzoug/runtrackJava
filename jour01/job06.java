import java.util.Scanner;

class job05 {
    public static void main(String[]args) {
        Scanner nombre = new Scanner(System.in);
        int moyenne = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nombre " + i + " = ");

            int num = nombre.nextInt();

            moyenne += num;
        }
        
        System.out.println("Moyenne : " + moyenne/5);
        nombre.close();
    }
}