import java.util.Scanner;

class job05 {
    public static void main(String[]args) {
        int iteration = 1;
        int comparator = 0;
        Scanner nombre = new Scanner(System.in);
        while (iteration <= 3) {
            System.out.print("Nombre " + iteration + " = ");

            int num = nombre.nextInt();
            if (iteration == 0) {
                comparator = num;
            }
            if (num > comparator) {
                comparator = num;
            }
            iteration++;
        }
        nombre.close();
        System.out.println("Parmis les trois nombres, le plus grand est : " + comparator);
    }
}