import java.util.Scanner;

class job14 {
    public static void main(String[]args) {
        Scanner inp_nombre = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");
        int nombre = inp_nombre.nextInt();
        //Conversion d'un entier à une string pour faciliter l'inversion.
        String nombre_str = Integer.toString(nombre);

        String inversion = ""; //Stocke le nombre inversé
        
        for (int i = 0; i <= nombre_str.length()-1;i++) {
            inversion += nombre_str.charAt(nombre_str.length()-i-1);
            System.out.println(inversion);
        }
    
        System.out.println("L'inverse de " + nombre_str + " est : " + inversion);

        inp_nombre.close();
    }
}