import java.util.Scanner;

class job13 {
    public static void main(String[]args) {
        Scanner nombre = new Scanner(System.in);
        System.out.print("Table de : (nb <= 9)");
        int table = nombre.nextInt();
        if (table <= 9) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " x " + table + " = " + i*table);
            }

        }
        else {
            System.out.print("Please type a number <= 9");
        }
        nombre.close();
    }
}